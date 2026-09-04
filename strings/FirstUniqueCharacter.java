
/**
 * LeetCode 387: First Unique Character in a String
 * 
 * Problem Description:
 * Given a string s, find the first non-repeating character in it and return its
 * index.
 * If it does not exist, return -1.
 * 
 * Approach:
 * Frequency Count using HashMap / Hash Table -
 * 1. First pass: Store the frequency of each character in a HashMap.
 * 2. Second pass: Iterate through the string again and return the index of the
 * first character with a frequency of 1.
 * 
 * Time Complexity: O(N) where N is the length of string s.
 * Space Complexity: O(1) auxiliary space since the character set is bounded (at
 * most 26 lowercase English letters).
 */

import java.util.HashMap;

public class FirstUniqueCharacter {

    public static int unique(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String s = "harsh";
        System.out.print(unique(s));
    }
}
