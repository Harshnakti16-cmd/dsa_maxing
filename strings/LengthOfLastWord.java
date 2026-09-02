public class LengthOfLastWord {

    public static int counting(String s) {

        int i = s.length() - 1;
        int count = 0;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }

    public static void main(String[] args) {

        String s = "luffy is still joyboy    ";

        System.out.println(counting(s));
    }
}
