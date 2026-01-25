package abramyan.series;

import java.util.Scanner;

import static abramyan.utils.InputReader.nextDouble;

/**
 * Abramyan – Series3
 *
 * Problem:
 * Given ten real numbers.
 * Find their arithmetic mean.
 *
 * Input:
 * Ten double values from console
 *
 * Output:
 * Arithmetic mean
 *
 * Hint:
 * - First calculate sum
 * - Divide by COUNT
 *
 * Complexity:
 * O(N), N = 10
 *
 * Author:
 * Your Name
 */
public class Series3 {

    private static final int COUNT = 10;

    public static void main(String[] args) {
        double average = calculateAverage();
        System.out.println(average);
    }

    private static double calculateAverage() {
        double result = 0.0;

        for (int i = 0; i < COUNT; i++) {
            double value = nextDouble();
            result += value;
        }
        return result / COUNT;
    }
}
