import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 2; i++) {
            if (A[i] == A[i + 1] && A[i + 1] == A[i + 2]) {
                System.out.print("Yes");
                return;
            }

        }
        System.out.print("No");

    }
}