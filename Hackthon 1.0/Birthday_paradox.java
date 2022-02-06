import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        double res = Math.ceil(Math.sqrt(2 * 365 * Math.log(1 / (1 - P))));
        int val = (int) res;
        System.out.println(val);
    }
}