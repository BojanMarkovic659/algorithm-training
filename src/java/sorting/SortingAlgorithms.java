package sorting;

public class SortingAlgorithms {
    public int[] arrayBubbleSortAscending(int[] array) throws Exception {
        if (array == null) {
            throw new Exception("Array is null.");
        }
        boolean changed = false;
        for (int i = 0; i < array.length - 1; i++) {
            changed = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int pom = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = pom;
                    changed = true;
                }
            }
            if (!changed) {
                return array;
            }
        }

        return array;
    }

    public int[] arrayInsertionSortAscending(int[] array){
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > element) {
                    array[j + 1] = array[j];
                    array[j] = element;
                } else {
                    break;
                }
            }
        }
        return array;
    }

    public void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
