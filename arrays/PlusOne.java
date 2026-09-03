public class PlusOne {

    public static int[] plus(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] < 9) {
                arr[i] += 1;
                return arr;
            }
            arr[i] = 0;
        }
        int[] result = new int[arr.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {

        int[] arr = { 9, 9, 9 };
        int[] solution = plus(arr);

        for (int n : solution) {
            System.out.print(n + " ");
        }

    }
}
