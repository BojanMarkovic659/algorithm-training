package staticstructures;

import definitions.IStackGenerics;

public class StaticStackGenerics<T> implements IStackGenerics<T> {
    private final T[] elements;
    private int lastElementIndex;

    public StaticStackGenerics(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.lastElementIndex = -1;
    }

    @Override
    public void push(T element) throws Exception {
        if (isFull()) {
            System.out.println("Stack is full");
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
    public T pop() throws Exception {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            throw new Exception("Stack is empty");
        }
        lastElementIndex--;
        return elements[lastElementIndex + 1];
    }

    @Override
    public T peek() throws Exception {
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
