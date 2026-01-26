package abramyan.series;

import static abramyan.utils.InputReader.nextInt;
import static abramyan.utils.InputReader.nextDouble;

/**
 * Abramyan – Series4
 *
 * Problem:
 * Given an integer N and a sequence of N real numbers.
 * Output the sum and the product of the numbers.
 *
 * Input:
 * Integer N, followed by N double values
 *
 * Output:
 * - Sum of the numbers
 * - Product of the numbers
 *
 * Hint:
 * - Use one loop
 * - Maintain two accumulators
 *
 * Complexity:
 * O(N)
 *
 * Author:
 * Your Name
 */
public class Series4 {
    private static final int COUNT = 10;

    public static void main(String[] args) {
        double sum = calculateSum();
        double product = calculateProduct();

        System.out.println(sum);
        System.out.println(product);
    }

    private static double calculateSum() {
        double result = 0.0;

        for (int i = 0; i < COUNT; i++) {
            double value = nextDouble();
            result += value;
        }

        return result;
    }

    private static double calculateProduct() {
        double result = 1.0;

        for (int i = 0; i < COUNT; i++) {
            double value = nextDouble();
            result *= value;
        }

        return result;
    }
}
