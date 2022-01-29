import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int SingleDigit(int x) {
        int sum = 0;
        while (x > 0 || sum > 9) {
            if (x == 0) {
                x = sum;
                sum = 0;
            }
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SingleDigit(n));
    }
}