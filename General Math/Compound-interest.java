import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        double principle = sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double A = principle * (Math.pow((1 + rate / 100), time));
        double CI = A - principle;

        System.out.printf("%.2f", CI);
    }
}