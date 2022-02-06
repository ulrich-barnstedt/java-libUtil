package ulrichbarnstedt.lib.util.terminal;

/**
 * Terminal escape codes for moving the cursor
 */
public class Cursor {
    private Cursor () {}

    public static final String HOME = Codes.ESCAPE + "[H";

    public static String toPos (int x, int y) {
        return Codes.ESCAPE +  "[" + (y + 1) + ";" + (x + 1) + "H";
    }

    public static String up (int count) {
        return Codes.ESCAPE + "["+ count + "A";
    }

    public static String down (int count) {
        return Codes.ESCAPE + "["+ count + "B";
    }

    public static String right (int count) {
        return Codes.ESCAPE + "["+ count + "C";
    }

    public static String left (int count) {
        return Codes.ESCAPE + "["+ count + "D";
    }

    public static String toColumn (int col) {
        return Codes.ESCAPE + "["+ col + "G";
    }
}
