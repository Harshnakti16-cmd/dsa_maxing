public class ProductOfArrayExceptSelf {

    public static int[] products(int[] arr) {

        int prefix = 1;
        int suffix = 1;
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            result[i] = prefix;
            prefix = prefix * arr[i];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] = result[i] * suffix;
            suffix = suffix * arr[i];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };
        int[] result = products(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
