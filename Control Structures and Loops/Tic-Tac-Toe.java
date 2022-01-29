import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        if (first.equals("R")) {
            System.out.print("R");
        } else if (second.equals("R")) {
            System.out.println("R");
        } else if (first.equals("J")) {
            System.out.print(second);
        } else if (second.equals("J")) {
            System.out.println(first);
        } else {
            System.out.println("D");
        }
    }
}