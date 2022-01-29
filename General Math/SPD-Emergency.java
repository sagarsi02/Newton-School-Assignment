import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int p[] = new int[5];
        for (int i = 0; i < 5; i++) {
            p[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + p[i];
        }
        boolean check = true;
        for (int i = 0; i < 5; i++) {
            if (sum - p[i] <= p[i]) {
                System.out.println("SPD Emergency");
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Stable");
        }

    }

}