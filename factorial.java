public class factorial {

    public static int fact(int num) {

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {

        int num = 6;
        System.out.println(fact(num));
    }
}
