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
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

			// If k <= n then it has the same or less bits as n. Therefore the max
            // difference would be one less than k since the challenge specifies that
            // the answer must be less than k
            if((k-1 | k) <= n){
                System.out.println(k-1);
            }
			// If k and k-1 > n then there is atleast one bit that will not match
            // therefore the max possible is k-2.
			else{
                System.out.println(k-2);
            }

        }

        scanner.close();
    }
}
