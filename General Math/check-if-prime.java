import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int flag = 1;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = 0;
                    break;
                }
            }
            if (n == 1 || n == 0) {
                System.out.println("Not Prime");
            } else if (flag == 1) {
                System.out.println("Yes");
            } else if (flag == 0) {
                System.out.println("No");
            }
        }

    }
}