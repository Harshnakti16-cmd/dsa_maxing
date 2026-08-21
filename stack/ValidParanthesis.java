
/**
 * Problem: Valid Parentheses (LeetCode #20)
 * Difficulty: Easy
 * 
 * Description:
 * Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`,
 * determine if the input string is valid. An input string is valid if open brackets are closed by the
 * same type of brackets in the correct order.
 * 
 * Approach:
 * Uses a `Stack<Character>`. Push opening brackets onto the stack. When a closing bracket is encountered,
 * check if the stack is non-empty and the top element matches the corresponding opening bracket, then pop.
 * Returns `true` if stack is empty at the end.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
import java.util.*;

public class ValidParanthesis {
    public static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.isEmpty() || st.peek() != '(') {
                    return false;
                }
                st.pop();
            }

            else if (ch == ']') {
                if (st.isEmpty() || st.peek() != '[') {
                    return false;
                }
                st.pop();
            }

            else if (ch == '}') {
                if (st.isEmpty() || st.peek() != '{') {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[{[{]}()]";
        boolean result = isValid(s);
        System.out.println(result);
    }

}
