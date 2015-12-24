/**
 * Created by COOLib on 24.12.2015.
 */
public class MaxAndMin {

    public int getMaxElement(int[] array) {

        if (array == null) {

            return Integer.MAX_VALUE;
        } else if (array.length == 0) {

            return Integer.MAX_VALUE;
        } else {
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            return max;
        }
    }

    public int getMinElement(int[] array) {
        int min = 0;
        if (array == null) {
            return Integer.MIN_VALUE;
        } else if (array.length == 0) {
            return Integer.MIN_VALUE;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            return min;
        }
    }
}
