import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        long x, y, n;
        Scanner sc = new Scanner(System.in);
        x = sc.nextLong();
        y = sc.nextLong();
        n = sc.nextLong();

        boolean flag = false;

        for (int i = 1; i <= n; i++) {
            long sum1 = n - i * y;
            long sum2 = n + i * y;

            if (sum1 % x == 0 || sum2 % x == 0) {
                System.out.println("YES");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("NO");
        }
    }
}