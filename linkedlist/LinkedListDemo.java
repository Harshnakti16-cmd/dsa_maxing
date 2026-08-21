
/**
 * Topic: Singly Linked List Basics & Traversal
 * Difficulty: Easy
 * 
 * Description:
 * Demonstrates basic creation of custom Singly Linked List nodes (`Node`),
 * linking nodes together sequentially,
 * and traversing through the linked list to print each node reference.
 * 
 * Approach:
 * Creates nodes manually, updates their `next` references, and iterates using a
 * pointer until reaching `null`.
 * 
 * Time Complexity: O(N) for traversal
 * Space Complexity: O(1) auxiliary space
 */
public class LinkedListDemo {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        Node current = first;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }

    }
}
