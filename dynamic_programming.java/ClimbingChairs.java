
public class ClimbingChairs {

    public static int climb(int n) {

        if (n <= 2) {
            return n;
        }

        int onestep = 1;
        int twostep = 2;

        for (int i = 3; i <= n; i++) {

            int current = onestep + twostep;
            onestep = twostep;
            twostep = current;
        }
        return twostep;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Distinct ways to climb " + n + " stairs: " + climb(n));
    }
}
