import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int maxJump = 0;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] <= a[i]) {
                count++;
            } else {
                count = 0;
            }
            if (maxJump < count) {
                maxJump = count;
            }
        }
        System.out.println(maxJump);
    }
}