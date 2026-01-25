package abramyan.series;

import java.util.Scanner;

import static abramyan.utils.InputReader.nextDouble;

/**
 * Abramyan – Series2
 *
 * Problem:
 * Given ten real numbers.
 * Find their product.
 *
 * Input:
 * Ten double values from console
 *
 * Output:
 * Product of the numbers
 *
 * Hint:
 * - Initialize product properly
 * - Use a loop
 *
 * Complexity:
 * O(N), N = 10
 *
 * Author:
 * Your Name
 */
public class Series2 {
    private static final int COUNT = 10;

    public static void main(String[] args) {
        double sum = calculateSum();
        System.out.println(sum);
    }

    private static double calculateSum() {
        double result = 0.0;

        for (int i = 0; i < COUNT; i++) {
            double value = nextDouble();
            result *= value;
        }

        return result;
    }
}
