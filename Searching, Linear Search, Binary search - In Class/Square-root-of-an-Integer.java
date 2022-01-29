import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N >= 1) {
            int S = sc.nextInt();
            double sq = Math.sqrt(S);
            int res = (int) sq;
            System.out.println(res);
            N--;
        }
    }
}