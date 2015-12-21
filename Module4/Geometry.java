/**
 * Created by COOLib on 21.12.2015.
 */
public class Geometry {
    private double triangleSquare;
    private double rectangleSquare;
    private double circleSquare;

    public double triangleSquare(int height, int base){
        triangleSquare = 0.5*height*base;
        return triangleSquare;
    }

    public void showTriangleSquare(){
        System.out.println(triangleSquare);
    }

    public double rectangleSquare(double width, double height){
        rectangleSquare = width*height;
        return rectangleSquare;
    }

    public void showrectangleSquare(){
        System.out.println(rectangleSquare);
    }

    public double circleSquare(double radius){
        circleSquare = Math.PI * radius;
        return circleSquare;
    }

    public void showCircleSquare(){
        System.out.println(circleSquare);
    }
}
