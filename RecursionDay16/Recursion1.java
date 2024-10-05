
public class Recursion1 {

    public static int fact(int n) {
        // base case
        if (n == 0) {
            return 1;
        }
        // self work + sub problem
        int result = n * fact(n - 1);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fact(4));
    }

}
