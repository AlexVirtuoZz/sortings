package epam.sortings;

/**
 * Created by alexander on 19.05.16.
 */
public class MergeSort {
    public static void sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("array is empty");
        }
        int[] tempArray = new int[array.length];
        sort(array, tempArray, 0, array.length);
    }

    private static void sort(int[] array, int[] tempArray, int begin, int end) {
        if (begin < end - 1) {
            int mid = begin + (end - begin) / 2;
            sort(array, tempArray, begin, mid);
            sort(array, tempArray, mid, end);
            merge(array, tempArray, begin, mid, end);
        }
    }

    private static void merge(int[] array, int[] tempArray, int start, int mid, int end) {
        System.arraycopy(array, start, tempArray, start, end - start);
        int j = start;
        int k = mid;
        for (int i = start; i < end; i++) {
            if (j >= mid) {
                array[i] = tempArray[k++];
            } else {
                if (k >= end) {
                    array[i] = tempArray[j++];
                } else {
                    if (tempArray[j] < tempArray[k]) {
                        array[i] = tempArray[j++];
                    } else {
                        array[i] = tempArray[k++];
                    }
                }
            }
        }
    }
}
