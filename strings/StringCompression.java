public class StringCompression {

    public static int compress(char[] chars) {

        int read = 0;
        int write = 0;

        while (read < chars.length) {
            int count = 0;
            char current = chars[read];

            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }
            chars[write] = current;
            write++;

            if (count > 1) {

                String countString = String.valueOf(count);
                for (char ch : countString.toCharArray()) {
                    chars[write] = ch;
                    write++;
                }
            }
        }
        return write;
    }

    public static void main(String[] args) {

        char[] ch = { 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'a' };
        int ans = compress(ch);
        for (int i = 0; i < ans; i++) {
            System.out.print(ch[i]);
        }
    }
}
