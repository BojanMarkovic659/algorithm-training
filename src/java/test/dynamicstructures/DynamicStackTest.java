package test.dynamicstructures;

import main.definitions.IStack;
import main.dynamicstructures.DynamicStack;

public class DynamicStackTest {

    public static void main(String[] args) {
        try {
            testDynamicStack();
        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
        }
    }

    public void testAll() {
        try {
            testDynamicStack();
        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
        }

    }

    public static void testDynamicStack() throws Exception {
        IStack stack = new DynamicStack();
        System.out.println("Testing push method");
        stack.push(5);
        stack.push(7);
        stack.push(10);
        stack.push(11);
        stack.push(14);
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
}
