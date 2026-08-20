
/**
 * Problem: Merge Sorted Array (LeetCode #88 variant)
 * 
 * Description:
 * Given two sorted integer arrays `num1` and `num2`, merge them into a single sorted result array.
 * 
 * Approach:
 * Uses two pointers (`i` for `num1`, `j` for `num2`) to compare elements sequentially and insert
 * the smaller element into a new result array `result`, then appends any remaining elements.
 * 
 * Time Complexity: O(N + M)
 * Space Complexity: O(N + M)
 */
import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] merge(int[] num1, int[] num2) {
        int[] result = new int[num1.length + num2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < num1.length && j < num2.length) {
            if (num1[i] <= num2[j]) {
                result[k] = num1[i];
                i++;
            } else {
                result[k] = num2[j];
                j++;
            }
            k++;
        }
        while (i < num1.length) {
            result[k] = num1[i];
            i++;
            k++;
        }
        while (j < num2.length) {
            result[k] = num2[j];
            j++;
            k++;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 3, 4, 5, 6 };
        int[] arr2 = { 2, 4, 7, 8 };

        int[] result = merge(arr1, arr2);
        System.out.print(Arrays.toString(result));

    }
}
