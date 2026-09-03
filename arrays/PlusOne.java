/**
 * LeetCode 66: Plus One
 * Difficulty: Easy
 * 
 * Problem Description:
 * You are given a large integer represented as an integer array `digits`, where
 * each `digits[i]`
 * is the `i-th` digit of the integer. The digits are ordered from most
 * significant to least
 * significant in left-to-right order. The large integer does not contain any
 * leading 0's.
 * 
 * Increment the large integer by one and return the resulting array of digits.
 * 
 * Approach: Iterative Right-to-Left Traversal with Carry
 * - Iterate from the last digit (least significant) back to the first.
 * - If current digit is less than 9, increment it by 1 and return the array
 * immediately (no carry).
 * - If current digit is 9, set it to 0 and continue loop (carry over to next
 * digit).
 * - If all digits are 9 (e.g. [9, 9, 9]), the loop finishes. Allocate a new
 * array of size n+1
 * with the leading digit set to 1 (e.g. [1, 0, 0, 0]).
 * 
 * Time Complexity: O(n) - worst case traverses all digits.
 * Space Complexity: O(1) auxiliary space (O(n) only when creating a new array
 * for all 9's).
 */
public class PlusOne {

    public static int[] plus(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] < 9) {
                arr[i] += 1;
                return arr;
            }
            arr[i] = 0;
        }
        int[] result = new int[arr.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {

        int[] arr = { 9, 9, 9 };
        int[] solution = plus(arr);

        for (int n : solution) {
            System.out.print(n + " ");
        }

    }
}
