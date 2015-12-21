/**
 * Created by COOLib on 21.12.2015.
 */
public class Temperature {
    private  double celsius;
    private  double fahrenheit;

    public double toFahrenheit(int degreeInCelsius){
        fahrenheit = 1.8 * degreeInCelsius + 33.8;
        return fahrenheit;
    }

    public void showConversionToFahrenheit(){
        System.out.println(fahrenheit);
    }

    public double toCelsius(int degreeInFahrenheit){
        celsius = (degreeInFahrenheit - 32)/1.8;
        return celsius;
    }

    public void showConversionToCelsius(){
        System.out.println(celsius);
    }

}
