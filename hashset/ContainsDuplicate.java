/**
 * Problem: Contains Duplicate (LeetCode #217)
 * Difficulty: Easy
 * 
 * Description:
 * Given an integer array `arr`, return `true` if any value appears at least twice in the array,
 * and return `false` if every element is distinct.
 * 
 * Approach:
 * Uses a `HashSet` to keep track of numbers seen so far. Iterate through the array; if the current number
 * is already present in the set, return `true`. Otherwise, insert the number into the set.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
import java.util.*;

public class ContainsDuplicate {

    public static boolean containsDupli(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int a : arr) {
            if (set.contains(a)) {
                return true;
            }
            set.add(a);
        }
        return false;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 2 };
        System.out.println(containsDupli(arr));
    }
}
