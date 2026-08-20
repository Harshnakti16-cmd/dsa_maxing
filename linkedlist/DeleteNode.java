/**
 * Problem: Delete Node in a Linked List (LeetCode #237)
 * 
 * Description:
 * Delete a given node in a singly-linked list without having access to the head
 * of the list.
 * You are guaranteed that the node to be deleted is not a tail node.
 * 
 * Approach:
 * Copy the value of the next node into the current node (`node.data =
 * node.next.data`),
 * then bypass the next node (`node.next = node.next.next`).
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class DeleteNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void delete(Node node) {

        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void main(String[] args) {

    }
}
