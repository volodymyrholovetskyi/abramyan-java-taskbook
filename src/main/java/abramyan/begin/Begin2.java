package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin2
 * <p>
 * Problem:
 * Given the side of a square a.
 * Find its area:
 * S = a^2
 * <p>
 * Input:
 * One integer value a
 * <p>
 * Output:
 * The area of the square
 * <p>
 * Hint:
 * - Read one input value
 * - Square the value to compute the area
 * <p>
 * Complexity:
 * O(1)
 *
 * @author Volodymyr Holovetskyi
 */

public class Begin2 {

    public static void main(String[] args) {
        int a = nextInt();
        System.out.println(calculateArea(a));
    }

    private static int calculateArea(int a) {
        return a * a;
    }
}
