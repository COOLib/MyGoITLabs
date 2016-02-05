/**
 * Created by COOLib on 21.12.2015.
 */
public class Temperature {

    private static double celsiusInFahrenheits = 1.8;
    private static  int celsiusZeroInFahrenheit = 32;

    public static double toFahrenheit(int degreeInCelsius) {

        return celsiusInFahrenheits * degreeInCelsius + celsiusZeroInFahrenheit;
    }

    public static double toCelsius(int degreeInFahrenheit) {

        return (degreeInFahrenheit - celsiusZeroInFahrenheit) / celsiusInFahrenheits;
    }
}
