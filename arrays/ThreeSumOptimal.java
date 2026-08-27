
/**
 * Problem: 3Sum - Optimal Approach (LeetCode #15)
 * Difficulty: Medium
 * 
 * Description:
 * Given an integer array `arr`, return all the unique triplets `[arr[i], arr[j], arr[k]]`
 * such that `i != j`, `i != k`, and `j != k`, and `arr[i] + arr[j] + arr[k] == 0`.
 * Notice that the solution set must not contain duplicate triplets.
 * 
 * Approach:
 * 1. Sort the input array in ascending order.
 * 2. Iterate through the array fixing the first element `arr[i]` (from `i = 0` to `n - 3`).
 * 3. Skip duplicate elements for `arr[i]` to avoid duplicate triplets.
 * 4. Use Two Pointers (`left = i + 1`, `right = n - 1`) to find pairs that sum to `-arr[i]`:
 *    - If `arr[i] + arr[left] + arr[right] == 0`, add triplet to result, then increment `left` and decrement `right`.
 *      Skip duplicate elements for `left` and `right` pointers.
 *    - If `sum > 0`, decrement `right` to reduce the sum.
 *    - If `sum < 0`, increment `left` to increase the sum.
 * 
 * Time Complexity: O(N^2) - Sorting takes O(N log N) and outer loop with two-pointer search takes O(N^2).
 * Space Complexity: O(1) auxiliary space (excluding space needed for the output list).
 */
import java.util.*;

public class ThreeSumOptimal {

    public static List<List<Integer>> threeSum(int[] arr) {

        Arrays.sort(arr);

        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    list.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;

                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;

                    }
                    while (left < right && arr[right] == arr[right + 1]) {
                        right--;
                    }
                }
            }

        }
        return list;
    }

    public static void main(String[] args) {

        int[] arr = { 1, -2, 3, 4, -6, 2, -1 };
        System.out.println(threeSum(arr));
    }
}
