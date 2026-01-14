package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin24
 *
 * Problem:
 * Given variables A, B, and C.
 * Change their values by moving:
 * A → C, C → B, B → A.
 * Output the new values of A, B, and C.
 *
 * Input:
 * Three integer values A, B, C
 *
 * Output:
 * New values of A, B, C
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
public class Begin24 {

    public static void main(String[] args) {
        int a = nextInt();
        int b = nextInt();
        int c = nextInt();

        int temp = c;
        c = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
