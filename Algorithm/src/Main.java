public class Main {
    public static void main(String[] args) {
        Sta stack = new Sta(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.printStack();

        stack.pop();
        stack.printStack();

        stack.pop();
        stack.pop();
        stack.pop();
    }
}
