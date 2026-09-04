/**
 * LeetCode 344: Reverse String
 * 
 * Problem Description:
 * Write a function that reverses a string. The input string is given as an
 * array of characters char[].
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array
 * in-place with O(1) extra memory.
 * 
 * Approach:
 * Two Pointers technique -Swap characters starting from two ends (left and
 * right) moving towards center.
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class ReverseString {

    public static void reverse(char[] ch) {

        int left = 0;
        int right = ch.length - 1;

        while (left < right) {

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;
        }
        for (char c : ch) {
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {

        char[] ch = { 'h', 'a', 'r', 's', 'h' };
        reverse(ch);
    }
}
