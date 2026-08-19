// Problem : Leetcode #83

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
