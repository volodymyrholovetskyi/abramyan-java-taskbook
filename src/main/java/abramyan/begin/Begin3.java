package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin3
 * <p>
 * Problem:
 * Given the sides of a rectangle a and b.
 * Find its area and perimeter:
 * S = a * b
 * P = 2 * (a + b)
 * <p>
 * Input:
 * Two integer values a and b
 * <p>
 * Output:
 * The area and the perimeter of the rectangle
 * <p>
 * Hint:
 * - Read two input values
 * - Calculate area first, then perimeter
 * <p>
 * Complexity:
 * O(1)
 * <p>
 *
 * @author Volodymyr Holovetskyi
 */
public class Begin3 {

    public static void main(String[] args) {
        int a = nextInt();
        int b = nextInt();
        System.out.println(calculateArea(a, b));
        System.out.println(calculatePerimeter(a, b));
    }

    public static int calculateArea(int a, int b) {
        return a * b;
    }

    public static int calculatePerimeter(int a, int b) {
        return 2 * (a + b);
    }
}
