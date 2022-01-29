import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int n = str2.indexOf(str1);
        // System.out.println(n);
        if (n >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}