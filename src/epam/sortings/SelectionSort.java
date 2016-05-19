package epam.sortings;

/**
 * Created by alexander on 19.05.16.
 */
public class SelectionSort {

    public static void sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("array is empty");
        }
        for (int i = 0; i < array.length - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indexMin]) {
                    indexMin = j;
                }
            }
            int temp = array[i];
            array[i] = array[indexMin];
            array[indexMin] = temp;
        }
    }
}
