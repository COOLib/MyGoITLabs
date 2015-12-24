/**
 * Created by COOLib on 24.12.2015.
 */
public class MaxAndMin {

    private int[] array;

    public int[] createArray(int length) {
        array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }

    public int getMaxElement(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[0] < array[i]) {
                array[0] = array[i];
            }
        }
        return array[0];
    }

    public int getMinElement(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[0] > array[i]) {
                array[0] = array[i];
            }
        }
        return array[0];
    }
}
