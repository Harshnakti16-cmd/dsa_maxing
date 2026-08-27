/**
 * Problem: Two Sum II - Input Array Is Sorted (LeetCode #167)
 * Difficulty: Medium
 * 
 * Description:
 * Given a 1-indexed array of integers `arr` that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific `target` number.
 * Return the 1-based indices of the two numbers as `[index1, index2]`.
 * 
 * Approach:
 * Uses a Two-Pointer technique (`left = 0`, `right = arr.length - 1`).
 * 1. Calculate `arr[left] + arr[right]`.
 * 2. If `sum > target`, decrement `right` pointer to decrease the total sum.
 * 3. If `sum < target`, increment `left` pointer to increase the total sum.
 * 4. If `sum == target`, return 1-based indices `[left + 1, right + 1]`.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class TwoSum2 {

    public static int[] sum(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] + arr[right] > target) {
                right--;
            } else if (arr[left] + arr[right] < target) {
                left++;
            } else {
                return new int[] { left + 1, right + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 7, 8 };
        int target = 9;
        int result[] = sum(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
