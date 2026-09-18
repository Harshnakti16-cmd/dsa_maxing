import java.util.HashMap;
import java.util.HashSet;

/**
 * LeetCode 290: Word Pattern
 * 
 * Problem Description:
 * Given a pattern and a string s, find if s follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 * Specifically:
 * - Each letter in pattern maps to exactly one unique word in s.
 * - Each unique word in s maps to exactly one letter in pattern.
 * - No two letters map to the same word, and no two words map to the same letter.
 * 
 * Approach:
 * - Split the string s by spaces into an array of words.
 * - If pattern.length() != words.length, return false immediately.
 * - Use a HashMap<Character, String> to store character -> word mapping.
 * - Use a HashSet<String> to track already mapped words to ensure bijection (1-to-1 mapping).
 * - For each character and corresponding word:
 *     - If the character is already mapped, verify it matches the current word.
 *     - If the character is new, verify the word hasn't already been used by another character.
 * 
 * Time Complexity: O(N) where N is the length of pattern (or number of words).
 * Space Complexity: O(N) for HashMap and HashSet storage.
 */
public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } else {
                if (set.contains(word)) {
                    return false;
                }
                map.put(ch, word);
                set.add(word);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String pattern = "aabb";
        String words = "do do ca ca";
        System.out.print(wordPattern(pattern, words));
    }
}
