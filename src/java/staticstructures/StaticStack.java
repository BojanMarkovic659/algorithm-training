package staticstructures;

import definitions.IStack;

public class StaticStack implements IStack {

    private final int[] elements;
    private int lastElementIndex;

    public StaticStack(int capacity) {
        this.elements = new int[capacity];
        this.lastElementIndex = -1;
    }

    @Override
    public void push(int element) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is full");

        }
        elements[lastElementIndex + 1] = element;
        lastElementIndex++;
    }

    @Override
    public boolean isEmpty() {
        return lastElementIndex == -1;
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public int pop() throws Exception {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            throw new Exception("Stack is empty");
        }
        lastElementIndex--;

        return elements[lastElementIndex + 1];
    }

    @Override
    public int peek() throws Exception {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            throw new Exception("Stack is empty");
        }
        return elements[lastElementIndex];
    }

    @Override
    public boolean isFull() {
        return lastElementIndex == elements.length - 1;
    }

    @Override
    public int count() {

        return lastElementIndex + 1;
    }

    @Override
    public void display() {
        for (int i = lastElementIndex; i >= 0; i--) {
            System.out.println(elements[i]);
        }
    }


}
