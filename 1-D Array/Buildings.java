import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int arr[] = new int[n];
        int count = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();

        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {

            if (arr[i] > max) {
                count++;
                max = arr[i];

            }

        }

        System.out.println(count);
    }
}