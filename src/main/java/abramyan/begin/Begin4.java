package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin4
 * <p>
 * Problem:
 * Given the diameter of a circle d.
 * Find its circumference:
 * L = π * d
 * Use π = 3.14
 * <p>
 * Input:
 * One integer value d
 * <p>
 * Output:
 * The circumference of the circle
 * <p>
 * Hint:
 * - Define a constant value for PI
 * - Multiply PI by the diameter
 * <p>
 * Complexity:
 * O(1)
 * <p>
 * Author:
 * Your Name
 */
public class Begin4 {

    private static final double PI = 3.14;

    public static void main(String[] args) {
        int d = nextInt();
        System.out.println(calculateCircumference(d));
    }

    private static double calculateCircumference(int d) {
        return PI * d;
    }
}
