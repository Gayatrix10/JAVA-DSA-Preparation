public class LL1 {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    static Node addAtHead(Node head, int val) {
        Node newNode = new Node(val);

        if (head == null) {
            return newNode;
        }

        newNode.next = head;
        return newNode;   // Fixed
    }

    static Node deleteHead(Node head) {
        if (head == null) {
            return null;
        }

        return head.next;
    }

    static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = null;

        head = addAtHead(head, 30);
        head = addAtHead(head, 20);
        head = addAtHead(head, 10);

        display(head); // 10 -> 20 -> 30 -> null

        head = deleteHead(head);

        display(head); // 20 -> 30 -> null
    }
}