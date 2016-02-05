/**
 * Created by COOLib on 21.12.2015.
 */
public class Geometry {

    public double triangleSquare(int height, int base) {
        return 0.5 * height * base;
    }

    public double rectangleSquare(double width, double height) {
        return width * height;
    }

    public double circleSquare(double radius) {
        return Math.PI * radius * radius;
    }
}
