import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long R = sc.nextLong();
        long K = sc.nextLong();
        long count = 0;
        count = L / K;
        if (L % K == 0) {
            count--;
        }
        count = (R / K) - count;
        System.out.println(count);
    }
}