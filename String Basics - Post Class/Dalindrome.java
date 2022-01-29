import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static boolean check_Palindrome(String str, int s, int e) {
        boolean flag = true;
        if (s < e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            flag = check_Palindrome(str, s + 1, e - 1);
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int strLength = s.length();
        boolean flag = false;

        for (int i = 0; i < strLength - 1; i++) {
            if (flag) {
                break;
            }
            String str = s.substring(i);
            for (int j = str.length(); j > 1; j--) {
                String str2 = str.substring(0, j);
                int str2length = str2.length();
                if (check_Palindrome(str2, 0, str2length - 1)) {
                    flag = true;
                }
            }
        }
        if (strLength == 1) {
            flag = true;
        }
        if (flag) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}