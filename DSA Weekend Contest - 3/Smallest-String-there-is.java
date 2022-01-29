import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                sb.append("a");
            } else {
                sb.append("b");
            }
        }
        String r = sb.toString();
        System.out.println(r);
    }
}