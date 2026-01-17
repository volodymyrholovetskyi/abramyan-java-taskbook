package abramyan.begin;

import static abramyan.utils.InputReader.nextDouble;

/**
 * Abramyan – Begin30
 *
 * Problem:
 * Given an angle α in radians (0 < α < 2π).
 * Find the value of the same angle in degrees,
 * given that 180° = π radians.
 * Use π = 3.14.
 *
 * Input:
 * One double value α (radians)
 *
 * Output:
 * Value of α in degrees
 *
 * Hint:
 * - Use the proportion between radians and degrees
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Your Name
 */
public class Begin30 {

    private static final double PI = 3.14;

    public static void main(String[] args) {
        double radians = nextDouble();

        System.out.println(convertDegreesToRadians(radians));
    }

    private static double convertDegreesToRadians(double radians) {
        return radians * (180 / PI);
    }
}
