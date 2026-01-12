package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin19
 *
 * Problem:
 * Given coordinates of two opposite vertices of a rectangle:
 * (x1, y1) and (x2, y2).
 * The sides of the rectangle are parallel to the coordinate axes.
 * Find the perimeter and the area of the rectangle.
 *
 * Input:
 * Four integer values x1, y1, x2, y2
 *
 * Output:
 * - Perimeter of the rectangle
 * - Area of the rectangle
 *
 * Hint:
 * - Find side lengths using absolute differences
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Your Name
 */
public class Begin19 {

    public static void main(String[] args) {
        int x1 = nextInt();
        int y1 = nextInt();
        int x2 = nextInt();
        int y2 = nextInt();

        int width = calculateSideLength(x1, x2);
        int height = calculateSideLength(y1, y2);

        System.out.println(calculatePerimeter(width, height));
        System.out.println(calculateArea(width, height));
    }

    private static int calculateSideLength(int a, int b) {
        return Math.abs(a - b);
    }

    private static int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }

    private static int calculateArea(int width, int height) {
        return width * height;
    }
}
