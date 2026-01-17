package abramyan.begin;

import static abramyan.utils.InputReader.nextDouble;

/**
 * Abramyan – Begin31
 *
 * Problem:
 * Given a temperature T in degrees Fahrenheit.
 * Find the equivalent temperature in degrees Celsius.
 *
 * The relation between Celsius (TC) and Fahrenheit (TF) is:
 * TC = (TF − 32) * 5 / 9
 *
 * Input:
 * One double value T (Fahrenheit)
 *
 * Output:
 * Temperature in Celsius
 *
 * Hint:
 * - Be careful with division (use double arithmetic)
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Your Name
 */
public class Begin31 {

    public static void main(String[] args) {
        double fahrenheit = nextDouble();

        System.out.println(convertFahrenheitToCelsius(fahrenheit));
    }

    private static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
