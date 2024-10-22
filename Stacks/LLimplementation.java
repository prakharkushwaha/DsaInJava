public class LLimplementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    public static class Stack {
        Node head = null;
        int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

        int peek() {
            int top = head.data;
            return top;

        }

        int size() {
            return size;
        }

        int pop() {
            if (head == null) {
                System.out.println("stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.display();
        st.pop();
        st.display();

    }

}
