package abramyan.begin;

import static abramyan.utils.InputReader.nextDouble;

/**
 * Abramyan – Begin20
 * <p>
 * Problem:
 * Find the distance between two points with coordinates
 * (x1, y1) and (x2, y2) on a plane.
 * Distance is calculated using the formula:
 * sqrt((x2 - x1)^2 + (y2 - y1)^2)
 * <p>
 * Input:
 * Four double values x1, y1, x2, y2
 * <p>
 * Output:
 * Distance between the two points
 * <p>
 * Hint:
 * - Use Math.sqrt
 * - Calculate differences of coordinates
 * <p>
 * Complexity:
 * O(1)
 * <p>
 * Author:
 * Holovetskyi Volodymyr
 */
public class Begin20 {

    public static void main(String[] args) {
        double x1 = nextDouble();
        double y1 = nextDouble();
        double x2 = nextDouble();
        double y2 = nextDouble();

        System.out.println(calculateDistance(x1, y1, x2, y2));
    }

    private static double calculateDistance(double x1, double y1,
                                            double x2, double y2) {
        double dx = Math.abs(x2 - x1);
        double dy = Math.abs(y2 - y1);
        return Math.sqrt((dx * dx) + (dy * dy));
    }
}
