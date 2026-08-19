import java.util.Stack;

public class StackGetMin {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {

        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {

        StackGetMin s = new StackGetMin();
        s.push(5);
        s.push(2);
        s.push(3);
        s.push(1);
        s.push(4);
        s.push(1);

        System.out.println(s.getMin());

        s.pop();
        s.pop();
        s.pop();

        System.out.println(s.getMin());
    }
}
