/**
 * Problem: Palindrome Number (LeetCode #9)
 * Difficulty: Easy
 * 
 * Description:
 * Determine whether an integer `num` is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * 
 * Approach:
 * Reverse the integer by extracting digits modulo 10 and building `reverse = reverse * 10 + digit`.
 * Check if the reversed integer equals the original number.
 * 
 * Time Complexity: O(log10(N))
 * Space Complexity: O(1)
 */
public class PalindromeNumber {

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
