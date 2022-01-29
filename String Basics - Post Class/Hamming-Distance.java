import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    static void findString(String str, int n, int k) {
        // If k is 0, output input string
        if (k == 0) {
            System.out.println(str);
            ;
            return;
        }
        // Copying input string into output
        // string
        String str2 = str;
        int p = 0;

        // Traverse all the character of the
        // string
        for (int i = 0; i < n; i++) {
            // If current character is not 'a'
            if (str2.charAt(i) != 'a') {
                // copy character 'a' to
                // output string
                str2 = str2.substring(0, i) + 'a' + str2.substring(i + 1);
                // str2[i] = 'a';
                p++;
                // If hamming distance became k,
                // break;
                if (p == k) {
                    break;
                }
            }
        }

        // If k is less than p
        if (p < k) {
            // Traversing string in reverse
            // order
            for (int i = n - 1; i >= 0; i--) {
                if (str.charAt(i) == 'a') {
                    str2 = str2.substring(0, i) + 'b' + str2.substring(i + 1);
                    p++;
                    if (p == k) {
                        break;
                    }
                }
            }
        }

        System.out.println(str2);
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int k = 1;
        findString(str, n, k);
    }
}