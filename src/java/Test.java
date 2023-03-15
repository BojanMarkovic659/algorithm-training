import definitions.IStack;
import definitions.IStackGenerics;
import dynamicstructures.SinglyLinkedList;
import sorting.SortingAlgorithms;
import searchalgorithms.SearchAlgorithms;
import staticstructures.StaticStack;
import staticstructures.StaticStackGenerics;

public class Test {

    public static void main(String[] args) {
        try {
            //testStaticStack();
            //testRemoveDuplicatesSortedList();
            //testRemoveDuplicatesUnsortedList();
            //testIsSorted();
            //testArrayBinarySearch();
            //testArrayInsertionSortAscending();
            //testIsPalindrome();
            //testArrayBubbleSortAscending();
            //testFindMiddle();
            testStaticStackGenerics();
        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
        }

    }

    public static void testStaticStack() throws Exception {
        IStack stack = new StaticStack(10);
        System.out.println("Testing push method");
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(11);
        stack.display();
        System.out.println("---------------------------------------------");
        System.out.println("Testing pop method");
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println("---------------------------------------------");
        System.out.println("Testing peek method");
        System.out.println("First element: " + stack.peek());
        System.out.println("---------------------------------------------");
        System.out.println("Testing size method");
        System.out.println("Stack size " + stack.size());
        System.out.println("---------------------------------------------");
        System.out.println("Testing count method");
        System.out.println("Number of elements " + stack.count());

    }

    public static void testRemoveDuplicatesSortedList() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        System.out.println("Testing addElement method");
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(5);
        singlyLinkedList.displayList();
        System.out.println("---------------------------------------------");
        System.out.println("Testing removeAll method");
        singlyLinkedList.removeAll();
        singlyLinkedList.displayList();
        System.out.println("---------------------------------------------");
        System.out.println("Testing removeDuplicatesSortedList method");
        singlyLinkedList.addElement(1);
        singlyLinkedList.addElement(3);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(7);
        singlyLinkedList.addElement(9);
        singlyLinkedList.displayList();
        System.out.println("After executing the method");
        singlyLinkedList.removeDuplicatesSortedList();
        singlyLinkedList.displayList();
        System.out.println("---------------------------------------------");
        singlyLinkedList.removeAll();
        System.out.println("Testing removeDuplicatesSortedList method when three items are the same");
        singlyLinkedList.addElement(1);
        singlyLinkedList.addElement(3);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(9);
        singlyLinkedList.displayList();
        System.out.println("After executing the method");
        singlyLinkedList.removeDuplicatesSortedList();
        singlyLinkedList.displayList();
        singlyLinkedList.removeAll();
        System.out.println("---------------------------------------------");
        System.out.println("Testing removeDuplicatesSortedList method when the list is empty");
        singlyLinkedList.removeDuplicatesSortedList();
        singlyLinkedList.displayList();
        System.out.println("---------------------------------------------");
        System.out.println("Testing removeDuplicatesSortedList method when the all items are the same");
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(5);
        singlyLinkedList.displayList();
        System.out.println("After executing the method");
        singlyLinkedList.removeDuplicatesSortedList();
        singlyLinkedList.displayList();
        System.out.println("---------------------------------------------");
        singlyLinkedList.removeAll();
        System.out.println("Testing removeDuplicatesSortedList method when we have two or more duplicates");
        singlyLinkedList.addElement(1);
        singlyLinkedList.addElement(1);
        singlyLinkedList.addElement(2);
        singlyLinkedList.addElement(2);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(5);
        singlyLinkedList.displayList();
        System.out.println("After executing the method");
        singlyLinkedList.removeDuplicatesSortedList();
        singlyLinkedList.displayList();
        System.out.println("---------------------------------------------");
        singlyLinkedList.removeAll();
    }

    public static void testRemoveDuplicatesUnsortedList() {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        System.out.println("Testing removeDuplicatesUnsortedList method");
        singlyLinkedList.addElement(1);
        singlyLinkedList.addElement(7);
        singlyLinkedList.addElement(2);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(4);
        singlyLinkedList.addElement(2);
        singlyLinkedList.displayList();
        System.out.println("After executing the method");
        singlyLinkedList.removeDuplicatesUnsortedList();
        singlyLinkedList.displayList();
        System.out.println("---------------------------------------------");
        singlyLinkedList.removeAll();
        System.out.println("Testing removeDuplicatesUnsortedList method when the list is empty");
        singlyLinkedList.removeDuplicatesUnsortedList();
        singlyLinkedList.displayList();
        System.out.println("---------------------------------------------");
        System.out.println("Testing removeDuplicatesUnsortedList method when the all items are the same");
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(5);
        singlyLinkedList.displayList();
        System.out.println("After executing the method");
        singlyLinkedList.removeDuplicatesUnsortedList();
        singlyLinkedList.displayList();
        singlyLinkedList.removeAll();
        System.out.println("---------------------------------------------");
        System.out.println("Testing removeDuplicatesUnsortedList method when we have two or more duplicates");
        singlyLinkedList.addElement(1);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(3);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(1);
        singlyLinkedList.addElement(3);
        singlyLinkedList.addElement(9);
        singlyLinkedList.displayList();
        System.out.println("After executing the method");
        singlyLinkedList.removeDuplicatesUnsortedList();
        singlyLinkedList.displayList();
        System.out.println("---------------------------------------------");
        singlyLinkedList.removeAll();
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
    public static void testFindMiddle() throws Exception {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        System.out.println("Testing findMiddle method");
        singlyLinkedList.addElement(1);
        singlyLinkedList.addElement(7);
        singlyLinkedList.addElement(2);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(4);
        singlyLinkedList.addElement(2);
        singlyLinkedList.displayList();
        System.out.println("Expecting result 2: got: " + singlyLinkedList.findMiddle());
        singlyLinkedList.removeAll();
        singlyLinkedList.addElement(1);
        singlyLinkedList.addElement(3);
        singlyLinkedList.addElement(10);
        singlyLinkedList.addElement(2);
        singlyLinkedList.addElement(8);
        System.out.println("Expecting result 10: got: " + singlyLinkedList.findMiddle());
        singlyLinkedList.removeAll();
        try {
            singlyLinkedList.findMiddle();
        } catch (Exception e) {
            System.out.println("Expecting result : exception : got: " + e.getMessage());
        }
        singlyLinkedList.addElement(1);
        System.out.println("Expecting result 1 : got : " + singlyLinkedList.findMiddle());
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
    public static void testArrayInsertionSortAscending() throws Exception{
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
        int[] array = {2,7,5,4,10,8};
        System.out.println("Array before method call: ");
        sortingAlgorithms.display(array);
        int[] sortedArray = sortingAlgorithms.arrayInsertionSortAscending(array);
        System.out.println("Array after method call: ");
        sortingAlgorithms.display(sortedArray);
        System.out.println("---------------------------------------");
        System.out.println("When all items are the same: ");
        array = new int[]{2,2,2,2,2};
        sortingAlgorithms.arrayInsertionSortAscending(array);
        sortingAlgorithms.display(array);
        System.out.println("---------------------------------------");
        System.out.println("When two items are the same: ");
        array = new int[]{2,10,4,3,11,4};
        sortingAlgorithms.arrayInsertionSortAscending(array);
        sortingAlgorithms.display(array);
        System.out.println("---------------------------------------");
        System.out.println("When array is empty: ");
        array = new int[]{};
        sortingAlgorithms.arrayInsertionSortAscending(array);
        sortingAlgorithms.display(array);
        System.out.println("---------------------------------------");
        System.out.println("When array is sorted ascending order: ");
        array = new int[]{2,6,7,9,12,16};
        sortingAlgorithms.arrayInsertionSortAscending(array);
        sortingAlgorithms.display(array);
        System.out.println("---------------------------------------");
        System.out.println("When array is sorted descending order: ");
        array = new int[]{18,11,10,5,3,1};
        sortingAlgorithms.arrayInsertionSortAscending(array);
        sortingAlgorithms.display(array);
        try {
            array = null;
            sortingAlgorithms.arrayInsertionSortAscending(array);
            sortingAlgorithms.display(array);
        }catch (Exception e){
            System.out.println("Expecting result : exception : got : "+e.getMessage());
        }
    }
    public static void testIsPalindrome(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        System.out.println("Testing isPalindrome method");
        System.out.println("Expected true, got: " + singlyLinkedList.isPalindrome());
        System.out.println("----------------------------------------");
        singlyLinkedList.addElement(5);
        System.out.println("Expected true, got: " + singlyLinkedList.isPalindrome());
        singlyLinkedList.removeAll();
        System.out.println("----------------------------------------");
        singlyLinkedList.addElement(10);
        singlyLinkedList.addElement(22);
        singlyLinkedList.addElement(3);
        singlyLinkedList.addElement(22);
        singlyLinkedList.addElement(10);
        System.out.println("Expected true, got: " + singlyLinkedList.isPalindrome());
        System.out.println("----------------------------------------");
        singlyLinkedList.removeAll();
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(11);
        singlyLinkedList.addElement(22);
        singlyLinkedList.addElement(22);
        singlyLinkedList.addElement(11);
        singlyLinkedList.addElement(5);
        System.out.println("Expected true, got: " + singlyLinkedList.isPalindrome());
        System.out.println("----------------------------------------");
        singlyLinkedList.removeAll();
        singlyLinkedList.addElement(10);
        singlyLinkedList.addElement(26);
        singlyLinkedList.addElement(3);
        singlyLinkedList.addElement(2);
        singlyLinkedList.addElement(10);
        System.out.println("Expected false, got: " + singlyLinkedList.isPalindrome());
        System.out.println("----------------------------------------");
    }
    public static void testStaticStackGenerics() throws Exception{
        IStackGenerics<Integer> integerStackGenerics = new StaticStackGenerics<>(10);
        System.out.println("Testing StaticStackGenerics for integer elements");
        System.out.println("Testing push method");
        integerStackGenerics.push(1);
        integerStackGenerics.push(5);
        integerStackGenerics.push(3);
        integerStackGenerics.push(10);
        integerStackGenerics.push(11);
        integerStackGenerics.push(12);
        integerStackGenerics.push(6);
        integerStackGenerics.display();
        System.out.println("---------------------------------------");
        System.out.println("Testing pop method");
        integerStackGenerics.pop();
        integerStackGenerics.pop();
        integerStackGenerics.display();
        System.out.println("---------------------------------------");
        System.out.println("Testing peek method");
        System.out.println("First element : "+integerStackGenerics.peek());
        System.out.println("---------------------------------------");
        System.out.println("Testing size method");
        System.out.println("Stack size " + integerStackGenerics.size());
        System.out.println("---------------------------------------");
        System.out.println("Testing count method");
        System.out.println("Number of elements " + integerStackGenerics.count());
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        IStackGenerics<String> stringStackGenerics = new StaticStackGenerics<>(10);
        System.out.println("Testing StaticStackGenerics for string elements");
        System.out.println("Testing push method");
        stringStackGenerics.push("Hello");
        stringStackGenerics.push("World");
        stringStackGenerics.push("Phone");
        stringStackGenerics.push("Bottle");
        stringStackGenerics.display();
        System.out.println("Testing pop method");
        stringStackGenerics.pop();
        stringStackGenerics.pop();
        stringStackGenerics.display();
        System.out.println("---------------------------------------");
        System.out.println("Testing peek method");
        System.out.println("First element : "+stringStackGenerics.peek());
        System.out.println("---------------------------------------");
        System.out.println("Testing size method");
        System.out.println("Stack size " + stringStackGenerics.size());
        System.out.println("---------------------------------------");
        System.out.println("Testing count method");
        System.out.println("Number of elements " + stringStackGenerics.count());
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        IStackGenerics<Double> doubleStaticStackGenerics = new StaticStackGenerics<>(8);
        System.out.println("Testing StaticStackGenerics for double elements");
        System.out.println("Testing push method");
        doubleStaticStackGenerics.push(1.2);
        doubleStaticStackGenerics.push(5.1);
        doubleStaticStackGenerics.push(3.6);
        doubleStaticStackGenerics.push(10.3);
        doubleStaticStackGenerics.push(11.1);
        doubleStaticStackGenerics.display();
        System.out.println("---------------------------------------");
        System.out.println("Testing pop method");
        doubleStaticStackGenerics.pop();
        doubleStaticStackGenerics.display();
        System.out.println("---------------------------------------");
        System.out.println("Testing peek method");
        System.out.println("First element : "+doubleStaticStackGenerics.peek());
        System.out.println("---------------------------------------");
        System.out.println("Testing size method");
        System.out.println("Stack size " + doubleStaticStackGenerics.size());
        System.out.println("---------------------------------------");
        System.out.println("Testing count method");
        System.out.println("Number of elements " + doubleStaticStackGenerics.count());

    }
}


