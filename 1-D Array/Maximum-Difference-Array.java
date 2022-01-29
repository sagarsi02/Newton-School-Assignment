import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] leftMin = new int[N];
        leftMin[0] = arr[0];
        for (int i = 1; i < N; i++) {
            leftMin[i] = Math.min(arr[i], leftMin[i - 1]);
        }

        int[] rightmax = new int[N];
        rightmax[N - 1] = arr[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
        }
        int i = 0, j = 0, maxDiff = -1;
        while (i < N && j < N) {
            if (leftMin[i] < rightmax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j = j + 1;
            } else {
                i = i + 1;
            }
        }
        System.out.println(maxDiff);
    }

}