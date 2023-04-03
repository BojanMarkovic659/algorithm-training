package test.staticstructures;

import main.definitions.IStack;
import main.staticstructures.StaticStack;

public class StaticStackTest {

    public static void main(String[] args) {
        try {
            testStaticStack();
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }

    public void testAll() {
        try {
            testStaticStack();
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
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
}
