import definitions.IStack;
import dynamicstructures.SinglyLinkedList;
import staticstructures.StaticStack;

public class Test {

    public static void main(String[] args)  {
        try {
            //testStaticStack();
            //testRemoveDuplicatesSortedList();
            testRemoveDuplicatesUnsortedList();
        }catch (Exception exception){
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
}


