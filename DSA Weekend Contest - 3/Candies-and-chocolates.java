import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    // Your code here
    public static void main(String[] args) throws IOException {
        String s;
        // Scanner sc = new Scanner(System.in);
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        s = br.readLine();
        // s = sc.next();
        int c = 0, t = 0;// candies and traversals
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'F') {
                if (i - c <= t && t != 0)
                    t++;
                else
                    t = i - c;
                c++;
            }
        }
        System.out.println(t);
    }
}