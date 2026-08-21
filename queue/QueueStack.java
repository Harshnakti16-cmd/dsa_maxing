
/**
 * Problem: Implement Stack using Queues (LeetCode #225)
 * 
 * Description:
 * Implement a Last-In-First-Out (LIFO) stack using a Queue data structure.
 * The stack should support all standard stack operations: `push`, `pop`, `peek`, and `isEmpty`.
 * 
 * Approach:
 * Uses a single `Queue<Integer>`. On `push(x)`, add `x` to the queue and rotate the preceding
 * elements to the back of the queue (looping `size` times). This moves `x` to the front of the queue,
 * keeping the top element of the stack at the head of the queue.
 * 
 * Time Complexity:
 * - push(x): O(N) where N is the current number of elements
 * - pop(): O(1)
 * - peek(): O(1)
 * - isEmpty(): O(1)
 * 
 * Space Complexity: O(N) to store elements in the queue
 */

import java.util.*;

public class QueueStack {

    Queue<Integer> queue = new LinkedList<>();

    public void push(int x) {
        int size = queue.size();

        queue.add(x);
        for (int i = 0; i < size; i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int peek() {
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        QueueStack stack = new QueueStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
