import org.junit.*;
import org.junit.Test;

public class QuickMergeInsertionTest {

    private static int[] array;
    private static int[] array1;
    private static int[] array2;

    @BeforeClass
    public static void setUp() throws Exception {

        array = new int[]{2, 5, -8, 4, 9, 1, -4, 5, 6, 3};
        array1 = new int[]{-1, 0, 8, 9, 3, -4, 5, 7, 5, 7};
        array2 = new int[]{3, 0, 0, 2, 4, 7, 8, -2, 4, 6,};
    }

    @Test
    public void testQuickSorting() throws Exception {

        final int[] testArray = {-8, -4, 1, 2, 3, 4, 5, 5, 6, 9};
        final int[] result = QuickMergeInsertion.quickSorting(array, 0, array.length - 1);
        Assert.assertArrayEquals(testArray, result);
    }


    @Test
    public void testMergeSorting() throws Exception {

        final int[] testArray = {-4, -1, 0, 3, 5, 5, 7, 7, 8, 9};
        final int[] result = QuickMergeInsertion.mergeSorting(array1, 0, array.length - 1);
        Assert.assertArrayEquals(testArray, result);
    }

    @Test
    public void testInsertionSorting() throws Exception {

        final int[] testArray = {-2, 0, 0, 2, 3, 4, 4, 6, 7, 8};
        final int[] result = QuickMergeInsertion.insertionSorting(array2);
        Assert.assertArrayEquals(testArray, result);
    }
}