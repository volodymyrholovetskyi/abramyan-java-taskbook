package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin25
 *
 * Problem:
 * Find the value of the function:
 * y = 3x^6 − 6x^2 − 7
 * for a given value of x.
 *
 * Input:
 * One integer value x
 *
 * Output:
 * Value of y
 *
 * Hint:
 * - Use Math.pow for exponentiation
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Your Name
 */
public class Begin25 {

    public static void main(String[] args) {
        int x = nextInt();

        System.out.println(calculateFunctionValue(x));
    }

    private static double calculateFunctionValue(int x) {
        return 3 * Math.pow(x, 6) - 6 * Math.pow(x, 2) - 7;
    }
}
