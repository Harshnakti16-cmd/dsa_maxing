import java.util.HashMap;
import java.util.HashSet;

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
