/**
 * Created by COOLib on 21.12.2015.
 */
public class Temperature {

    public double toFahrenheit(int degreeInCelsius) {
        return 1.8 * degreeInCelsius + 33.8;
    }

    public double toCelsius(int degreeInFahrenheit) {
        return (degreeInFahrenheit - 32) / 1.8;
    }
}
