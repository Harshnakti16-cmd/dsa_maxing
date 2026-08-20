package linkedlist;

/**
 * Problem: Convert Binary Number in a Linked List to Integer (LeetCode #1290)
 * 
 * Description:
 * Given `head` which is a reference node to a singly-linked list where each node contains
 * a binary digit (0 or 1), return the decimal value of the binary number represented by the list.
 * 
 * Approach:
 * Iterates through the linked list, shifting the accumulated result left by multiplying by 2
 * and adding the current node's value (`result = result * 2 + current.data`).
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class BinaryToInteger {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int binaryToInteger(Node head) {
        int result = 0;
        Node current = head;

        while (current != null) {
            result = result * 2 + current.data;
            current = current.next;
        }

        return result;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(1);
        Node third = new Node(0);
        Node fourth = new Node(1);

        head.next = second;
        second.next = third;
        third.next = fourth;

        int decimalValue = binaryToInteger(head);
        System.out.println(decimalValue);
    }
}
