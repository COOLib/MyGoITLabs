/**
 * Created by COOLib on 24.12.2015.
 */
public class QuickMergeInsertion {

    public static int[] quickSorting(int[] array, int start, int end) {
        int i = start;
        int j = end;
        int k = (int) (start + end) / 2;
        int middle = array[k];
        while (i <= j) {
            while (array[i] < middle) {
                i++;
            }
            while (array[j] > middle) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (start < j) {
            quickSorting(array, start, j);
        }
        if (i < end) {
            quickSorting(array, i, end);
        }
        return array;
    }

    public static int[] mergeSorting(int[] array, int start, int end) {
        if (start < end) {
            int k;
            k = (start + end) / 2;
            mergeSorting(array, start, k);
            mergeSorting(array, k + 1, end);
            sort(array, start, k, end);
        }
        return array;
    }

    private static void sort(int[] array, int start, int middle, int end) {
        int i = start;
        int j = middle + 1;
        int k = 0;
        int[] arr = new int[end - start + 1];
        while (i <= middle && j <= end) {
            if (array[i] < array[j]) {
                arr[k] = array[i];
                k++;
                i++;
            } else {
                arr[k] = array[j];
                k++;
                j++;
            }
        }
        while (j <= end) {
            arr[k] = array[j];
            k++;
            j++;
        }
        while (i <= middle) {
            arr[k] = array[i];
            k++;
            i++;
        }
        for (int l = 0; l < end - start + 1; l++) {
            array[start + l] = arr[l];
        }
    }

     public static int[] insertionSorting(int[] array){
         int elem;
         for (int i = 0; i < array.length; i++){
             int j;
             elem = array[i];
             for (j = i - 1; j >= 0 && array[j] > elem; j--){
                 array[j + 1] = array[j];
             }
             array[j + 1] = elem;
         }
         return array;
     }
}
