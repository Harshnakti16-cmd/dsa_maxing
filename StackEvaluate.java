/**
 * Problem: Evaluate Reverse Polish Notation / Postfix Evaluation (LeetCode #150)
 * 
 * Description:
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation (RPN).
 * Valid operators are '+', '-', '*', and '/'. Division between two integers truncates toward zero.
 * 
 * Approach:
 * Iterate through the tokens using a `Stack<Integer>`. Push operands (integers) onto the stack.
 * When encountering an operator, pop the top two numbers (`b` then `a`), compute `a op b`, and push the result back.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
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
