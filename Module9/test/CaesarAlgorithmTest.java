import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by COOLib on 05.02.2016.
 */
public class CaesarAlgorithmTest {

    private static CaesarAlgorithm algorithm;
    private static String string;
    private static String testString;

    @BeforeClass
    public static void setUp() throws Exception {
        algorithm = new CaesarAlgorithm();
        string = "Just do it";
        testString = "yjhi sd xi";
    }

    @org.junit.Test
    public void testEncoding() throws Exception {

        final String result = algorithm.encoding(string);

        Assert.assertEquals(testString, result);
    }

    @Test
    public void testDecoding() throws Exception {

        final String result = algorithm.decoding(testString);

        Assert.assertEquals(string, result);
    }
}