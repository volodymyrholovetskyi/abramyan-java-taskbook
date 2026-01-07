package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin8
 *
 * Problem:
 * Given two numbers a and b.
 * Find their arithmetic mean:
 * (a + b) / 2
 *
 * Input:
 * Two integer values a and b
 *
 * Output:
 * The arithmetic mean of a and b
 *
 * Hint:
 * - Add the two numbers
 * - Divide the result by 2
 * - Pay attention to data types
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Your Name
 */
public class Begin8 {

    public static void main(String[] args) {
        int a = nextInt();
        int b = nextInt();

        System.out.println(calculateArithmeticMean(a, b));
    }

    private static double calculateArithmeticMean(int a, int b) {
        return (a + b) / 2.0;
    }
}
