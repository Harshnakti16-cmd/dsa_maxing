
/**
 * Problem: Valid Palindrome (LeetCode #125)
 * Difficulty: Easy
 * 
 * Description:
 * Determine if a string `s` is a palindrome, considering alphanumeric
 * characters and ignoring cases.
 * 
 * Approach:
 * Two Pointers (`leftChar` and `rightChar`). Move inward comparing lowercased
 * characters,
 * skipping non-alphanumeric characters until the pointers meet or a mismatch is
 * found.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class Palindrome {

    public static boolean isPalindrome(String s) {
        int leftChar = 0;
        int rightChar = s.length() - 1;

        while (leftChar < rightChar) {

            while (leftChar < rightChar && !Character.isLetterOrDigit(s.charAt(leftChar))) {
                leftChar++;
            }

            while (leftChar < rightChar && !Character.isLetterOrDigit(s.charAt(rightChar))) {
                rightChar--;
            }

            if (Character.toLowerCase(s.charAt(leftChar)) != Character.toLowerCase(s.charAt(rightChar))) {
                return false;
            }
            leftChar++;
            rightChar--;
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "Race a e-car";
        boolean result = isPalindrome(s);
        System.out.println(result);
    }
}
