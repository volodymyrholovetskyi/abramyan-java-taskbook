package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin27
 *
 * Problem:
 * Given a number A.
 * Compute A^8 using one auxiliary variable and three multiplication operations.
 * To do this, successively compute:
 * A^2, A^4, A^8.
 * Output all found powers of A.
 *
 * Input:
 * One integer value A
 *
 * Output:
 * A^2
 * A^4
 * A^8
 *
 * Hint:
 * - Use intermediate variables
 * - Do not use Math.pow
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Your Name
 */
public class Begin27 {

    public static void main(String[] args) {
        int a = nextInt();

        int a2 = compute(a);
        int a4 = compute(a2);
        int a8 = compute(a4);

        System.out.println(a2);
        System.out.println(a4);
        System.out.println(a8);
    }

    private static int compute(int a) {
        return a * a;
    }
}
