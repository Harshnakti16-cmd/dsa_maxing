/**
 * Problem: Contains Duplicate II (LeetCode #219)
 * Difficulty: Easy
 * 
 * Description:
 * Given an integer array `arr` and an integer `k`, return `true` if there exist two distinct indices `i` and `j`
 * in the array such that `arr[i] == arr[j]` and `Math.abs(i - j) <= k`.
 * 
 * Approach:
 * Uses a `HashMap` mapping element values to their most recent array index.
 * For each element `arr[i]`, if it is already present in the map and `i - map.get(arr[i]) <= k`, return `true`.
 * Update the map with the current index `(arr[i], i)`.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
import java.util.HashMap;

public class DuplicateAtDistance {

    public static boolean containsDupli(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                if (i - map.get(arr[i]) <= k) {
                    return true;
                }
            }
            map.put(arr[i], i);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 1 };
        int k = 3;

        System.out.println(containsDupli(arr, k));
    }
}
