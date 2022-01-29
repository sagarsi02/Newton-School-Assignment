import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        // Divisor of 10
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int k = 0;
        for (int j = 0; j < arr1.length; j++) {
            k = arr[j];
            arr1[j] = arr[k];

        }
        for (int l = 0; l < arr1.length; l++) {
            System.out.print(arr1[l] + " ");

        }
    }
}