/**
 * Created by COOLib on 24.12.2015.
 */
public class MaxAndMin {

    public int getMaxElement(int[] array) {
        int max = 0;
       while (true) {
           if (array == null) {
               System.out.println("Please enter not null array.");
           } else if (array.length == 0) {
               System.out.println("Please enter array with not null length.");
           } else {
               for (int i = 0; i < array.length; i++) {
                   if (array[0] < array[i]) {
                       array[0] = array[i];
                   }
               }
               break;
           }
       }
        max = array[0];
        return max;
    }

    public int getMinElement(int[] array) {
        int min = 0;
        while (true) {
            if (array == null) {
                System.out.println("Please enter not null array.");
            } else if (array.length == 0) {
                System.out.println("Please enter array with not null length.");
            } else {
                for (int i = 0; i < array.length; i++) {
                    if (array[0] > array[i]) {
                        array[0] = array[i];
                    }
                }
                break;
            }
        }
        min = array[0];
        return min;
    }
}
