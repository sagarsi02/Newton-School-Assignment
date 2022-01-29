import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Arr = new int[N];
        for (int i = 0; i < N; i++) {
            Arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if ((i + 1) % 2 == 0 && (Arr[i] % 2 == 0)) {
                count++;
            } else if ((i + 1) % 2 != 0 && (Arr[i] % 2 != 0)) {
                count++;
            }
        }
        System.out.println(count);
    }
}