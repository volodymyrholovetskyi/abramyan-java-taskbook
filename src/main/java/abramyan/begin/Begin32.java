package abramyan.begin;

import static abramyan.utils.InputReader.nextDouble;

/**
 * Abramyan – Begin32
 *
 * Problem:
 * Given a temperature T in degrees Celsius.
 * Find the equivalent temperature in degrees Fahrenheit.
 *
 * The relation between Celsius (TC) and Fahrenheit (TF) is:
 * TC = (TF − 32) * 5 / 9
 *
 * Input:
 * One double value T (Celsius)
 *
 * Output:
 * Temperature in Fahrenheit
 *
 * Hint:
 * - Express TF from the given formula
 * - Use double arithmetic
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Your Name
 */
public class Begin32 {

    public static void main(String[] args) {
        double celsius = nextDouble();

        System.out.println(convertCelsiusToFahrenheit(celsius));
    }

    private static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }
}
