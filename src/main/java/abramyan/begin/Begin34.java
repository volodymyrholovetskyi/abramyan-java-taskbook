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

        // TODO: calculate price per kg of chocolate candies

        // TODO: calculate price per kg of toffee

        // TODO: calculate price ratio

        // TODO: print results
        double pricePerKilogramCandies = calculatePricePerKilogram(x, a);
        double pricePerKilogramToffee = calculatePricePerKilogram(x, a);
        double costForYKilograms = calculateCostForYKilograms(pricePerKilogram, y);

        System.out.println(pricePerKilogram);
        System.out.println(costForYKilograms);
    }

    private static double calculatePricePerKilogram(double x, double a) {
        return a / x;
    }

    private static double calculateCostForYKilograms(double pricePerKilogram, double y) {
        return pricePerKilogram * y;
    }
}
