package abramyan.begin;

import static abramyan.utils.InputReader.nextDouble;

/**
 * Abramyan – Begin15
 *
 * Problem:
 * Given the area of a circle S.
 * Find its diameter D and the circumference L.
 * L = 2 * π * R
 * S = π * R^2
 * Use π = 3.14
 *
 * Input:
 * One double value S
 *
 * Output:
 * - Diameter of the circle
 * - Circumference of the circle
 *
 * Hint:
 * - Calculate radius from the area
 * - Use the radius to find diameter and circumference
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Your Name
 */
public class Begin15 {

    private static final double PI = 3.14;

    public static void main(String[] args) {
        double s = nextDouble();

        double r = calculateRadius(s);
        double d = calculateDiameter(r);
        double l = calculateCircumference(r);

        System.out.println(d);
        System.out.println(l);
    }

    private static double calculateRadius(double area) {
        return Math.sqrt(area / PI);
    }

    private static double calculateDiameter(double radius) {
        return 2 * radius;
    }

    private static double calculateCircumference(double radius) {
        return 2 * PI * radius;
    }
}
