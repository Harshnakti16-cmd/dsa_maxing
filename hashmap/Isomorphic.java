
/**
 * Problem: Isomorphic Strings (LeetCode #205)
 * Difficulty: Easy
 * 
 * Description:
 * Given two strings `s` and `t`, determine if they are isomorphic. Two strings `s` and `t` are isomorphic
 * if the characters in `s` can be replaced to get `t`. All occurrences of a character must be replaced
 * with another character while preserving character order, and no two characters may map to the same character.
 * 
 * Approach:
 * Uses two `HashMap`s (`map1` for `s -> t` and `map2` for `t -> s`) to enforce a 1-to-1 bijection.
 * Iterates through both strings simultaneously, checking for mapping conflicts in either map.
 * 
 * Time Complexity: O(N)
 * Space Complexity: O(K) where K is the unique character set size
 */
import java.util.HashMap;

public class Isomorphic {

    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            if (map1.containsKey(a) && map1.get(a) != b) {
                return false;
            }
            if (map2.containsKey(b) && map2.get(b) != a) {
                return false;
            }

            map1.put(a, b);
            map2.put(b, a);
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s, t));

    }
}
