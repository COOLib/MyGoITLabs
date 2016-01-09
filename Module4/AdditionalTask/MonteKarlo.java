/**
 * Created by COOLib on 03.01.2016.
 */
public class MonteKarlo {

    public static double countIntegral(double minLimit, double maxLimit, int accuracy) {

        Integral integral = new Integral();
        double sum = integral.f(minLimit);
        double x = minLimit;
        double step = (maxLimit - minLimit) / accuracy;
        for (int i = 0; i < accuracy; i++) {
            x += step;
            sum += integral.f(x);
        }
        double resultIntegral = step * sum;
        return resultIntegral;
    }
}
