import org.junit.Assert;
import org.junit.BeforeClass;

public class TemperatureTest {

    private static final double celsiusInFahrenheits = 1.8;
    private static final int celsiusZeroInFahrenheit = 32;

    @org.junit.Test
    public void testToFahrenheit() throws Exception {

        final int celsiusDegrees = 20;
        final double resultInFahrenheit = Temperature.toFahrenheit(celsiusDegrees);

        Assert.assertEquals(celsiusDegrees * celsiusInFahrenheits + celsiusZeroInFahrenheit, resultInFahrenheit, 0.01);
    }

    @org.junit.Test
    public void testToCelsius() throws Exception {

        final int fahrenheitDegrees = 20;
        final double resultInCelsius = Temperature.toCelsius(fahrenheitDegrees);

        Assert.assertEquals((fahrenheitDegrees - celsiusZeroInFahrenheit)/celsiusInFahrenheits, resultInCelsius, 0.01);
    }
}