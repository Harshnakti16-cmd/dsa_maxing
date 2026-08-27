/**
 * Problem: Remove Duplicates from Sorted Array (LeetCode #26)
 * Difficulty: Easy
 * 
 * Description:
 * Given an integer array `arr` sorted in non-decreasing order, remove the duplicates in-place
 * such that each unique element appears only once. Return the number of unique elements `k`.
 * The first `k` elements of `arr` should hold the unique elements in order.
 * 
 * Approach:
 * Uses a Two-Pointer technique (`slow` pointer for placement, `fast` pointer for scanning):
 * 1. Initialize `slow = 0`.
 * 2. Iterate `fast` from 1 to `arr.length - 1`.
 * 3. When `arr[slow] != arr[fast]`, increment `slow` and set `arr[slow] = arr[fast]`.
 * 4. Return `slow + 1`, representing the count of unique elements.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class ContainsDupliSortedArray {

    public static int count(int[] arr) {

        int slow = 0;
        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[slow] != arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4 };
        System.out.println(count(arr));
    }
}
