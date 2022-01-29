import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if (B == 0 || A == 0) {
            System.out.println("NO");
        } else if (A * 6 >= B && A <= B) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}