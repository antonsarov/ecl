package org.eclipse.ecl.eclsh;


public class EclSyntaxHelper {
	public final static int CMD_VALID = 0;
	public final static int CMD_INVALID = -1;
	public final static int CMD_EMPTY = -2;
	public final static int CMD_REQUIRE_SUBSTITUION_END = 1;
	public final static int CMD_REQUIRE_STRING_END = 2;
	public final static int CMD_REQUIRE_CURLY_STRING_END = 3;

	/**
	 * Check command part and return
	 */
	public int checkCommand(String command) {
		// TODO Command cmd = new EclParser(command).compile();
		// EclError[] errors = collector.getErrors();
		// if (cmd != null && errors.length == 0) {
		// return CMD_VALID;
		// }
		// if (cmd == null) {
		// return CMD_EMPTY;
		// }
		// for (int i = 0; i < errors.length; i++) {
		// if (errors[i].getMessage().contains("expecting '}'")) {
		// return CMD_REQUIRE_CURLY_STRING_END;
		// } else if (errors[i].getMessage().contains("expecting RBRACK")) {
		// return CMD_REQUIRE_SUBSTITUION_END;
		// }
		// }
		// return CMD_INVALID;
		return CMD_VALID;
	}
}
