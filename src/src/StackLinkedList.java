public class StackLinkedList<T> implements Stack<T> {

    private StackItem<T> top;

    @Override
    public void push(T item) {
        StackItem<T> newBox = new StackItem<>(item);
        newBox.setNext(top);
        top = newBox;
    }

    @Override
    public T pop() throws MyEmptyStackException {
        if (isEmpty()) {
            throw new MyEmptyStackException("Stack is empty. Can't pop.");
        }
        T data = top.getData();
        top = top.getNext();
        return data;
    }

    @Override
    public T peek() throws MyEmptyStackException {
        if (isEmpty()) {
            throw new MyEmptyStackException("Stack is empty. Can't peek.");
        }
        return top.getData();
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("StackLinkedList: [");
        StackItem<T> current = top;
        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) sb.append(", ");
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
