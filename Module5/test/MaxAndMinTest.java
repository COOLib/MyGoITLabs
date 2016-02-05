import org.junit.*;
import org.junit.Test;

public class MaxAndMinTest {

    private static int[] array = {1, 2, -3, 8, 9, -5, 3, 1, 7};

    @Test
    public void testGetMaxElement() throws Exception {

        final int maxElement = 9;
        final int result = MaxAndMin.getMaxElement(array);

        Assert.assertEquals(maxElement, result);
    }

    @Test
    public void testGetMinElement() throws Exception {

        final int minElement = -5;
        final int result = MaxAndMin.getMinElement(array);

        Assert.assertEquals(minElement, result);
    }
}