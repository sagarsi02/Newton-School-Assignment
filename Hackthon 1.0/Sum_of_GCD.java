import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static int getCount(int d, int n) {
        int no = n / d;
        int result = no;
        for (int p = 2; p * p <= no; ++p) {
            if (no % p == 0) {
                while (no % p == 0)
                    no /= p;
                result -= result / p;
            }
        }
        if (no > 1)
            result -= result / no;
        return result;
    }

    static int sumOfGCDofPairs(int n) {
        int res = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                int d1 = i;
                int d2 = n / i;
                res += d1 * getCount(d1, n);
                if (d1 != d2)
                    res += d2 * getCount(d2, n);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t >= 1) {
            int n = sc.nextInt();
            System.out.println(sumOfGCDofPairs(n));
            t--;
        }
    }
}