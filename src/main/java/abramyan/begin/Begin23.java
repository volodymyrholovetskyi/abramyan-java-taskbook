package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin23
 *
 * Problem:
 * Given variables A, B, and C.
 * Change their values by moving:
 * A → B, B → C, C → A.
 * Output the new values of A, B, and C.
 *
 * Input:
 * Three integer values A, B, and C
 *
 * Output:
 * New values of A, B, and C
 *
 * Hint:
 * - Use a temporary variable
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Your Name
 */
public class Begin23 {

    public static void main(String[] args) {
        int a = nextInt();
        int b = nextInt();
        int c = nextInt();

        int temp = a;
        a = c;
        c = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
