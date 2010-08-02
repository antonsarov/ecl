package org.eclipse.ecl.parser.test;

import javax.net.ssl.SSLEngineResult.Status;

import junit.framework.TestCase;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.ecl.core.AnyModelObject;
import org.eclipse.ecl.core.CoreFactory;
import org.eclipse.ecl.core.Exec;
import org.eclipse.ecl.core.ExecutableParameter;
import org.eclipse.ecl.core.LiteralParameter;
import org.eclipse.ecl.core.Parallel;
import org.eclipse.ecl.core.Pipeline;
import org.eclipse.ecl.core.Sequence;
import org.eclipse.ecl.core.tests.model.EmitData;
import org.eclipse.ecl.core.tests.model.IsPipeEmpty;
import org.eclipse.ecl.core.tests.model.ModelFactory;
import org.eclipse.ecl.core.tests.model.TestCommand;
import org.eclipse.ecl.runtime.EclRuntime;
import org.eclipse.ecl.runtime.IPipe;
import org.eclipse.ecl.runtime.IProcess;
import org.eclipse.ecl.runtime.ISession;

public class TestCore extends TestCase {

	public final static String PLUGIN_ID = "org.eclipse.ecl.core.tests";

	private final static String TEST_NS = "http://www.eclipse.org/ecl/tests/model.ecore";

	private static int count;

	public static synchronized void inc() {
		count++;
	}

	public static synchronized void reset() {
		count = 0;
	}

	public static synchronized int getCount() {
		return count;
	}

	private TestCommand createTestCommand(String s) {
		TestCommand testCommand = ModelFactory.eINSTANCE.createTestCommand();
		testCommand.setHello(s);
		return testCommand;
	}

	public void testHWCommand() throws Exception {
		ISession session = EclRuntime.createSession();
		IProcess rc = session.execute(createTestCommand("world"), null, null);
		assertEquals("Hello, world", rc.waitFor().getMessage());
	}

	public void testExecSequence() throws Exception {
		ISession session = EclRuntime.createSession();
		reset();
		Sequence seq = CoreFactory.eINSTANCE.createSequence();
		seq.getCommands().add(createTestCommand("1"));
		seq.getCommands().add(createTestCommand("2"));
		seq.getCommands().add(createTestCommand("3"));
		IProcess rc = session.execute(seq, null, null);
		assertEquals("Hello, 3", rc.waitFor().getMessage());
		assertEquals(3, getCount());
	}

	public void testExecParallel() throws Exception {
		ISession session = EclRuntime.createSession();
		reset();
		Parallel seq = CoreFactory.eINSTANCE.createParallel();
		seq.getCommands().add(createTestCommand("1"));
		seq.getCommands().add(ModelFactory.eINSTANCE.createSlowCommand());
		seq.getCommands().add(createTestCommand("3"));
		IProcess rc = session.execute(seq, null, null);
		Thread.sleep(1000);
		assertEquals(2, getCount());
		rc.waitFor();
		assertEquals(3, getCount());
	}

	public void testPipeline() throws Exception {
		ISession session = EclRuntime.createSession();
		Pipeline pipeline = CoreFactory.eINSTANCE.createPipeline();
		pipeline.getCommands().add(
				ModelFactory.eINSTANCE.createIncrementCommand());
		pipeline.getCommands().add(
				ModelFactory.eINSTANCE.createIncrementCommand());
		pipeline.getCommands().add(
				ModelFactory.eINSTANCE.createIncrementCommand());

		IPipe source = session.createPipe();
		IPipe sink = session.createPipe();
		session.execute(pipeline, source, sink);

		source.write(new Integer(42));
		Integer res = (Integer) sink.take(ISession.DEFAULT_TAKE_TIMEOUT);
		assertEquals(45, res.intValue());
	}

	/*
	 * Execute "EmitData 42" via Exec
	 */
	public void testExec1() throws Exception {
		ISession session = EclRuntime.createSession();
		Exec exec = CoreFactory.eINSTANCE.createExec();
		exec.setNamespace(TEST_NS);
		exec.setName("EmitData");
		LiteralParameter param = CoreFactory.eINSTANCE.createLiteralParameter();
		param.setLiteral("42");
		exec.getParameters().add(param);

		IPipe pipe = session.createPipe();
		session.execute(exec, null, pipe);

		Integer res = (Integer) pipe.take(ISession.DEFAULT_TAKE_TIMEOUT);
		assertEquals(42, res.intValue());
	}
	public void testReadFromFinishedCommand() throws Exception {
		ISession session = EclRuntime.createSession();
		Exec exec = CoreFactory.eINSTANCE.createExec();
		exec.setNamespace(TEST_NS);
		exec.setName("EmitEMFData");
		LiteralParameter param = CoreFactory.eINSTANCE.createLiteralParameter();
		param.setLiteral("42");
		exec.getParameters().add(param);

		IProcess process = session.execute(exec, null, null);
		IStatus status = process.waitFor();
		assertTrue(status.isOK());
		IPipe pipe = process.getOutput();
		AnyModelObject res = (AnyModelObject) pipe.take(ISession.DEFAULT_TAKE_TIMEOUT);
		assertEquals(42, ((Integer)res.getJavaObject()).intValue());
	}

	/*
	 * Execute: "EmitData [EmitData 42]" via Exec
	 */
	public void testExec2() throws Exception {
		ISession session = EclRuntime.createSession();

		EmitData subcommand = ModelFactory.eINSTANCE.createEmitData();
		subcommand.setParamInt(42);

		Exec exec = CoreFactory.eINSTANCE.createExec();
		exec.setNamespace(TEST_NS);
		exec.setName("EmitData");
		ExecutableParameter param = CoreFactory.eINSTANCE
				.createExecutableParameter();
		param.setCommand(subcommand);
		exec.getParameters().add(param);

		IPipe pipe = session.createPipe();
		session.execute(exec, null, pipe);

		Integer res = (Integer) pipe.take(ISession.DEFAULT_TAKE_TIMEOUT);
		assertEquals(42, res.intValue());
	}

	public void testIsPipeEmpty() throws Exception {
		ISession session = EclRuntime.createSession();

		Exec exec = CoreFactory.eINSTANCE.createExec();
		exec.setNamespace(TEST_NS);
		exec.setName("IsPipeEmpty");

		IPipe pipe = session.createPipe();
		IProcess p = session.execute(exec, null, pipe); // ??
		assertTrue(p.waitFor().isOK());
		boolean res = (Boolean) pipe.take(ISession.DEFAULT_TAKE_TIMEOUT);
		assertEquals(true, res);
	}

	public void testIsPipeEmpty2() throws Exception {
		ISession session = EclRuntime.createSession();

		IsPipeEmpty command = ModelFactory.eINSTANCE.createIsPipeEmpty();

		Pipeline pipeline = CoreFactory.eINSTANCE.createPipeline();
		pipeline.getCommands().add(command);
		pipeline.getCommands().add(command);

		IPipe pipe = session.createPipe();
		IProcess p = session.execute(pipeline, null, pipe);
		p.waitFor();
		boolean res = (Boolean) pipe.take(ISession.DEFAULT_TAKE_TIMEOUT);
		assertEquals(true, res);
	}

}
