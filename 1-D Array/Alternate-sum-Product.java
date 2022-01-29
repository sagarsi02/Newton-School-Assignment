import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            Arr[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 1;

        for (int i = 0; i < N; i++) {
            if ((i + 1) % 2 == 0) {
                even += Arr[i];
            } else {
                odd = odd * Arr[i];
            }
        }
        System.out.print(even + " " + odd);
    }
}