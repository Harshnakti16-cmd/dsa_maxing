/**
 * Problem: Contains Duplicate (LeetCode #217)
 * Difficulty: Easy
 * 
 * Description:
 * Given an integer array `arr`, return the duplicate element if any value appears at least twice in the array.
 * Returns -1 if every element is distinct.
 * 
 * Approach:
 * Uses a `HashMap` to store elements encountered so far. For each element `num` in `arr`,
 * check if `num` is already in the map. If present, a duplicate is found; otherwise, insert `num` into the map.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
import java.util.*;

public class ContainsDuplicate {

    public static int containsDuplicate(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                return num;
            }
            map.put(num, 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        int result = containsDuplicate(arr);
        System.out.println(result);
    }
}
