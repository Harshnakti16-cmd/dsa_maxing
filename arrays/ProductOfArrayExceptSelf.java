/**
 * Problem: Product of Array Except Self (LeetCode #238)
 * Difficulty: Medium
 * 
 * Description:
 * Given an integer array `arr`, return an array `result` such that `result[i]` is equal to the product
 * of all the elements of `arr` except `arr[i]`.
 * Must run in O(N) time and without using the division operation.
 * 
 * Approach:
 * Uses Prefix and Suffix products:
 * 1. First pass (left to right): Compute prefix products for each element and store in `result`.
 *    `result[i]` holds the product of all elements to the left of index `i`.
 * 2. Second pass (right to left): Multiply `result[i]` by the running suffix product
 *    (product of all elements to the right of index `i`).
 * 
 * Time Complexity: O(N) - two linear passes
 * Space Complexity: O(1) auxiliary space (excluding the output array)
 */
public class ProductOfArrayExceptSelf {

    public static int[] products(int[] arr) {

        int prefix = 1;
        int suffix = 1;
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            result[i] = prefix;
            prefix = prefix * arr[i];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix = suffix * arr[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };
        int[] result = products(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
