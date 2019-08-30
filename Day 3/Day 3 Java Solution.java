import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(!isEven(N)) {
            System.out.println("Weird");
        } else if(inInclusiveRange(N, 0, 5) && isEven(N)) {
            System.out.println("Not Weird");
        } else if (inInclusiveRange(N, 6, 20) && isEven(N)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        scanner.close();
    }

    public static boolean isEven(int n) {
        if((n%2) == 0) {
            return true;
        }
        return false;
    }

    public static boolean inInclusiveRange(int n, int low, int high) {
        if(n >= low && n <= high) {
            return true;
        }
        return false;
    }
}
