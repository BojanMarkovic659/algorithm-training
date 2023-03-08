import definitions.IStack;
import dynamicstructures.SinglyLinkedList;
import searchalgorithms.SearchAlgorithms;
import staticstructures.StaticStack;

public class Test {

    public static void main(String[] args) throws Exception {
        try {
//            testStaticStack();
//            testRemoveDuplicatesSortedList();
//            testRemoveDuplicatesUnsortedList();
            testFindMiddle();
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
}



