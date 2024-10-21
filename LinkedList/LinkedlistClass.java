public class LinkedlistClass {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                // tail=temp;

            } else {
                tail.next = temp;
                // tail=temp;
            }
            tail = temp;

        }

        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAtIndex(int index, int val) {
            Node temp1 = new Node(val);
            Node temp = head;
            if (index == size()) {
                insertAtEnd(val);
                return;
            } else if (index == 0) {
                insertAtHead(val);
                return;
            }
            for (int i = 1; i <= index - 1; i++) {
                temp = temp.next;

            }
            temp1.next = temp.next;
            temp.next = temp1;
        }

        void deleteAt(int index) {
            Node temp = head;
            for (int i = 1; i <= index - 1; i++) {
                temp = temp.next;

            }
            if (index == size() - 1) {
                tail = temp;
            }
            temp.next = temp.next.next;
        }

        int getAt(int index) { // time complexity O(n);
            Node temp = head;
            for (int i = 1; i <= index; i++) {
                temp = temp.next;
            }
            return temp.data;

        }

        int size() { // we can also dircetlt use size varibale in place of this function and increase
                     // in by 1 in inserting and
                     // decrease it by one in deleteing;
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;

        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

        linkedlist ll = new linkedlist();
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtEnd(7);

        ll.insertAtIndex(0, 98);
        ll.deleteAt(5);
        ll.display();

    }

}
