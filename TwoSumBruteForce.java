/**
 * Problem: Two Sum - Brute Force Approach (LeetCode #1)
 * 
 * Description:
 * Given an array of integers `arr` and an integer `target`, return `true` if there exist two distinct indices `i` and `j`
 * such that `arr[i] + arr[j] == target`, otherwise return `false`.
 * 
 * Approach:
 * Uses nested loops to check every pair of elements `(i, j)` where `j > i`.
 * 
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 */
public class TwoSumBruteForce {
    public static boolean twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int target = 7;
        System.out.println(
                twoSum(arr, target));
    }
}
