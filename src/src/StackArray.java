import java.util.ArrayList;

public class StackArray<T> implements Stack<T> {

    private ArrayList<T> stack = new ArrayList<>();

    @Override
    public void push(T item) {
        stack.add(0, item);
    }

    @Override
    public T pop() throws MyEmptyStackException {
        if (isEmpty()) {
            throw new MyEmptyStackException("Stack is empty. Can't pop.");
        }
        return stack.remove(0);
    }

    @Override
    public T peek() throws MyEmptyStackException {
        if (isEmpty()) {
            throw new MyEmptyStackException("Stack is empty. Can't peek.");
        }
        return stack.get(0);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public String toString() {
        return "StackArray: " + stack.toString();
    }
}
