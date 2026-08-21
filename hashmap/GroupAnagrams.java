
/**
 * Problem: Group Anagrams (LeetCode #49)
 * Difficulty: Medium
 * 
 * Description:
 * Given an array of strings `arr`, group the anagrams together. You can return the answer in any order.
 * An Anagram is a word formed by rearranging the letters of a different word, using all original letters exactly once.
 * 
 * Approach:
 * For each string in `arr`, sort its characters to create a canonical `key` string.
 * Store lists of anagrams in a `HashMap<String, List<String>>` keyed by the sorted string.
 * Return all values of the map as a list of lists.
 * 
 * Time Complexity: O(N * K log K), where N is the number of strings and K is the maximum length of a string.
 * Space Complexity: O(N * K)
 */
import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] arr) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : arr) {

            char[] ch = word.toCharArray();

            Arrays.sort(ch);

            String key = new String(ch);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };

        System.out.println(groupAnagrams(words));
    }
}
