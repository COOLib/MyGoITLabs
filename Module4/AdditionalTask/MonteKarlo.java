/**
 * Created by COOLib on 03.01.2016.
 */
public class MonteKarlo {

    public static double countIntegral(double minLimit, double maxLimit, int accuracy) {
        double sum = f(minLimit);
        double x = minLimit;
        double step = (maxLimit - minLimit) / accuracy;
        for (int i = 0; i < accuracy; i++) {
            x += step;
            sum += f(x);
        }
        double integral = step * sum;
        return integral;
    }

    public static double f(double x) {
        double y = 7 * x + Math.pow(x, 3) + Math.pow(2, x);
        return y;
    }
}
