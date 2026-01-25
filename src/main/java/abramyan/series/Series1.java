package abramyan.series;

import static abramyan.utils.InputReader.nextDouble;

/**
 * Abramyan – Series1
 * <p>
 * Problem:
 * Given ten real numbers.
 * Find their sum.
 * <p>
 * Input:
 * Ten double values from console
 * <p>
 * Output:
 * Sum of the numbers
 * <p>
 * Hint:
 * - Use a loop
 * - Accumulate the sum
 * <p>
 * Complexity:
 * O(N), N = 10
 * <p>
 * Author:
 * Your Name
 */
public class Series1 {
    private static final int COUNT = 10;

    public static void main(String[] args) {
        double sum = calculateSum();
        System.out.println(sum);
    }

    private static double calculateSum() {
        double result = 0.0;

        for (int i = 0; i < COUNT; i++) {
            double value = nextDouble();
            result += value;
        }

        return result;
    }
}
