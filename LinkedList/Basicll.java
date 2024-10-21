// problems with ARRAY--------
// 1-Fixed size
// 2-continuous memory allocation
// 3-insertion is difficult o(n)

//for solving array problems we use rhe arraylist but aray list is wasting the space -------
//--Arraylist is always creating another array of 2x size.

// LINKEDLIST-------
// 1-not fixed size
// 2-non-contiguous memory allocation
// 3.linkedlists take more space than the array

public class Basicll {
    public static void length(Node head) { // function for finding the length of the linked list
        // lenght of LL
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println(count);
    }

    public static class Node {
        int data; // data in the node
        Node next; // address of the next node

        Node(int data) {
            this.data = data;
        }
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

        Node temp = a;
        // for (int i = 0; i < 6; i++) {

        // System.out.println(temp.data);
        // temp = temp.next;

        // }

        // Display the linked list
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

        // lenght of the linked list
        length(a);

    }

}
