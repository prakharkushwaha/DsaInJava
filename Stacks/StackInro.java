
import java.util.*;
// operations in stack 
// 1-push()
// 2-pop()
// 3-peek()
// 4-size()
// 5-isEmpty
// ** stack me unlimited size hota hai 

public class StackInro {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        // int x = st.pop();
        // System.out.println(x);
        // System.out.println(st);
        // System.out.println(st.size());
        // COPY stack--------
        Stack<Integer> st1 = new Stack<>();
        while (st.size() > 0) {
            st1.push(st.pop());
        }
        Stack<Integer> st2 = new Stack<>();
        while (st1.size() > 0) {
            st2.push(st1.pop());
        }
        System.out.println(st2);

    }

}
