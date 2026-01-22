package abramyan.begin;

import static abramyan.utils.InputReader.nextDouble;

/**
 * Abramyan – Begin37
 */
public class Begin37 {

    public static void main(String[] args) {
        double v1 = nextDouble();
        double v2 = nextDouble();
        double s = nextDouble();
        double t = nextDouble();

        double distance = calculateDistanceAfterTime(s, v1, v2, t);

        System.out.println(distance);
    }

    private static double calculateDistanceAfterTime(double initialDistance,
                                                     double v1, double v2,
                                                     double time) {
        return Math.abs(initialDistance - time * (v1 + v2));
    }
}
