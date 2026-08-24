public class fibonacci {

    public static void fibo(int num) {

        int first = 0;
        int second = 1;

        for (int i = 0; i < num; i++) {

            System.out.println(first);

            int fibo = first + second;

            first = second;
            second = fibo;
        }
    }

    public static void main(String[] args) {

        int num = 2;
        fibo(num);
    }
}
