import java.util.HashSet;

public class LongestSubstring {

    public static int maxLength(String s) {

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int max = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            max = Math.max(max, set.size());
        }
        return max;
    }

    public static void main(String[] args) {

        String s = "abacabdpp";
        System.out.println(maxLength(s));

    }
}
