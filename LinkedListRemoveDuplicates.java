
/**
 * Problem: Remove Duplicates from Sorted List (LeetCode #83)
 * 
 * Description:
 * Given the `head` of a sorted linked list, delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 * 
 * Approach:
 * Iterate through the list using a `current` pointer. If `current.data == current.next.data`, skip the duplicate
 * node by setting `current.next = current.next.next`. Otherwise, advance `current`.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class LinkedListRemoveDuplicates {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node remove(Node head) {
        Node current = head;

        while (current != null && current.next != null) {

            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(20);
        Node fourth = new Node(40);
        Node fifth = new Node(40);
        Node sixth = new Node(60);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        Node newHead = remove(first);

        while (newHead != null) {
            System.out.println(newHead.data + " ");
            newHead = newHead.next;
        }
    }
}
