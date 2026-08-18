/**
 * Problem: Valid Anagram (LeetCode #242)
 * 
 * Description:
 * Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.
 * An Anagram is a word formed by rearranging the letters of a different word, using all original letters exactly once.
 * 
 * Approach:
 * Uses a `HashMap` character frequency map. First count frequencies of characters in `s`, then decrement
 * counts while scanning `t`. Returns `false` if lengths mismatch or character counts are inconsistent.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(K) where K is the number of unique characters
 */
import java.util.*;

public class ValidAnagrams {
    public static boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (!map.containsKey(ch)) {
                return false;
            }
            if (map.get(ch) == 0) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);
        }
        for (int values : map.values()) {
            if (values != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "widow";
        String t = "wodiw";

        boolean result = isAnagram(s, t);
        System.out.println(result);
    }
}