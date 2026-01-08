package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin10
 * <p>
 * Problem:
 * Given two non-zero numbers a and b.
 * Find the sum, difference, product, and quotient of their squares.
 * <p>
 * Input:
 * Two non-zero integer values a and b
 * <p>
 * Output:
 * - Sum of squares
 * - Difference of squares
 * - Product of squares
 * - Quotient of squares
 * <p>
 * Hint:
 * - Square each number first
 * - Perform arithmetic operations on the squares
 * - Pay attention to division and data types
 * <p>
 * Complexity:
 * O(1)
 * <p>
 * Author:
 * Holovetskyi Volodymyr
 */
public class Begin10 {

    public static void main(String[] args) {
        int a = nextInt();
        int b = nextInt();

        System.out.println(sumOfSquares(a, b));
        System.out.println(differenceOfSquares(a, b));
        System.out.println(productOfSquares(a, b));
        System.out.println(quotientOfSquares(a, b));
    }

    private static int sumOfSquares(int a, int b) {
        return square(a) + square(b);
    }

    private static int differenceOfSquares(int a, int b) {
        return square(a) - square(b);
    }

    private static int productOfSquares(int a, int b) {
        return square(a) * square(b);
    }

    private static double quotientOfSquares(int a, int b) {
        return (double) square(a) / square(b);
    }

    private static int square(int x) {
        return x * x;
    }
}
