package abramyan.begin;

import static abramyan.utils.InputReader.nextDouble;

/**
 * Abramyan – Begin35
 */
public class Begin35 {

    public static void main(String[] args) {
        double v = nextDouble();   // speed in still water
        double u = nextDouble();   // river current speed
        double t1 = nextDouble();  // time on lake
        double t2 = nextDouble();  // time against current

        double sLake = calculateDistance(v, t1);
        double sRiver = calculateDistance(v - u, t2);

        System.out.println(sLake + sRiver);
    }

    private static double calculateDistance(double speed, double time) {
        return speed * time;
    }
}
