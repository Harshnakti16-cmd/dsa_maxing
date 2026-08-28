/**
 * Problem: Merge Sorted Array (LeetCode #88)
 * Difficulty: Easy
 *
 * Description:
 * Given two sorted integer arrays `nums1` and `nums2`, merge them into a single
 * sorted array.
 * `nums1` has enough space (size `m + n`) to hold the elements of both arrays.
 *
 * Approach:
 * Use three pointers, starting from the end of each array:
 * - `i`: pointer for `nums1` (elements 0 to m-1)
 * - `j`: pointer for `nums2` (elements 0 to n-1)
 * - `k`: pointer for the merged array (nums1[0...m+n-1])
 *
 * Compare `nums1[i]` and `nums2[j]`. Place the larger element at `nums1[k]` and
 * move the corresponding pointer inward.
 * Continue until `j` reaches 0 (all elements of `nums2` are placed).
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 */
public class MergeSortedArray {

    public static int[] merge(int[] num1, int m, int[] num2, int n) {

        int i = m - 1;
        int j = n - 1;

        int k = m + n - 1;

        while (j >= 0) {

            if (num1[i] > num2[j]) {
                num1[k] = num1[i];
                i--;
                k--;
            } else {
                num1[k] = num2[j];
                j--;
                k--;
            }
        }
        return num1;
    }

    public static void main(String[] args) {
        int[] num1 = { 1, 2, 3, 0, 0, 0 };
        int[] num2 = { 2, 5, 6 };
        int[] result = merge(num1, 3, num2, 3);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
