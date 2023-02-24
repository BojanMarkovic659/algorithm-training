import definitions.IStack;
import dynamicstructures.SinglyLinkedList;
import staticstructures.StaticStack;

public class Test {

    public static void main(String[] args) throws Exception {
        //testStaticStack();
        testSinglyLinkedList();
    }

    public static void testStaticStack() throws Exception {
        IStack stack = new StaticStack(10);

        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(11);
        stack.display();
        System.out.println("---------------------------------------------");
        stack.pop();
        stack.pop();
        stack.display();
        System.out.println("---------------------------------------------");
        System.out.println("First element: " + stack.peek());
        System.out.println("---------------------------------------------");
        System.out.println("Stack size " + stack.size());
        System.out.println("---------------------------------------------");
        System.out.println("Number of elements " + stack.count());

    }
    public static void testSinglyLinkedList(){
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(5);
        singlyLinkedList.addElement(5);
//        singlyLinkedList.addElement(5);
//        singlyLinkedList.addElement(1);
//        singlyLinkedList.addElement(6);
        singlyLinkedList.displayList();
        singlyLinkedList.removeDuplicatesUnsortedList();
        System.out.println("---------------------------------------------");
        singlyLinkedList.displayList();

    }

}


