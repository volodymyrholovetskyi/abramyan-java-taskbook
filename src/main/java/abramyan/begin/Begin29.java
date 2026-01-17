package abramyan.begin;

import static abramyan.utils.InputReader.nextDouble;

/**
 * Abramyan – Begin29
 *
 * Problem:
 * Given an angle α in degrees (0 < α < 360).
 * Find the value of the same angle in radians,
 * given that 180° = π radians.
 * Use π = 3.14.
 *
 * Input:
 * One double value α (degrees)
 *
 * Output:
 * Value of α in radians
 *
 * Hint:
 * - Use the proportion between degrees and radians
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Your Name
 */
public class Begin29 {

    private static final double PI = 3.14;

    public static void main(String[] args) {
        double degrees = nextDouble();

        System.out.println(convertDegreesToRadians(degrees));
    }

    private static double convertDegreesToRadians(double degrees) {
        return degrees * (PI / 180);
    }
}
