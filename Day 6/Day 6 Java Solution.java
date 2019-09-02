import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your             class should be named Solution. */

        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();
        input.nextLine();
        
        String[] finished = new String[tests];

        for(int i = 0; i < tests; i++) {
            finished[i] = input.nextLine();
        }
        for(String s: finished) {
            printTheLetters(s);
        }
    }

    public static void printTheLetters(String str) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(isEven(i) || i == 0) {
                sb2.append(str.charAt(i));
            } else {
                sb1.append(str.charAt(i));
            }
        }
        System.out.println(sb2.toString() + " " + sb1.toString());

    }

    public static boolean isEven(int n) {
        if(n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

