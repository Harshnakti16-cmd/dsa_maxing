package linkedlist;

/**
 * Problem: Remove Linked List Elements (LeetCode #203)
 * 
 * Description:
 * Given the `head` of a linked list and an integer `val`, remove all the nodes of the linked list
 * that have `Node.data == val`, and return the new head.
 * 
 * Approach:
 * First trim leading nodes matching `val` by advancing `head`. Then traverse remaining nodes with `prev`
 * and `current` pointers, linking `prev.next = current.next` whenever `current.data == val`.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class LinkedListRemoveElements {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node remove(Node head, int val) {

        while (head != null && head.data == val) {
            head = head.next;
        }
        Node prev = null;
        Node current = head;
        while (current != null) {

            if (current.data == val) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }
        return head;
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
        Node fifth = new Node(50);
        Node sixth = new Node(60);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;

        first = remove(first, 30);
        printList(first);
    }
}
