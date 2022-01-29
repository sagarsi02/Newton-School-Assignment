import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int MB = sc.nextInt();
        int Mbps = sc.nextInt();
        int result = MB * 8 / (Mbps);
        System.out.println(result);
    }
}