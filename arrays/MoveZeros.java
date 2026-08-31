/**
 * Problem: Move Zeroes (LeetCode #283)
 * Difficulty: Easy
 * 
 * Description:
 * Given an integer array `arr`, move all `0`'s to the end of it while maintaining the relative order
 * of the non-zero elements.
 * Must perform this in-place without making a copy of the array.
 * 
 * Approach:
 * Uses a Two-Pointer technique (`slow` pointer for placement, `fast` pointer for scanning):
 * 1. Iterate `fast` through the array. Whenever a non-zero element `arr[fast]` is encountered,
 *    place it at `arr[slow]` and increment `slow`.
 * 2. Fill the remaining positions from `slow` to the end of the array with `0`.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class MoveZeros {

    public static int[] move(int[] arr) {

        int slow = 0;

        for (int fast = 0; fast < arr.length; fast++) {

            if (arr[fast] != 0) {
                arr[slow] = arr[fast];
                slow++;
            }
        }
        while (slow < arr.length) {
            arr[slow] = 0;
            slow++;
        }
        return arr;

    }

    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 3, 12 };
        int[] result = move(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
