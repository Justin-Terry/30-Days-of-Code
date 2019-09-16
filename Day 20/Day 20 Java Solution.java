import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here

        int numSwaps = 0;
        int thisRound = 1;

        while(thisRound > 0){
            thisRound = 0;
            for(int i = 0; i < a.length - 1; i++) {
                if(a[i] > a[i+1]){
                    swap(a, i, i+1);
                    numSwaps++;
                    thisRound++;
                }
            }
        }

        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);

    }

    public static void swap(int[] a, int n, int m) {
        int temp = a[n];
        a[n] = a[m];
        a[m] = temp;
    }
}

