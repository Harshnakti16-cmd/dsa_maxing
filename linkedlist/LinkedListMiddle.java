package linkedlist;

/**
 * Problem: Middle of the Linked List (LeetCode #876)
 * 
 * Description:
 * Given the `head` of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes (even length list), return the second middle node.
 * 
 * Approach:
 * Two Pointers (Fast & Slow). Move `slow` by 1 node and `fast` by 2 nodes per step.
 * When `fast` reaches the end (`null` or `fast.next == null`), `slow` will be pointing to the middle node.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class LinkedListMiddle {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node middle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        first.next = new Node(20);
        first.next.next = new Node(30);
        first.next.next.next = new Node(40);
        first.next.next.next.next = new Node(50);

        Node result = middle(first);
        System.out.println(result.data);
    }
}
