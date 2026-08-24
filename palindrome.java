public class Palindrome {

    public static boolean isPalindrome(int num) {

        int reverse = 0;
        int num2 = num;

        while (num != 0) {

            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return reverse == num2;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(100));
    }
}
