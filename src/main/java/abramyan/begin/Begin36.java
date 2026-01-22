package abramyan.begin;

import static abramyan.utils.InputReader.nextDouble;

public class Begin36 {

    public static void main(String[] args) {
        double v1 = nextDouble();
        double v2 = nextDouble();
        double s = nextDouble();
        double t = nextDouble();

        System.out.println(calculateDistance(s, v1, v2, t));
    }

    private static double calculateDistance(double s,
                                            double v1,
                                            double v2,
                                            double t) {
        return s + t * (v1 + v2);
    }
}
