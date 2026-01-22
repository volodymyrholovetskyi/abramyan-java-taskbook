package abramyan.begin;

import static abramyan.utils.InputReader.nextDouble;

/**
 * Abramyan – Begin34
 *
 * Problem:
 * It is known that:
 * - X kilograms of chocolate candies cost A rubles
 * - Y kilograms of toffee cost B rubles
 *
 * Find:
 * - the cost of 1 kg of chocolate candies
 * - the cost of 1 kg of toffee
 * - how many times chocolate candies are more expensive than toffee
 *
 * Input:
 * Four double values:
 * X, A, Y, B
 *
 * Output:
 * - Cost of 1 kg of chocolate candies
 * - Cost of 1 kg of toffee
 * - Price ratio (chocolate / toffee)
 *
 * Hint:
 * - Calculate unit prices first
 *
 * Complexity:
 * O(1)
 *
 * Author:
 * Your Name
 */
public class Begin34 {

    public static void main(String[] args) {
        double x = nextDouble();
        double a = nextDouble();
        double y = nextDouble();
        double b = nextDouble();

        double priceCandies = calculatePricePerKilogram(x, a);
        double priceToffee = calculatePricePerKilogram(y, b);
        double priceRatio = calculatePriceRatio(priceCandies, priceToffee);

        System.out.println(priceCandies);
        System.out.println(priceToffee);
        System.out.println(priceRatio);
    }

    private static double calculatePricePerKilogram(double x, double a) {
        return a / x;
    }

    private static double calculatePriceRatio(double priceCandies, double priceToffee) {
        return priceCandies / priceToffee;
    }
}
