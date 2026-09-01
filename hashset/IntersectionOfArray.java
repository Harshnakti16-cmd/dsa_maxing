/**
 * Problem: Intersection of Two Arrays (LeetCode #349)
 * Difficulty: Easy
 * 
 * Description:
 * Given two integer arrays `num1` and `num2`, return an array of their intersection.
 * Each element in the result must be unique and may be returned in any order.
 * 
 * Approach:
 * Uses two `HashSet` objects:
 * 1. Insert all elements of `num1` into a `HashSet` (`set`).
 * 2. Iterate through `num2`; if an element exists in `set`, add it to `result` set (ensuring uniqueness).
 * 3. Convert `result` set to a primitive integer array and return.
 * 
 * Time Complexity: O(N + M) where N = num1.length and M = num2.length
 * Space Complexity: O(N + M)
 */
import java.util.HashSet;

public class IntersectionOfArray {

    public static int[] intersect(int[] num1, int[] num2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < num1.length; i++) {
            set.add(num1[i]);
        }

        for (int i = 0; i < num2.length; i++) {
            if (set.contains(num2[i])) {
                result.add(num2[i]);
            }
        }
        int[] arr = new int[result.size()];
        int index = 0;

        for (int num : result) {
            arr[index] = num;
            index++;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] num1 = { 1, 2, 2, 1 };
        int[] num2 = { 1, 1 };
        int[] result = intersect(num1, num2);
        System.out.println(result[0]);
    }
}
