public class Fibonacci {
    public static int fib(int n) {
        // base case
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // self work + sub problem

        int answer = fib(n - 1) + fib(n - 2);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(fib(5));

    }

}
