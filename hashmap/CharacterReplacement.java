
/**
 * Problem: Longest Repeating Character Replacement (LeetCode #424)
 * Difficulty: Medium
 * 
 * Description:
 * You are given a string s and an integer k. You can choose any character of the string and change it to any other
 * uppercase English character. You can perform this operation at most k times. Return the length of the longest
 * substring containing the same letter you can get after performing the above operations.
 * 
 * Approach:
 * Sliding Window with Frequency Map. The condition `(window length) - (most frequent char count) <= k` ensures that
 * the number of characters to replace is within the allowed limit k. We expand the window to the right and shrink from
 * the left only when the condition is violated.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(26) -> O(1)
 */
import java.util.HashMap;

public class CharacterReplacement {

    public static int replacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxfreq = 0;
        int maxlength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxfreq = Math.max(maxfreq, map.get(ch));

            while ((right - left + 1) - maxfreq > k) {
                map.remove(s.charAt(left));
                left++;
            }
            maxlength = Math.max(maxlength, (right - left + 1));

        }
        return maxlength;
    }

    public static void main(String[] args) {

        String s = "AABABBA";
        int k = 2;
        System.out.println(replacement(s, k));
    }
}
