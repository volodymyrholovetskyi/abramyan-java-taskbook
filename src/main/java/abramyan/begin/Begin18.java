package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin18
 *
 * Problem:
 * Given three points A, B, and C on a number line.
 * Point C lies between points A and B.
 * Find the product of the lengths of segments AC and BC.
 *
 * Input:
 * Three integer values A, B, and C (C is between A and B)
 *
 * Output:
 * Product of lengths AC and BC
 *
 * Hint:
 * - Calculate segment lengths using absolute value
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Your Name
 */
public class Begin18 {

    public static void main(String[] args) {
        int a = nextInt();
        int b = nextInt();
        int c = nextInt();

        int ac = calculateSegmentLength(a, c);
        int bc = calculateSegmentLength(b, c);

        System.out.println(calculateProduct(ac, bc));
    }

    private static int calculateSegmentLength(int x1, int x2) {
        return Math.abs(x1 - x2);
    }

    private static int calculateProduct(int ac, int bc) {
        return ac * bc;
    }
}
