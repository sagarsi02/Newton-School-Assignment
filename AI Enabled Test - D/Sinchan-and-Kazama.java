import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        System.out.print(Time(n, m, k));
    }

    static int Time(int A, int B, int S) {
        if (A > B) {
            return (A - B) / S;

        } else {
            return (B - A) / S;

        }

    }
}