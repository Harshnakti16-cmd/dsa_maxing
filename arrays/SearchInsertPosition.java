/**
 * LeetCode 35: Search Insert Position
 * Difficulty: Easy
 * 
 * Problem Description:
 * Given a sorted array of distinct integers and a target value, return the
 * index if the target
 * is found. If not, return the index where it would be if it were inserted in
 * order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Approach: Binary Search
 * - Use binary search with left and right pointers.
 * - Calculate `mid = left + (right - left) / 2` to avoid integer overflow.
 * - If `arr[mid] == target`, return `mid`.
 * - If `target > arr[mid]`, narrow search to right half (`left = mid + 1`).
 * - If `target < arr[mid]`, narrow search to left half (`right = mid - 1`).
 * - If target is not found, `left` pointer will end up at the correct insertion
 * index.
 * 
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class SearchInsertPosition {

    public static int searchIndex(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (target > arr[mid]) {
                left = mid + 1;
            }
            if (target < arr[mid]) {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 6 };
        int target = 4;
        System.out.println(searchIndex(arr, target));
    }
}
