package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin6
 *
 * Problem:
 * Given the edges of a rectangular parallelepiped a, b, and c.
 * Find its volume and surface area:
 * V = a * b * c
 * S = 2 * (a * b + b * c + a * c)
 *
 * Input:
 * Three integer values a, b, and c
 *
 * Output:
 * The volume and the surface area of the parallelepiped
 *
 * Hint:
 * - Multiply all three values to compute volume
 * - Sum areas of all faces for surface area
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Holovetskyi Volodymyr
 */
public class Begin6 {

    public static void main(String[] args) {
        int a = nextInt();
        int b = nextInt();
        int c = nextInt();

        System.out.println(calculateVolume(a, b, c));
        System.out.println(calculateSurfaceArea(a, b, c));
    }

    private static int calculateVolume(int a, int b, int c) {
        return a * b * c;
    }

    private static int calculateSurfaceArea(int a, int b, int c) {
        return 2 * ((a * b + (b * c) + (a * c)));
    }
}
