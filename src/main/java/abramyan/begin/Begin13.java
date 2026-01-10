package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin13
 *
 * Problem:
 * Given two concentric circles with radii R1 and R2 (R1 > R2).
 * Find the areas of the circles and the area of the ring:
 * S1 = π * R1^2
 * S2 = π * R2^2
 * S3 = S1 - S2
 * Use π = 3.14
 *
 * Input:
 * Two integer values R1 and R2 (R1 > R2)
 *
 * Output:
 * - Area of the first circle
 * - Area of the second circle
 * - Area of the ring
 *
 * Hint:
 * - Use a constant value for PI
 * - Calculate both circle areas first
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Your Name
 */
public class Begin13 {

    private static final double PI = 3.14;

    public static void main(String[] args) {
        int r1 = nextInt();
        int r2 = nextInt();

        double s1 = calculateCircleArea(r1);
        double s2 = calculateCircleArea(r2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(calculateRingArea(s1, s2));
    }

    private static double calculateCircleArea(int radius) {
        return PI * radius * radius;
    }

    private static double calculateRingArea(double outerArea, double innerArea) {
        return outerArea - innerArea;
    }
}
