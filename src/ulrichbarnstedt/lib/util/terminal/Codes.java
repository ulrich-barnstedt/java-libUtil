package ulrichbarnstedt.lib.util.terminal;

/**
 * Terminal escape codes
 */
public class Codes {
    private Codes () {}

    public static final String ESCAPE = "\033";

    public static final String CLEAR_SCREEN = ESCAPE + "[2J";
    public static final String CLEAR_LINE = ESCAPE + "[2K";
    public static final String BELL = "\007";
    public static final String BACKSPACE = "\010";
    public static final String TAB = "\011";
    public static final String LINEFEED = "\012";
    public static final String VERTICAL_TAB = "\013";
    public static final String FORMFEED = "\014";
    public static final String CARRIAGE_RETURN = "\015";
    public static final String DELETE = "\177";
}
