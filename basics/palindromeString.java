/**
 * Problem: Valid Palindrome String
 * Difficulty: Easy
 * 
 * Description:
 * Determine if a given string `s` is a palindrome (reads the same forward and backward).
 * 
 * Approach:
 * Two Pointers (`left` at start, `right` at end). Compare characters moving inward. Return `false` on mismatch.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class palindromeString {

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "harsh";
        System.out.println(isPalindrome(s));
    }
}
