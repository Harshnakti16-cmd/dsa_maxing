/**
 * Problem: Majority Element (LeetCode #169)
 * Difficulty: Easy
 * 
 * Description:
 * Given an array `arr` of size `n`, return the majority element.
 * The majority element is the element that appears more than `⌊n / 2⌋` times.
 * Assume that the majority element always exists in the array.
 * 
 * Approach:
 * Uses Boyer-Moore Voting Algorithm:
 * 1. Maintain a `candidate` element and a counter `count` initialized to 0.
 * 2. Traverse the array:
 *    - If `count == 0`, assign the current element as the new `candidate`.
 *    - If current element matches `candidate`, increment `count`; otherwise decrement `count`.
 * 3. Return `candidate` (the majority element will survive all cancellations).
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class MajorityElement {

    public static int majority(int[] arr) {
        int count = 0;
        int candidate = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (count == 0) {
                candidate = arr[i];
            }

            if (candidate == arr[i]) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majority(arr));
    }
}