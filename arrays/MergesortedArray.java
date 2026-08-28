public class MergesortedArray {

    public static int[] merge(int[] num1, int m, int[] num2, int n) {

        int i = m - 1;
        int j = n - 1;

        int k = m + n - 1;

        while (j >= 0) {

            if (num1[i] > num2[j]) {
                num1[k] = num1[i];
                i--;
                k--;
            } else {
                num1[k] = num2[j];
                j--;
                k--;
            }
        }
        return num1;
    }

    public static void main(String[] args) {
        int[] num1 = { 1, 2, 3, 0, 0, 0 };
        int[] num2 = { 2, 5, 6 };
        int[] result = merge(num1, 3, num2, 3);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
