package test.sorting;

import main.sorting.SortingAlgorithms;

public class SortingAlgorithmsTest {

    public static void main(String[] args) {
        try {
            testArrayBubbleSortAscending();
            testArrayInsertionSortAscending();
        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
        }
    }

    public void testAll() {
        try {
            testArrayBubbleSortAscending();
            testArrayInsertionSortAscending();
        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
        }
    }

    public static void testArrayBubbleSortAscending() throws Exception {
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
        int[] array = {6, 3, 7, 2, 10, 9};
        System.out.println("Array before method call: ");
        sortingAlgorithms.display(array);
        int[] sortedArray = sortingAlgorithms.arrayBubbleSortAscending(array);
        System.out.println("Array after method call: ");
        sortingAlgorithms.display(sortedArray);
        System.out.println("---------------------------------------");
        System.out.println("When all items are the same: ");
        array = new int[]{2, 2, 2, 2, 2};
        sortingAlgorithms.arrayBubbleSortAscending(array);
        sortingAlgorithms.display(array);
        System.out.println("---------------------------------------");
        System.out.println("When array is empty: ");
        array = new int[]{};
        sortingAlgorithms.arrayBubbleSortAscending(array);
        sortingAlgorithms.display(array);
        System.out.println("---------------------------------------");
        array = new int[]{2, 5, 8, 10, 15, 20};
        System.out.println("When array is sorted ascending order: ");
        sortingAlgorithms.arrayBubbleSortAscending(array);
        sortingAlgorithms.display(array);
        System.out.println("---------------------------------------");
        array = new int[]{15, 11, 9, 7, 4, 1};
        System.out.println("When array is sorted descending order: ");
        sortingAlgorithms.arrayBubbleSortAscending(array);
        sortingAlgorithms.display(array);
        System.out.println("---------------------------------------");
        System.out.println("When array is null: ");
        try {
            array = null;
            sortingAlgorithms.arrayBubbleSortAscending(array);
            sortingAlgorithms.display(array);
        } catch (Exception e) {
            System.out.println("Expecting result : exception , got: " + e.getMessage());
        }
    }

    public static void testArrayInsertionSortAscending() throws Exception {
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
        int[] array = {2, 7, 5, 4, 10, 8};
        System.out.println("Array before method call: ");
        sortingAlgorithms.display(array);
        int[] sortedArray = sortingAlgorithms.arrayInsertionSortAscending(array);
        System.out.println("Array after method call: ");
        sortingAlgorithms.display(sortedArray);
        System.out.println("---------------------------------------");
        System.out.println("When all items are the same: ");
        array = new int[]{2, 2, 2, 2, 2};
        sortingAlgorithms.arrayInsertionSortAscending(array);
        sortingAlgorithms.display(array);
        System.out.println("---------------------------------------");
        System.out.println("When two items are the same: ");
        array = new int[]{2, 10, 4, 3, 11, 4};
        sortingAlgorithms.arrayInsertionSortAscending(array);
        sortingAlgorithms.display(array);
        System.out.println("---------------------------------------");
        System.out.println("When array is empty: ");
        array = new int[]{};
        sortingAlgorithms.arrayInsertionSortAscending(array);
        sortingAlgorithms.display(array);
        System.out.println("---------------------------------------");
        System.out.println("When array is sorted ascending order: ");
        array = new int[]{2, 6, 7, 9, 12, 16};
        sortingAlgorithms.arrayInsertionSortAscending(array);
        sortingAlgorithms.display(array);
        System.out.println("---------------------------------------");
        System.out.println("When array is sorted descending order: ");
        array = new int[]{18, 11, 10, 5, 3, 1};
        sortingAlgorithms.arrayInsertionSortAscending(array);
        sortingAlgorithms.display(array);
        try {
            array = null;
            sortingAlgorithms.arrayInsertionSortAscending(array);
            sortingAlgorithms.display(array);
        } catch (Exception e) {
            System.out.println("Expecting result : exception : got : " + e.getMessage());
        }
    }
}
