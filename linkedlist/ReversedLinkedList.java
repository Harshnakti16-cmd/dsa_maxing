
/**
 * Problem: Reverse Linked List (LeetCode #206)
 * 
 * Description:
 * Given the `head` of a singly linked list, reverse the list, and return the reversed list head.
 * 
 * Approach:
 * Iterative approach using 3 pointers (`prev`, `current`, `next`). In each iteration, save `current.next`,
 * point `current.next` backwards to `prev`, and shift `prev` and `current` forward.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class ReversedLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;

            current.next = prev;

            prev = current;
            current = next;
        }
        return prev;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next = second;
        second.next = third;
        third.next = fourth;

        printList(first);

        Node newList = reverse(first);
        printList(newList);

    }
}
