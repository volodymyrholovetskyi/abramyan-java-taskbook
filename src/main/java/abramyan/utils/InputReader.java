package abramyan.utils;

import java.util.Scanner;

public class InputReader {

    private static final Scanner SCANNER = new Scanner(System.in);

    private InputReader() {
        throw new UnsupportedOperationException("Unsupported operation");
    }


    public static int nextInt() {
        return SCANNER.nextInt();
    }

    public static double nextDouble() {
        return SCANNER.nextDouble();
    }

}
