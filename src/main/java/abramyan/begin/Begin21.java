package abramyan.begin;

import static abramyan.utils.InputReader.nextDouble;

/**
 * Abramyan – Begin21
 * <p>
 * Problem:
 * Given coordinates of three vertices of a triangle:
 * (x1, y1), (x2, y2), (x3, y3).
 * Find its perimeter and area.
 * <p>
 * To calculate side lengths, use the distance formula
 * from Begin20.
 * <p>
 * To calculate the area, use Heron's formula:
 * S = sqrt(p * (p - a) * (p - b) * (p - c)),
 * where p is the semi-perimeter.
 * <p>
 * Input:
 * Six double values x1, y1, x2, y2, x3, y3
 * <p>
 * Output:
 * - Perimeter of the triangle
 * - Area of the triangle
 * <p>
 * Hint:
 * - Calculate all three side lengths first
 * - Use Heron's formula for the area
 * <p>
 * Complexity:
 * O(1)
 * <p>
 * Author:
 * Your Name
 */
public class Begin21 {

    public static void main(String[] args) {
        double x1 = nextDouble();
        double y1 = nextDouble();
        double x2 = nextDouble();
        double y2 = nextDouble();
        double x3 = nextDouble();
        double y3 = nextDouble();

        double a = calculateSideLength(x1, y1, x2, y2);
        double b = calculateSideLength(x2, y2, x3, y3);
        double c = calculateSideLength(x1, y1, x3, y3);

        double perimeter = calculatePerimeter(a, b, c);
        double semiPerimeter = calculateSemiPerimeter(perimeter);

        System.out.println(perimeter);
        System.out.println(calculateArea(semiPerimeter, a, b, c));
    }

    private static double calculateSideLength(double x1, double y1,
                                              double x2, double y2) {
        double dx = Math.abs(x2 - x1);
        double dy = Math.abs(y2 - y1);
        return Math.sqrt((dx * dx) + (dy * dy));
    }

    private static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    private static double calculateSemiPerimeter(double p) {
        return p / 2;
    }

    private static double calculateArea(double p, double a, double b, double c) {
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
