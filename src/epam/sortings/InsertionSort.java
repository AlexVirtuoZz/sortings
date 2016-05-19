package epam.sortings;

/**
 * Created by alexander on 19.05.16.
 */
public class InsertionSort {
    public static void sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("array is empty");
        }
        for (int i = 1; i < array.length; i++) {
            int first = array[i];
            int j = i - 1;
            while (j >= 0 && first < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = first;
        }
    }
}
