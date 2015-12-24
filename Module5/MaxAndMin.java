/**
 * Created by COOLib on 24.12.2015.
 */
public class MaxAndMin {

    public int getMaxElement(int[] array) {
        int  max = array[0];
        if (array == null) {
            System.out.println("Please, enter not null array.");
        } else if (array.length == 0) {
            System.out.println("Please, enter array with not null length.");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
        }

        return max;
    }

    public int getMinElement(int[] array) {
        int min = array[0];
        if (array == null) {
            System.out.println("Please, enter not null array.");
        } else if (array.length == 0) {
            System.out.println("Please, enter array with not null length.");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
        }
        return min;
    }
}
