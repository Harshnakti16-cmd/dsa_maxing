package linkedlist;

/**
 * Problem: Linked List Cycle (LeetCode #141)
 * 
 * Description:
 * Given `head`, the head of a linked list, determine if the linked list has a cycle in it.
 * A cycle exists if there is some node in the list that can be reached again by continuously following the `next` pointer.
 * 
 * Approach:
 * Uses Floyd's Cycle-Finding Algorithm (Tortoise and Hare approach). Maintains two pointers (`slow` moving 1 step,
 * `fast` moving 2 steps). If there is a cycle, `slow` and `fast` will eventually meet (`slow == fast`).
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class LinkedListHasCycle {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public static boolean hasCycle(Node head) {

            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {

                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }

        public static void main(String[] args) {

            Node first = new Node(10);
            Node second = new Node(20);
            Node third = new Node(30);
            Node fourth = new Node(40);

            first.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = second;

            boolean result = hasCycle(first);
            System.out.println(result);
        }
    }
}
