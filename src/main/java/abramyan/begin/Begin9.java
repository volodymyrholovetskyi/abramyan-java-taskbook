package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin9
 *
 * Problem:
 * Given two non-negative numbers a and b.
 * Find their geometric mean:
 * √(a * b)
 *
 * Input:
 * Two non-negative integer values a and b
 *
 * Output:
 * The geometric mean of a and b
 *
 * Hint:
 * - Multiply the numbers
 * - Compute the square root of the product
 * - Use double for the result
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Holovetskyi Volodymyr
 */
public class Begin9 {

    public static void main(String[] args) {
        int a = nextInt();
        int b = nextInt();

        System.out.println(calculateGeometricMean(a, b));
    }

    private static double calculateGeometricMean(int a, int b) {
        return Math.sqrt((double) a * b);
    }
}
