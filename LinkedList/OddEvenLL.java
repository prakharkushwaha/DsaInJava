public class OddEvenLL {
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static class Node {
        int data; // data in the node
        Node next; // address of the next node

        Node(int data) {
            this.data = data;
        }
    }

    public static void oddEven(Node head) {
        Node x = new Node(-1);
        Node tempx = x;
        Node y = new Node(0);
        Node tempy = y;
        Node temp = head;
        while (temp != null) {
            if (temp.data % 2 == 0) {
                Node a = new Node(temp.data);
                tempx.next = a;
                tempx = a;

            } else {
                Node a = new Node(temp.data);
                tempy.next = a;
                tempy = a;

            }
            temp = temp.next;
        }
        display(x.next);
        System.out.println();
        display(y.next);

    }

    public static void main(String[] args) {

        // creating node
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

        oddEven(a);

        // Display the linked list

    }

}
