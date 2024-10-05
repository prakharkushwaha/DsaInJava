public class palindromeString {
    public static boolean isPalindrome(String str) {
        for (int i = 0; i <= str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        boolean result = isPalindrome(str);
        if (result) {
            System.out.println("yes it is palindrome");
        } else
            System.out.println("no it is not palindrome");

    }

}
