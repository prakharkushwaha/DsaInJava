public class ReverseLL {
    public static void displayll(Node head) {

        if (head == null) {
            return;
        }
        displayll(head.next);
        System.out.println(head.data);
    }

    public static class Node {
        int data; // data in the node
        Node next; // address of the next node

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        // connecting the node
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        displayll(a);

    }

}
