package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin11
 * <p>
 * Problem:
 * Given two non-zero numbers a and b.
 * Find the sum, difference, product, and quotient of their absolute values.
 * <p>
 * Input:
 * Two non-zero integer values a and b
 * <p>
 * Output:
 * - Sum of |a| and |b|
 * - Difference of |a| and |b|
 * - Product of |a| and |b|
 * - Quotient of |a| and |b|
 * <p>
 * Hint:
 * - Use absolute values
 * - Pay attention to division and data types
 * <p>
 * Complexity:
 * O(1)
 * <p>
 * Author:
 * Holovetskyi Volodymyr
 */
public class Begin11 {

    public static void main(String[] args) {
        int a = nextInt();
        int b = nextInt();

        System.out.println(sum(a, b));
        System.out.println(difference(a, b));
        System.out.println(product(a, b));
        System.out.println(quotient(a, b));
    }

    private static int absoluteValue(int x) {
        return Math.abs(x);
    }

    private static int sum(int a, int b) {
        return absoluteValue(a) + absoluteValue(b);
    }

    private static int difference(int a, int b) {
        return absoluteValue(a) - absoluteValue(b);
    }

    private static int product(int a, int b) {
        return absoluteValue(a) * absoluteValue(b);
    }

    private static double quotient(int a, int b) {
        return (double) absoluteValue(a) / absoluteValue(b);
    }
}
