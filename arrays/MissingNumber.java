/**
 * Problem: Missing Number (LeetCode #268)
 * Difficulty: Easy
 * 
 * Description:
 * Given an array `arr` containing `n` distinct numbers in the range `[0, n]`,
 * return the only number in the range that is missing from the array.
 * 
 * Approach:
 * Uses Bitwise XOR (`^`) operator properties:
 * 1. Initialize `result = n` (where `n = arr.length`).
 * 2. Loop `i` from 0 to `n - 1` and compute `result ^= i ^ arr[i]`.
 * 3. All matching index-value pairs cancel out due to `a ^ a = 0`, leaving only the missing number.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class MissingNumber {

    public static int missing(int[] arr) {

        int result = arr.length;

        for (int i = 0; i < arr.length; i++) {
            result = result ^ i ^ arr[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = { 3, 0, 1 };
        System.out.println(missing(arr));
    }
}
