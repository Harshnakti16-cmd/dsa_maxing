/**
 * Problem: Longest Substring Without Repeating Characters (LeetCode #3)
 * Difficulty: Medium
 * 
 * Description:
 * Given a string `s`, find the length of the longest substring without repeating characters.
 * 
 * Approach:
 * Sliding Window technique using two pointers (`left` and `right`) and a `HashSet` to store characters in the current window.
 * For each character at `right`, if it already exists in the set, contract the window by removing `s.charAt(left)` and advancing `left`
 * until the duplicate is removed. Add `s.charAt(right)` to the set and update `max` window size.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(K) where K is the number of unique characters in the window
 */
import java.util.HashSet;

public class LongestSubstring {

    public static int maxLength(String s) {

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            max = Math.max(max, set.size());
        }
        return max;
    }

    public static void main(String[] args) {

        String s = "abacabdpp";
        System.out.println(maxLength(s));

    }
}
