package searchalgorithms;

public class SearchAlgorithms {

    public boolean isSorted(int[] array) throws Exception {
        if (array == null) {
            throw new Exception("Given array is null");
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }
    public int arrayBinarySearch(int[] array, int element) throws Exception {
        if(array == null){
            throw new Exception("Given array is null");
        }
        if (!isSorted(array)) {
            throw new Exception("Array is not sorted in ascending order");
        }
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == element) {
                return mid;
            }
            if (array[mid] < element) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
