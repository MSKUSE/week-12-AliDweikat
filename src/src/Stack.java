public interface Stack<T> {
    void push(T item);
    T pop() throws MyEmptyStackException;
    T peek() throws MyEmptyStackException;
    boolean isEmpty();
}
