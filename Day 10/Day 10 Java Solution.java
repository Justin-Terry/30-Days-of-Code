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
        int n = scanner.nextInt();
        int tempMax = 0;
        int max = 0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // While we have bits to process
        while(n >= 1) {
            if(n%2 == 1) {              // If the bit is going to be a 1
                tempMax++;              // Increment tempMax
                if(tempMax > max) {     
                    max = tempMax;      // Update max if a new max was found
                }
            } else {
                tempMax = 0;            // Reset temp max
            }
            n = n/2;                    // Remove the bit we've determined from n
        }

        System.out.println(max);
        scanner.close();
    }
}
