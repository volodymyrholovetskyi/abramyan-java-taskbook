package abramyan.begin;

import java.util.Arrays;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin22
 *
 * Problem:
 * Swap the contents of variables A and B
 * and output their new values.
 *
 * Input:
 * Two integer values A and B
 *
 * Output:
 * New values of A and B after swapping
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
public class Begin22 {

    public static void main(String[] args) {
        int a = nextInt();
        int b = nextInt();

        swapAndPrint(a, b);
    }

    private static void swapAndPrint(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }

}
