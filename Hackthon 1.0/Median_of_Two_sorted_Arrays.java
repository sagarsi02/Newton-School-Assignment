import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int[] A = new int[n];
        int[] B = new int[m];
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }
        for (int j = 0; j < m; j++) {
            B[j] = input.nextInt();
        }
        System.out.println(getMedian(ar1, ar2, n1, n2));
    }

    static int getMedian(int A[], int B[], int n, int m) {
        int i = 0;

        // Current index of input array ar2[]
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;

        if ((m + n) % 2 == 1) {
            for (count = 0; count <= (n + m) / 2; count++) {
                if (i != n && j != m) {
                    m1 = (A[i] > B[j]) ? B[j++] : A[i++];
                } else if (i < n) {
                    m1 = A[i++];
                }

                // for case when j<m,
                else {
                    m1 = B[j++];
                }
            }
            return m1;
        }

        else {
            for (count = 0; count <= (n + m) / 2; count++) {
                m2 = m1;
                if (i != n && j != m) {
                    m1 = (A[i] > B[j]) ? B[j++] : A[i++];
                } else if (i < n) {
                    m1 = A[i++];
                }

                // for case when j<m,
                else {
                    m1 = B[j++];
                }
            }
            return (m1 + m2) / 2;
        }
    }

}