package abramyan.begin;

import static abramyan.utils.InputReader.nextInt;

/**
 * Abramyan – Begin26
 *
 * Problem:
 * Find the value of the function:
 * y = 4(x − 3)^6 − 7(x − 3)^3 + 2
 * for a given value of x.
 *
 * Input:
 * One integer value x
 *
 * Output:
 * Value of y
 *
 * Hint:
 * - Use Math.pow or intermediate variables
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Your Name
 */
public class Begin26 {

    public static void main(String[] args) {
        int x = nextInt();

        System.out.println(calculateFunctionValue(x));
    }

    private static double calculateFunctionValue(int x) {
        return 4 * Math.pow(x - 3, 6) - 7 * Math.pow(x - 3, 3) + 2;
    }
}
