/**
 * Created by COOLib on 21.12.2015.
 */
public class Geometry {

    public double triangleSquare(int height, int base) {
        double triangleSquare = 0.5 * height * base;
        return triangleSquare;
    }

    public double rectangleSquare(double width, double height) {
        double rectangleSquare = width * height;
        return rectangleSquare;
    }

    public double circleSquare(double radius) {
        double circleSquare = Math.PI * radius * radius;
        return circleSquare;
    }
}
