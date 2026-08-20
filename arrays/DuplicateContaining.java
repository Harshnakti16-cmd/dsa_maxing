
/**
 * Problem: Contains Duplicate / Find First Duplicate Element (LeetCode #217 variant)
 * 
 * Description:
 * Given an integer array `arr`, find and return the first element that appears at least twice in the array.
 * If all elements are distinct, return -1.
 * 
 * Approach:
 * Uses a `HashSet` to store elements as we iterate through the array. If an element is already in the set,
 * it is returned as a duplicate.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
import java.util.HashSet;

public class DuplicateContaining {
    public static int duplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return arr[i];
            } else {
                set.add(arr[i]);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5, 6, 5 };
        int result = duplicate(arr);
        System.out.println(result);
    }
}
