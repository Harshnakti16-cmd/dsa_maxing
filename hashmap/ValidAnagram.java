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
