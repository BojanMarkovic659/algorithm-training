package dynamicstructures;

import definitions.IStack;

public class DynamicStack implements IStack {

    private SinglyLinkedList list;
    private int count;
    public DynamicStack() {
        list = new SinglyLinkedList();
        count = 0;
    }

    @Override
    public void push(int element) throws Exception {
        list.addElement(element);
        count++;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
       return count;
    }

    @Override
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is empty");
        }
        int element = list.removeFromEnd();
        count--;
        return  element;
    }

    @Override
    public int peek() throws Exception {
        if(isEmpty()){
            throw new Exception("List is empty");
        }
            return list.lastElement();
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
