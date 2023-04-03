package test.dynamicstructures;

import main.dynamicstructures.SinglyLinkedList;

public class SinglyLinkedListTest {

    public static void main(String[] args) {
        try {
            testRemoveDuplicatesSortedList();
            testRemoveDuplicatesUnsortedList();
            testFindMiddle();
            testIsPalindrome();
            testRemoveLastOccurrence();
        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
        }
    }

    public void testAll() {
        try {
            testRemoveDuplicatesSortedList();
            testRemoveDuplicatesUnsortedList();
            testFindMiddle();
            testIsPalindrome();
            testRemoveLastOccurrence();
        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
        }
    }

    public static void testRemoveDuplicatesSortedList() throws Exception {
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

    public static void testIsPalindrome() {
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

    public static void testRemoveLastOccurrence() throws Exception {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        System.out.println("Testing removeLastOccurrence method when the last occurrence is the last element");
        singlyLinkedList.addElement(2);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(1);
        singlyLinkedList.addElement(2);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(45);
        singlyLinkedList.displayList();
        singlyLinkedList.removeLastOccurrence(45);
        System.out.println("----------------------------------------");
        singlyLinkedList.displayList();
        singlyLinkedList.removeAll();
        System.out.println("----------------------------------------");
        System.out.println("Testing removeLastOccurrence method when we have multiple occurrences of a number");
        singlyLinkedList.addElement(2);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(1);
        singlyLinkedList.addElement(3);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(45);
        singlyLinkedList.displayList();
        singlyLinkedList.removeLastOccurrence(5);
        System.out.println("----------------------------------------");
        singlyLinkedList.displayList();
        singlyLinkedList.removeAll();
        System.out.println("Testing removeLastOccurrence method when the last occurrence is the first element");
        singlyLinkedList.addElement(2);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(1);
        singlyLinkedList.addElement(1);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(45);
        singlyLinkedList.displayList();
        singlyLinkedList.removeLastOccurrence(2);
        System.out.println("----------------------------------------");
        singlyLinkedList.displayList();
        singlyLinkedList.removeAll();
        System.out.println("Testing removeLastOccurrence method when the first element is equal to the requested number but there is another occurrence later");
        singlyLinkedList.addElement(2);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(2);
        singlyLinkedList.addElement(1);
        singlyLinkedList.addElement(2);
        singlyLinkedList.addElement(45);
        singlyLinkedList.displayList();
        singlyLinkedList.removeLastOccurrence(2);
        System.out.println("----------------------------------------");
        singlyLinkedList.displayList();
        singlyLinkedList.removeAll();
        System.out.println("Testing removeLastOccurrence method when we have only one element in list");
        singlyLinkedList.addElement(5);
        singlyLinkedList.displayList();
        singlyLinkedList.removeLastOccurrence(5);
        System.out.println("----------------------------------------");
        singlyLinkedList.displayList();

    }
}
