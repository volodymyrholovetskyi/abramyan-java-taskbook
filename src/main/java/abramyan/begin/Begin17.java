package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin17
 *
 * Problem:
 * Given three points A, B, and C on a number line.
 * Find the lengths of segments AC and BC and their sum.
 *
 * Input:
 * Three integer values A, B, and C
 *
 * Output:
 * - Length of segment AC
 * - Length of segment BC
 * - Sum of lengths AC and BC
 *
 * Hint:
 * - Use absolute value to calculate segment lengths
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Your Name
 */
public class Begin17 {

    public static void main(String[] args) {
        int a = nextInt();
        int b = nextInt();
        int c = nextInt();

        int ac = calculateSegmentLength(a, c);
        int bc = calculateSegmentLength(b, c);

        System.out.println(ac);
        System.out.println(bc);
        System.out.println(calculateSum(ac, bc));
    }

    private static int calculateSegmentLength(int x1, int x2) {
        return Math.abs(x1 - x2);
    }

    private static int calculateSum(int ac, int bc) {
        return ac + bc;
    }
}
