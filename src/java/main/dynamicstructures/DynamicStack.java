package main.dynamicstructures;

import main.definitions.IStack;

public class DynamicStack implements IStack {

    private SinglyLinkedList list;
    private int count;
    public DynamicStack() {
        list = new SinglyLinkedList();
        count = 0;
    }

    @Override
    public void push(int element) throws Exception {
        list.addFirstElement(element);
        count++;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
       return Integer.MAX_VALUE;
    }

    @Override
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        int element = list.removeFirstElement();
        count--;
        return  element;
    }

    @Override
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("List is empty");
        }
            return list.firstElement();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public void display() {
        list.displayList();
    }
}
