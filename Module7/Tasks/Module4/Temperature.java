/**
 * Created by COOLib on 21.12.2015.
 */
public class Temperature {

	//Here, Anti-pattern Magic Number(Example: 1.8, 32)

    public double toFahrenheit(int degreeInCelsius) {
        return 1.8 * degreeInCelsius + 32;
    }

    public double toCelsius(int degreeInFahrenheit) {
        return (degreeInFahrenheit - 32) / 1.8;
    }
}
