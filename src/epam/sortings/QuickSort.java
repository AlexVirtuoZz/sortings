package epam.sortings;

/**
 * Created by alexander on 19.05.16.
 */
    public class QuickSort {
        public static void sort(int[] array) {
            if (array == null) {
                throw new IllegalArgumentException("array is empty");
            }
            sort(array, 0, array.length - 1);
        }

        private static void sort(int[] array, int begin, int end) {
            if (begin < end) {
                int index = partition(array, begin, end);
                sort(array, begin, index - 1);
                sort(array, index + 1, end);
            }
        }

        private static int partition(int[] array, int start, int end) {
            int pivot = array[end];
            int i = start - 1;
            int temp = 0;
            for (int j = start; j < end; j++) {
                if (array[j] < pivot) {
                    temp = array[++i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            temp = array[++i];
            array[i] = array[end];
            array[end] = temp;
            return i;
        }
    }

