public class MissingNumber {

    public static int missing(int[] arr) {

        int result = arr.length;

        for (int i = 0; i < arr.length; i++) {
            result = result ^ i ^ arr[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = { 3, 0, 1 };
        System.out.println(missing(arr));
    }
}
