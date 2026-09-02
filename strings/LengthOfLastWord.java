/**
 * Problem: Length of Last Word (LeetCode #58)
 * Difficulty: Easy
 * 
 * Description:
 * Given a string `s` consisting of words and spaces, return the length of the
 * last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 * 
 * Approach:
 * Reverse Traversal (Backward Scanning).
 * 1. Skip trailing whitespace starting from the end of string `s`.
 * 2. Count non-space characters until space or start of string is reached.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class LengthOfLastWord {

    public static int counting(String s) {

        int i = s.length() - 1;
        int count = 0;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }

    public static void main(String[] args) {

        String s = "luffy is still joyboy    ";

        System.out.println(counting(s));
    }
}
