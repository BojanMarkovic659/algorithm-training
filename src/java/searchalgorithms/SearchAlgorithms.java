package searchalgorithms;

public class SearchAlgorithms {

    public boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public int arrayBinarySearch(int[] array, int element) throws Exception {

        if (!isSorted(array)) {
            throw new Exception("Array is not sorted in ascending order");
        }
        int start = 0;

        while (start <= array.length - 1) {
            int mid = (start + array.length - 1) / 2;
            if (array[mid] == element) {
                return mid;
            }
            if (array[mid] < element) {
                start = mid + 1;
            } else {
                start = mid - 1;
            }
        }
        return -1;
    }
}
