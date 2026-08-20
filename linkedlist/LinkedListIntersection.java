
/**
 * Problem: Intersection of Two Linked Lists (LeetCode #160)
 * 
 * Description:
 * Given the heads of two singly linked lists `head1` and `head2`, return the node at which the two lists intersect.
 * If the two linked lists have no intersection at all, return null.
 * 
 * Approach:
 * Two Pointers approach. Pointer `a` traverses list 1 then list 2, while pointer `b` traverses list 2 then list 1.
 * Both pointers traverse the total length (N + M) and will meet at the intersection node or at `null` if no intersection.
 * 
 * Time Complexity: O(N + M)
 * Space Complexity: O(1)
 */
public class LinkedListIntersection {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node intersect(Node head1, Node head2) {

        Node a = head1;
        Node b = head2;

        while (a != b) {
            if (a == null) {
                a = head2;
            } else {
                a = a.next;
            }

            if (b == null) {
                b = head1;
            } else {
                b = b.next;
            }
        }
        return a;
    }

    public static void main(String[] args) {

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);

        Node common = new Node(9);
        common.next = new Node(8);
        head1.next.next.next = common;

        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = common;

        Node result = intersect(head1, head2);
        System.out.print(result.data);
    }
}
