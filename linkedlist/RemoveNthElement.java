
/**
 * Problem: Remove Nth Node From End of List (LeetCode #19)
 * Difficulty: Medium
 * 
 * Description:
 * Given the `head` of a linked list, remove the $n$-th node from the end of the list and return its head.
 * 
 * Approach:
 * Uses a `dummy` node before `head` and two pointers (`slow` and `fast`). Move `fast` pointer $n+1$ steps ahead first.
 * Then advance both pointers until `fast` reaches `null`. `slow.next` will be the node to remove, so set `slow.next = slow.next.next`.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class RemoveNthElement {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node remove(Node head, int n) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node slow = dummy;
        Node fast = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        Node result = remove(first, 3);

        while (result != null) {
            System.out.println(result.data + " ");
            result = result.next;
        }
    }
}
