/**
 * Created by COOLib on 24.12.2015.
 */
public class MaxAndMin {

    public int getMaxElement(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[0] < array[i]) {
                array[0] = array[i];
            }
        }
        max = array[0];
        return max;
    }

    public int getMinElement(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[0] > array[i]) {
                array[0] = array[i];
            }
        }
        min = array[0];
        return min;
    }
}
