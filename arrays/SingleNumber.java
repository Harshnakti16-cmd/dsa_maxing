/**
 * Problem: Single Number (LeetCode #136)
 * Difficulty: Easy
 * 
 * Description:
 * Given a non-empty array of integers `arr`, every element appears twice except for one.
 * Find that single element.
 * Must implement a solution with linear runtime complexity and constant extra space.
 * 
 * Approach:
 * Uses Bitwise XOR (`^`) operator properties:
 * 1. `a ^ a = 0` (a number XORed with itself equals 0).
 * 2. `a ^ 0 = a` (a number XORed with 0 stays unchanged).
 * 3. XOR is commutative and associative, so all duplicate pairs cancel out,
 *    leaving only the single element.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class SingleNumber {

    public static int singleNumber(int[] arr) {

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = { 7, 8, 3, 1, 1, 3, 8 };
        System.out.println(singleNumber(nums));
    }
}
