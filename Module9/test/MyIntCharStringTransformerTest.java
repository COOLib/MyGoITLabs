import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyIntCharStringTransformerTest {

    private static MyIntCharStringTransformer intCharStringTransformer;
    private static String string;
    private static char[] chars;
    private static int[] upAndLowCases;
    private static int[] ints;

    @BeforeClass
    public static void setUp() throws Exception {

        intCharStringTransformer = new MyIntCharStringTransformer();
        string = "MyIntCharStringTransformer";
        chars = string.toCharArray();
        upAndLowCases = new int[] {1, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

         ints = new int[string.length()];

        for (int i = 0; i < ints.length; i++){
            if (upAndLowCases[i] == 1){
                ints[i] = (int) chars[i] - (int) 'A';
            }
            else if (upAndLowCases[i] == 2) {
                ints[i] = (int) chars[i] - (int) 'a';
            }
            else {
                ints[i] = (int) chars[i];
            }
        }
    }

    @Test
    public void testGetUpperCases() throws Exception {

        final int[] result = intCharStringTransformer.getUpperCases(chars);
        Assert.assertArrayEquals(upAndLowCases, result);
    }

    @Test
    public void testCharsToInts() throws Exception {

        final int[] result = intCharStringTransformer.charsToInts(chars);
        Assert.assertArrayEquals(ints, result);
    }

    @Test
    public void testIntsTochars() throws Exception {

        final int[] myCases = intCharStringTransformer.getUpperCases(chars);
        final char[] result = intCharStringTransformer.intsTochars(ints);
        Assert.assertArrayEquals(chars, result);
    }

    @Test
    public void testMakeString() throws Exception {

        final String result = intCharStringTransformer.makeString(chars);
        Assert.assertEquals(string, result);
    }
}