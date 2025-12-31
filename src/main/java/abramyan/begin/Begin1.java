package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin1
 * <p>
 * Problem:
 * Given the side of a square a.
 * Find its perimeter:
 * P = 4 * a
 * <p>
 * Input:
 * One real number a
 * <p>
 * Output:
 * The perimeter of the square
 * <p>
 * Hint:
 * - Read one value from input
 * - Use the perimeter formula for a square
 * <p>
 * Complexity:
 * O(1)
 *
 * @author Volodymyr Holovetskyi
 */

public class Begin1 {

    public static void main(String[] args) {
        int a = nextInt();
        System.out.println(calculatePerimeter(a));
    }

    public static int calculatePerimeter(int a) {
        return 4 * a;
    }
}
