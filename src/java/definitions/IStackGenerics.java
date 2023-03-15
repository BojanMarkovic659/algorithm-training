package definitions;

public interface IStackGenerics<T> {
    void push(T element) throws Exception;
    boolean isEmpty();
    int size();
    T pop() throws Exception;
    T peek() throws Exception;
    boolean isFull();
    int count();
    void display();
}
