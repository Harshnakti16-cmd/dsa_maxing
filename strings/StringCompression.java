/**
 * LeetCode 443: String Compression
 * 
 * Problem Description:
 * Given an array of characters chars, compress it using the following algorithm:
 * Begin with an empty string s. For each group of consecutive repeating characters in chars:
 * - If the group's length is 1, append the character to s.
 * - Otherwise, append the character followed by the group's length.
 * The compressed string s should not be returned separately, but instead, be stored in the input character array chars.
 * Note that group lengths that are 10 or longer will be split into multiple characters in chars.
 * You must write an algorithm that uses only O(1) extra space.
 * 
 * Approach:
 * Two Pointers (Read & Write pointers) -
 * - Read pointer scans through consecutive identical characters and counts their frequency.
 * - Write pointer updates the array in-place with the character and its frequency digits (if count > 1).
 * 
 * Time Complexity: O(N) where N is the length of the input array.
 * Space Complexity: O(1) auxiliary space (in-place modification).
 */
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
