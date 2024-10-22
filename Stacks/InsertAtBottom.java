import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        Stack<Integer> st1 = new Stack<>();
        // while (st.size() > 1) {
        // st1.push(st.pop());

        // }
        // st.push(29);
        // while (st1.size() > 0) {
        // st.push(st1.pop());
        // }

        // System.out.println(st);

        // -----------DISPLAY STACK USING ARRAY---------
        int n = st.size();
        int[] arr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
            st.push(arr[i]);
        }

    }

}
