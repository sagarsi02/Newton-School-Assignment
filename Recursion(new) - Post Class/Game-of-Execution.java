import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int GameExecution(int x, int y) {
        if (x == 1)
            return 1;
        else
            return (GameExecution(x - 1, y) + y - 1) % x + 1;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t >= 1) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(GameExecution(n, k));
            t--;
        }
    }
}