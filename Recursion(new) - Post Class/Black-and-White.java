import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

    public static long NumberOfWays(int N, int M) {
        long ans = 0;
        long k = N * M;
        int mod = 1000000007;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int c = 0;
                if (j + 2 < M && i + 1 < N) {
                    c++;
                }
                if (j + 2 < M && i - 1 >= 0) {
                    c++;
                }
                if (i + 2 < N && j + 1 < M) {
                    c++;
                }
                if (i + 2 < N && j - 1 >= 0) {
                    c++;
                }
                if (j - 2 >= 0 && i + 1 < N) {
                    c++;
                }
                if (j - 2 >= 0 && i - 1 >= 0) {
                    c++;
                }
                if (i - 2 >= 0 && j + 1 < M) {
                    c++;
                }
                if (i - 2 >= 0 && j - 1 >= 0) {
                    c++;
                }
                ans = ((ans + k) % mod - (c + 1) % mod + mod) % mod;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t >= 1) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(NumberOfWays(n, m));
            t--;
        }
    }
}