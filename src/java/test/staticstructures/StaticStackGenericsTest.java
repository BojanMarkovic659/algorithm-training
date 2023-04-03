package test.staticstructures;

import main.definitions.IStackGenerics;
import main.staticstructures.StaticStackGenerics;

public class StaticStackGenericsTest {
    public static void main(String[] args) {
        try {
            testStaticStackGenerics();
        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
        }
    }

    public void testAll() {
        try {
            testStaticStackGenerics();
        } catch (Exception exception) {
            System.err.println("Error: " + exception.getMessage());
        }
    }

    public static void testStaticStackGenerics() throws Exception {
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
        System.out.println("First element : " + integerStackGenerics.peek());
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
        System.out.println("First element : " + stringStackGenerics.peek());
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
        System.out.println("First element : " + doubleStaticStackGenerics.peek());
        System.out.println("---------------------------------------");
        System.out.println("Testing size method");
        System.out.println("Stack size " + doubleStaticStackGenerics.size());
        System.out.println("---------------------------------------");
        System.out.println("Testing count method");
        System.out.println("Number of elements " + doubleStaticStackGenerics.count());

    }
}
