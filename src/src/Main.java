public class Main {
    public static void main(String[] args) {
        try {
            Stack<Number> stack = new StackArray<>();
            // Or use: Stack<Number> stack = new StackLinkedList<>();

            stack.push(3);
            stack.push(45);
            stack.push(3.4);

            System.out.println(stack.toString());
            System.out.println("Top: " + stack.peek());
            System.out.println("Popped: " + stack.pop());
            System.out.println("After pop: " + stack.toString());

        } catch (MyEmptyStackException e) {
            System.out.println(e.getMessage());
        }
    }
}
