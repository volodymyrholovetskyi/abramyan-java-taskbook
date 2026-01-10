package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin12
 *
 * Problem:
 * Given the legs of a right triangle a and b.
 * Find its hypotenuse c and perimeter P:
 * c = sqrt(a^2 + b^2)
 * P = a + b + c
 *
 * Input:
 * Two positive integer values a and b
 *
 * Output:
 * The hypotenuse and the perimeter of the triangle
 *
 * Hint:
 * - Use the Pythagorean theorem
 * - Use double for calculations
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Your Name
 */
public class Begin12 {

    public static void main(String[] args) {
        int a = nextInt();
        int b = nextInt();

        double c = calculateHypotenuse(a, b);
        System.out.println(c);
        System.out.println(calculatePerimeter(a, b, c));
    }

    private static double calculateHypotenuse(int a, int b) {
        return Math.sqrt(a * a + b * b);
    }

    private static double calculatePerimeter(int a, int b, double c) {
        return a + b + c;
    }
}
