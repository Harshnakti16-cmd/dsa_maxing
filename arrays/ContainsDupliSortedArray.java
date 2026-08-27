public class ContainsDupliSortedArray {

    public static int count(int[] arr) {

        int slow = 0;
        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[slow] != arr[fast]) {
                slow++;
                arr[slow] = arr[fast];
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4 };
        System.out.println(count(arr));
    }
}
