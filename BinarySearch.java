/**
 * Problem: Binary Search (LeetCode #704)
 * 
 * Description:
 * Given a sorted array of integers `arr` in ascending order and a target value `target`,
 * search for `target` in `arr`. If `target` exists, return its index; otherwise, return -1.
 * 
 * Approach:
 * Uses Binary Search with two pointers (`left` and `right`) to repeatedly divide the search interval in half.
 * 
 * Time Complexity: O(log N)
 * Space Complexity: O(1)
 */
public class BinarySearch {

    public static int search(int[] arr, int target) {

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

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 3, 5, 7, 9, 11 };
        int target = 7;

        int result = search(arr, target);
        System.out.println("The index of the target is :- " + result);
    }
}
