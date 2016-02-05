import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import org.junit.Assert;
import org.junit.BeforeClass;

public class GeometryTest {

    private static Geometry geometry;

    @BeforeClass
    public static void setUp() throws Exception {
         geometry = new Geometry();
    }

    @org.junit.Test
    public void testTriangleSquare() throws Exception {

        final int height = 5;
        final int base = 8;
        final double triangleSquare = geometry.triangleSquare(height, base);

        Assert.assertEquals(0.5 * height * base, triangleSquare, 0.01);
    }

    @org.junit.Test
    public void testRectangleSquare() throws Exception {

        final double width = 8;
        final double height = 7;
        final double result = geometry.rectangleSquare(width, height);

        Assert.assertEquals(width * height, result, 0.01);
    }

    @org.junit.Test
    public void testCircleSquare() throws Exception {

        final double radius = 5.5;
        final double result = geometry.circleSquare(radius);

        Assert.assertEquals(Math.PI * radius * radius, result, 0.01);
    }
}