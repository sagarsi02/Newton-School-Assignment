import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        // cin>>n;
        long sum = (n * (n + 1)) / 2;
        if (sum % 2 == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
        // return 0;
    }
}