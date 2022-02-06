package ulrichbarnstedt.lib.util.terminal;

/**
 * Terminal escape codes for formatting
 */
public class Formatting {
    private Formatting () {}

    public static final String RESET = Codes.ESCAPE + "[0m";

    public static final String FG_BLACK = Codes.ESCAPE + "[30m";
    public static final String FG_RED = Codes.ESCAPE + "[31m";
    public static final String FG_GREEN = Codes.ESCAPE + "[32m";
    public static final String FG_YELLOW = Codes.ESCAPE + "[33m";
    public static final String FG_BLUE = Codes.ESCAPE + "[34m";
    public static final String FG_MAGENTA = Codes.ESCAPE + "[35m";
    public static final String FG_CYAN = Codes.ESCAPE + "[36m";
    public static final String FG_WHITE = Codes.ESCAPE + "[37m";
    public static final String FG_DEFAULT = Codes.ESCAPE + "[39m";

    public static final String BG_BLACK = Codes.ESCAPE + "[40m";
    public static final String BG_RED = Codes.ESCAPE + "[41m";
    public static final String BG_GREEN = Codes.ESCAPE + "[42m";
    public static final String BG_YELLOW = Codes.ESCAPE + "[43m";
    public static final String BG_BLUE = Codes.ESCAPE + "[44m";
    public static final String BG_MAGENTA = Codes.ESCAPE + "[45m";
    public static final String BG_CYAN = Codes.ESCAPE + "[46m";
    public static final String BG_WHITE = Codes.ESCAPE + "[47m";
    public static final String BG_DEFAULT = Codes.ESCAPE + "[49m";

    public static final String SET_BOLD = Codes.ESCAPE + "[1m";
    public static final String NO_BOLD = Codes.ESCAPE + "[22m";
    public static final String SET_DIM = Codes.ESCAPE + "[2m";
    public static final String NO_DIM = Codes.ESCAPE + "[22m";
    public static final String SET_ITALIC = Codes.ESCAPE + "[3m";
    public static final String NO_ITALIC = Codes.ESCAPE + "[23m";
    public static final String SET_UNDERLINE = Codes.ESCAPE + "[4m";
    public static final String NO_UNDERLINE = Codes.ESCAPE + "[24m";
    public static final String SET_BLINK = Codes.ESCAPE + "[5m";
    public static final String NO_BLINK = Codes.ESCAPE + "[25m";
    public static final String SET_INVERSE = Codes.ESCAPE + "[7m";
    public static final String NO_INVERSE = Codes.ESCAPE + "[27m";
    public static final String SET_HIDDEN = Codes.ESCAPE + "[8m";
    public static final String NO_HIDDEN = Codes.ESCAPE + "[28m";
    public static final String SET_STRIKETHROUGH = Codes.ESCAPE + "[9m";
    public static final String NO_STRIKETHROUGH = Codes.ESCAPE + "[29m";

    /**
     * 8-bit color code, lookup index for which code to use
     * @param id ID of the color (see table)
     * @param isFg
     * @return
     */
    public static String c256 (int id, boolean isFg) {
        return Codes.ESCAPE + "[" + (isFg ? 38 : 48) + ";5;" + id + "m";
    }

    public static String trueColor (int r, int g, int b, boolean isFg) {
        return Codes.ESCAPE + "[" + (isFg ? 38 : 48) + ";2;" + r + ";" + g + ";" + b + "m";
    }
}
