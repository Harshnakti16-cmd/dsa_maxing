/**
 * LeetCode 53: Maximum Subarray
 * Difficulty: Medium
 * 
 * Problem Description:
 * Given an integer array `nums`, find the contiguous subarray (containing at
 * least
 * one number) which has the largest sum and return its sum.
 * 
 * Approach: Kadane's Algorithm
 * - `currentSum`: Tracks the sum of the subarray ending at the current
 * position.
 * - `maxSum`: Tracks the overall maximum sum found so far.
 * - For each element, we decide whether to extend the previous subarray
 * (`currentSum + arr[i]`) or start a new
 * subarray (`arr[i]`)
 * - If `currentSum` becomes negative, it's better to start a new subarray from
 * the next element
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MaximumSubArray {

    public static int plus(int[] arr) {

        int currentSum = 0;
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(plus(arr));

    }
}
