package org.eclipse.ecl.debug.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.internal.ui.DebugUIMessages;
import org.eclipse.debug.internal.ui.InstructionPointerAnnotation;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.IDebugEditorPresentation;
import org.eclipse.debug.ui.IDebugModelPresentation;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.debug.ui.IValueDetailListener;
import org.eclipse.ecl.debug.model.VariableKind;
import org.eclipse.ecl.internal.debug.core.EclVariable;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.internal.cocoa.SWTImageTextCell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;

@SuppressWarnings("restriction")
public class EclModelPresentation extends LabelProvider implements
		IDebugModelPresentation, IDebugEditorPresentation {

	@Override
	public String getText(Object element) {
		return null;
	}

	@Override
	public Image getImage(Object element) {
		if( element instanceof EclVariable) {
			EclVariable var = (EclVariable) element;
			VariableKind kind = var.getVariableKind();
			switch(kind) {
			case ARGUMENT:
				return Images.getImage(Images.LOCAL_VARIABLE);
			case COMMAND:
				return Images.getImage(Images.REFERENCE);
			case OBJECT:
				return Images.getImage(Images.OBJECT);
			case VARIABLE:
				return Images.getImage(Images.VARIABLE);
			case REFERENCE:
				return Images.getImage(Images.REFERENCE);
			case FIELD:
				return Images.getImage(Images.FIELD);
			case LOCAL:
				return Images.getImage(Images.LOCAL_VARIABLE);
			}
		}
		return null;
	}

	public void setAttribute(String attribute, Object value) {
	}

	public void computeDetail(IValue value, IValueDetailListener listener) {
		String detail = "";
		try {
			detail = value.getValueString();
		} catch (DebugException e) {
		}
		listener.detailComputed(value, detail);
	}

	public IEditorInput getEditorInput(Object element) {
		if (element instanceof IFile) {
			return new FileEditorInput((IFile) element);
		}
		if (element instanceof ILineBreakpoint) {
			return new FileEditorInput((IFile) ((ILineBreakpoint) element)
					.getMarker().getResource());
		}
		return null;
	}

	public String getEditorId(IEditorInput input, Object element) {
		if (element instanceof IFile) {
			return getDefaultEditor((IFile) element);
		}
		if (element instanceof ILineBreakpoint) {
			IResource resource = ((ILineBreakpoint) element).getMarker().getResource();
			if (resource instanceof IFile) {
				return getDefaultEditor((IFile) resource);
			}
		}
		if (input instanceof FileEditorInput) {
			IFile file = ((FileEditorInput) input).getFile();
			if (file != null) {
				return getDefaultEditor(file);
			}
		}
		return null;
	}

	private String getDefaultEditor(IFile resource) {
		IEditorDescriptor descriptor = IDE.getDefaultEditor(resource);
		if (descriptor != null) {
			return descriptor.getId();
		}
		return "org.eclipse.ui.DefaultTextEditor";
	}

	public boolean addAnnotations(IEditorPart editorPart, IStackFrame frame) {
		if (frame.isTerminated()) {
			return false;
		}
		ISourceViewer viewer = getViewer(editorPart);
		if (viewer != null) {
			IAnnotationModel model = viewer.getAnnotationModel();
			if (model != null) {
				removeDebugAnnotations(model);
				try {
					IRegion region = viewer.getDocument().getLineInformation(
							frame.getLineNumber() - 1);
					int offset = region.getOffset();// + frame.getCharStart()
													// -1;
					int length = region.getLength();// + frame.getCharEnd() - 1;

					Annotation annotation = getInstructionPointerAnnotation(frame);
					model.addAnnotation(annotation,
							new Position(offset, length));
					return true;
				} catch (Exception e) {
					EclDebugUIPlugin.log(e);
					return false;
				}
			}
		}
		return false;
	}

	private static Annotation getInstructionPointerAnnotation(IStackFrame frame) {
		String id = null;
		Image image = null;
		String text = null;

		IThread thread = frame.getThread();
		IStackFrame tos = null;
		boolean top = false;
		try {
			tos = thread.getTopStackFrame();
			top = frame.equals(tos);
		} catch (DebugException de) {
		}

		if (top) {
			id = IDebugUIConstants.ANNOTATION_TYPE_INSTRUCTION_POINTER_CURRENT;
		} else {
			id = IDebugUIConstants.ANNOTATION_TYPE_INSTRUCTION_POINTER_SECONDARY;
		}

		if (top) {
			text = DebugUIMessages.InstructionPointerAnnotation_0;
		} else {
			text = DebugUIMessages.InstructionPointerAnnotation_1;
		}

		if (top) {
			image = DebugUITools
					.getImage(IDebugUIConstants.IMG_OBJS_INSTRUCTION_POINTER_TOP);
		} else {
			image = DebugUITools
					.getImage(IDebugUIConstants.IMG_OBJS_INSTRUCTION_POINTER);
		}

		return new InstructionPointerAnnotation(frame, id, text, image);
	}

	public void removeAnnotations(IEditorPart editorPart, IThread thread) {
		ISourceViewer viewer = getViewer(editorPart);
		if (viewer != null) {
			IAnnotationModel model = viewer.getAnnotationModel();
			if (model != null) {
				removeDebugAnnotations(model);
			}
		}
	}

	private void removeDebugAnnotations(IAnnotationModel model) {
		List<Annotation> annotations = new ArrayList<Annotation>();
		Iterator<?> it = model.getAnnotationIterator();
		while (it.hasNext()) {
			Annotation annotation = (Annotation) it.next();
			if (IDebugUIConstants.ANNOTATION_TYPE_INSTRUCTION_POINTER_CURRENT
					.equals(annotation.getType())) {
				annotations.add(annotation);
			}
			if (IDebugUIConstants.ANNOTATION_TYPE_INSTRUCTION_POINTER_SECONDARY
					.equals(annotation.getType())) {
				annotations.add(annotation);
			}
		}
		for (Annotation annotation : annotations) {
			model.removeAnnotation(annotation);
		}
	}

	private ISourceViewer getViewer(IEditorPart part) {
		return (ISourceViewer) part.getAdapter(ISourceViewer.class);
	}
}
