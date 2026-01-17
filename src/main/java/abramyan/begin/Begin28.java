package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin28
 *
 * Problem:
 * Given a number A.
 * Compute A^15 using two auxiliary variables and five multiplication operations.
 * To do this, successively compute:
 * A^2, A^3, A^5, A^10, A^15.
 * Output all found powers of A.
 *
 * Input:
 * One integer value A
 *
 * Output:
 * A^2
 * A^3
 * A^5
 * A^10
 * A^15
 *
 * Hint:
 * - Use intermediate variables
 * - Do not use Math.pow
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Volodymyr Holovetskyi
 */
public class Begin28 {

    public static void main(String[] args) {
        int a = nextInt();

        int a2 = compute(a, a);
        int a3 = compute(a2, a);
        int a5 = compute(a3, a2);
        int a10 = compute(a5, a3);
        int a15 = compute(a10, a5);

        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a5);
        System.out.println(a10);
        System.out.println(a15);
    }

    private static int compute(int prevValue1, int prevValue2) {
        return prevValue1 * prevValue2;
    }
}
