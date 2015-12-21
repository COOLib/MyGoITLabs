/**
 * Created by COOLib on 21.12.2015.
 */
public class Temperature {

    public double toFahrenheit(int degreeInCelsius) {
        double fahrenheit = 1.8 * degreeInCelsius + 33.8;
        return fahrenheit;
    }

    public double toCelsius(int degreeInFahrenheit) {
        double celsius = (degreeInFahrenheit - 32) / 1.8;
        return celsius;
    }
}
