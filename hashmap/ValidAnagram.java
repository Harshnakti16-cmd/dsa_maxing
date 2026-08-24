/**
 * Problem: Valid Anagram (LeetCode #242)
 * Difficulty: Easy
 * 
 * Description:
 * Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.
 * An Anagram is a word formed by rearranging the letters of a different word, using all original letters exactly once.
 * 
 * Approach:
 * First check if lengths of `s` and `t` match. Build a character frequency `HashMap` for string `s`.
 * Iterate through `t`, decrementing frequencies. If a character is missing or has count 0, return `false`.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(K) where K is the number of unique characters
 */
import java.util.HashMap;

public class ValidAnagram {

    public static boolean isValid(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }
        return true;
    }

    public static void main(String[] args) {

        String a = "anagram";
        String b = "nagaram";

        System.out.println(isValid(a, b));
    }
}
