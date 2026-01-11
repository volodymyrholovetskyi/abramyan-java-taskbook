package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin16
 *
 * Problem:
 * Find the distance between two points x1 and x2 on a number line.
 * Distance = |x2 - x1|
 *
 * Input:
 * Two integer values x1 and x2
 *
 * Output:
 * Distance between the two points
 *
 * Hint:
 * - Use absolute value
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Your Name
 */
public class Begin16 {

    public static void main(String[] args) {
        int x1 = nextInt();
        int x2 = nextInt();

        System.out.println(calculateDistance(x1, x2));
    }

    private static int calculateDistance(int x1, int x2) {
        return Math.abs(x1 - x2);
    }
}
