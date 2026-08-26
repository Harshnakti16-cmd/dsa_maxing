import java.util.HashMap;

public class CharacterReplacement {

    public static int replacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxfreq = 0;
        int maxlength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxfreq = Math.max(maxfreq, map.get(ch));

            while ((right - left + 1) - maxfreq > k) {
                map.remove(s.charAt(left));
                left++;
            }
            maxlength = Math.max(maxlength, (right - left + 1));

        }
        return maxlength;
    }

    public static void main(String[] args) {

        String s = "AABABBA";
        int k = 2;
        System.out.println(replacement(s, k));
    }
}
