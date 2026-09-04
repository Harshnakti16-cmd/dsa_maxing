import java.util.*;

public class LongestPalindrome {

    public static int count(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int length = 0;
        boolean hasOdd = false;

        for (int count : map.values()) {
            length += (count / 2) * 2;

            if (count % 2 == 1) {
                hasOdd = true;
            }
        }
        if (hasOdd) {
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "abccccdd";

        System.out.println(count(s));

    }
}