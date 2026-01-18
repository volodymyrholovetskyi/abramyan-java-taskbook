package abramyan.begin;

import static abramyan.utils.InputReader.nextDouble;

/**
 * Abramyan – Begin33
 * <p>
 * Problem:
 * It is known that X kilograms of candies cost A hryvnia.
 * Find:
 * - the cost of 1 kilogram of candies
 * - the cost of Y kilograms of the same candies
 * <p>
 * Input:
 * Three double values:
 * X — weight in kilograms
 * A — total cost
 * Y — desired weight
 * <p>
 * Output:
 * - Cost of 1 kg of candies
 * - Cost of Y kg of candies
 * <p>
 * Hint:
 * - First find the price per kilogram
 * <p>
 * Complexity:
 * O(1)
 * <p>
 * Author:
 * Your Name
 */
public class Begin33 {

    public static void main(String[] args) {
        double x = nextDouble();
        double a = nextDouble();
        double y = nextDouble();

        double pricePerKilogram = calculatePricePerKilogram(x, a);
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
