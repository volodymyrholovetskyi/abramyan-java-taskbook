package abramyan.begin;

import static abramyan.utils.InputReader.nextDouble;

/**
 * Abramyan – Begin14
 *
 * Problem:
 * Given the circumference of a circle L.
 * Find its radius R and the area S of the circle.
 * L = 2 * π * R
 * S = π * R^2
 * Use π = 3.14
 *
 * Input:
 * One double value L
 *
 * Output:
 * - Radius of the circle
 * - Area of the circle
 *
 * Hint:
 * - Calculate radius first
 * - Use the radius to calculate the area
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Your Name
 */
public class Begin14 {

    private static final double PI = 3.14;

    public static void main(String[] args) {
        double l = nextDouble();

        double r = calculateRadius(l);
        System.out.println(r);

        System.out.println(calculateArea(r));
    }

    private static double calculateRadius(double length) {
        return length / (2 * PI);
    }

    private static double calculateArea(double radius) {
        return PI * radius * radius;
    }
}
