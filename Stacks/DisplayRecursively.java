import java.util.Stack;

public class DisplayRecursively {
    public static void displayRecReverse(Stack<Integer> st) {
        if (st.size() == 0)
            return;
        int top = st.pop();
        System.out.println(top);
        displayRecReverse(st);
        st.push(top);
    }

    public static void displayRec(Stack<Integer> st) {
        if (st.size() == 3) {
            st.push(0);
            return;
        }
        int top = st.pop();
        displayRec(st);
        System.out.println(top);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        displayRecReverse(st);
        System.out.println();
        displayRec(st);
        System.out.println(st);
    }

}
