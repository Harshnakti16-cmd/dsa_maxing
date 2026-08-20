package arrays;

/**
 * Problem: Two Sum - Optimal Approach (LeetCode #1)
 * 
 * Description:
 * Given an array of integers `arr` and an integer `target`, return the indices of the two numbers such that
 * they add up to `target`.
 * 
 * Approach:
 * Uses a `HashMap` mapping value -> index. For each element `arr[i]`, calculate `complement = target - arr[i]`.
 * If `complement` is already in the map, return `[map.get(complement), i]`. Otherwise, store `(arr[i], i)` in the map.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
import java.util.HashMap;

public class TwoSumOptimal {
    public static int[] twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(arr[i], i);

        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int target = 7;

        int[] result = twoSum(arr, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
