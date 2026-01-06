package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin7
 *
 * Problem:
 * Given the radius of a circle R.
 * Find the circumference and the area of the circle:
 * L = 2 * π * R
 * S = π * R^2
 * Use π = 3.14
 *
 * Input:
 * One integer value R
 *
 * Output:
 * The circumference and the area of the circle
 *
 * Hint:
 * - Use a constant value for PI
 * - Calculate circumference first, then area
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Holovetskyi Volodymyr
 */
public class Begin7 {

    private static final double PI = 3.14;

    public static void main(String[] args) {
        int r = nextInt();

        System.out.println(calculateCircumference(r));
        System.out.println(calculateArea(r));
    }

    private static double calculateCircumference(int r) {
        return 2 * PI * r;
    }

    private static double calculateArea(int r) {
        return PI * r * r;
    }
}
