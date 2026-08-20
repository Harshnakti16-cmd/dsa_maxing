package linkedlist;

/**
 * Problem: Merge Two Sorted Lists (LeetCode #21)
 * 
 * Description:
 * You are given the heads of two sorted linked lists `head1` and `head2`.
 * Merge the two lists into one sorted linked list and return its head.
 * 
 * Approach:
 * Uses a `dummy` head node and a `current` pointer to splice nodes together in non-decreasing order,
 * appending whichever remaining list is non-empty at the end.
 * 
 * Time Complexity: O(N + M)
 * Space Complexity: O(1)
 */
public class MergeSortedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node merge(Node head1, Node head2) {

        Node dummy = new Node(0);
        Node current = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        if (head1 != null) {
            current.next = head1;
        } else {
            current.next = head2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = new Node(6);

        Node result = merge(head1, head2);

        Node current = result;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }

}
