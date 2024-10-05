public class SumOfnaturalno {
    public static int print(int n) {
        if (n == 1) {
            return 1;
        }
        int answer = n + print(n - 1);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(print(5));

    }

}
