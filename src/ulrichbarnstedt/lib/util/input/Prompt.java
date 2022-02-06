package ulrichbarnstedt.lib.util.input;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Class for prompting user input in a slightly more convenient way
 */
public class Prompt {
    private Scanner scanner;

    /**
     * Read from STDIN
     */
    public Prompt () {
        scanner = new Scanner(System.in);
    }

    /**
     * Read from the specified stream
     * @param in
     */
    public Prompt (InputStream in) {
        scanner = new Scanner(in);
    }

    /**
     * @return Scanner which is used for input
     */
    public Scanner getScanner () {
        return scanner;
    }

    /**
     * Prompt the user for input
     * @param q Prompt message
     * @return Scanner to extract output from
     */
    public Scanner prompt (String q) {
        System.out.print(q + " ");
        return this.scanner;
    }
}