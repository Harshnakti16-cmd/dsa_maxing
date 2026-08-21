
/**
 * Problem: Implement Queue using Stacks (LeetCode #232)
 * Difficulty: Easy
 * 
 * Description:
 * Implement a first-in-first-out (FIFO) queue using only two stacks. The implemented queue
 * supports all standard queue operations: `enqueue` (push), `dequeue` (pop), `peek`, and `isEmpty`.
 * 
 * Approach:
 * - Use two stacks: `stack1` for input and `stack2` for output.
 * - `enqueue(x)`: Push element onto `stack1`.
 * - `dequeue()` / `peek()`: Extract/view element from `stack2`. If `stack2` is empty, 
 *   transfer all elements from `stack1` to `stack2` (which reverses their order to FIFO).
 * 
 * Time Complexity:
 * - enqueue(x): O(1)
 * - dequeue(): Amortized O(1)
 * - peek(): Amortized O(1)
 * - isEmpty(): O(1)
 * 
 * Space Complexity: O(N) overall to store N elements in the queue.
 */
import java.util.*;

public class StackQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int x) {
        stack1.push(x);
    }

    public int dequeue() {

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        StackQueue queue = new StackQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }
}
