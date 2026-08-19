import java.util.Stack;

public class StackEvaluate {

    public static int evaluate(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            if (token.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            } else if (token.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } else if (token.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            } else if (token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b);
            } else {
                int number = Integer.parseInt(token);
                stack.push(number);
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {

        String[] tokens = { "1", "2", "+", "3", "*" };
        int result = evaluate(tokens);
        System.out.println(result);

        String[] tokens1 = { "4", "13", "5", "/", "+" };
        int result1 = evaluate(tokens1);
        System.out.println(result1);
    }
}
