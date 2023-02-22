package definitions;

public interface IStack {
    void push(int element);
    boolean isEmpty();
    int size();
    int pop() throws Exception;
    int peek() throws Exception;
    boolean isFull();
    int count();
    void display();
}
