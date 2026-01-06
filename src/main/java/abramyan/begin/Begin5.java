package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin5
 *
 * Problem:
 * Given the edge length of a cube a.
 * Find its volume and surface area:
 * V = a^3
 * S = 6 * a^2
 *
 * Input:
 * One integer value a
 *
 * Output:
 * The volume and the surface area of the cube
 *
 * Hint:
 * - Calculate volume using a^3
 * - Calculate surface area using 6 * a^2
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Volodymyr Holovetskyi
 */
public class Begin5 {

    public static void main(String[] args) {
        int a = nextInt();

        System.out.println(calculateVolume(a));
        System.out.println(calculateSurfaceArea(a));
    }

    private static double calculateVolume(int a) {
        return a * a * a;
    }

    private static int calculateSurfaceArea(int a) {
        return 6 * a * a;
    }
}
