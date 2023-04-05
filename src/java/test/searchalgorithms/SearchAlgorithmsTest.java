package test.searchalgorithms;

import main.searchalgorithms.SearchAlgorithms;

public class SearchAlgorithmsTest {

    public static void main(String[] args) {
        try {
            testArrayBinarySearch();
            //testIsSorted();
        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
        }
    }

    public void testAll() {
        try {
            testArrayBinarySearch();
            testIsSorted();
        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
        }
    }


    public static void testArrayBinarySearch() {
        SearchAlgorithms searchAlgorithms = new SearchAlgorithms();
        try {
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            System.out.println("Testing arrayBinarySearch method");
            System.out.println("Expecting result 7: got: " + searchAlgorithms.arrayBinarySearch(array, 8));
            array = new int[]{1, 2, 3, 6, 8, 11, 15, 18, 24};
            System.out.println("Expecting result 1: got: " + searchAlgorithms.arrayBinarySearch(array, 2));
            System.out.println("Expecting result -1: got: " + searchAlgorithms.arrayBinarySearch(array, 12));
            array = new int[]{5, 5, 5, 5, 5, 5, 5};
            System.out.println("Expecting result 3: got: " + searchAlgorithms.arrayBinarySearch(array, 5));

            array = new int[]{1, 5, 7, 3, 8};
            searchAlgorithms.arrayBinarySearch(array, 2);
        } catch (Exception e) {
            System.out.println("Expecting result : exception : got: " + e.getMessage());
        }
        try {
            searchAlgorithms.arrayBinarySearch(null, 4);
        } catch (Exception e) {
            System.out.println("Expecting result : exception : got: " + e.getMessage());
        }
    }

    public static void testIsSorted() throws Exception {
        SearchAlgorithms searchAlgorithms = new SearchAlgorithms();

        int[] array = {1, 2, 3, 4, 7, 9, 11};
        System.out.println("Testing isSorted method : ");
        System.out.println("Expected true, got: " + searchAlgorithms.isSorted(array));
        System.out.println("----------------------------------------");
        array = new int[]{5, 3, 2, 8, 10};
        System.out.println("Expected false, got: " + searchAlgorithms.isSorted(array));
        System.out.println("----------------------------------------");
        array = new int[]{};
        System.out.println("Expected true, got: " + searchAlgorithms.isSorted(array));
        array = new int[]{1, 2, 3, 4, 4, 4, 5, 6, 7};
        System.out.println("Expected true, got: " + searchAlgorithms.isSorted(array));
        System.out.println("----------------------------------------");
        try {
            searchAlgorithms.isSorted(array);
        } catch (Exception e) {
            System.out.println("Expected exception, got: " + e.getMessage());
        }
    }


}
