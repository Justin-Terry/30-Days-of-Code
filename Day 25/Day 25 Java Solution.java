import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();

        for(int i = 0; i < T; i++){
            int isItPrime = input.nextInt();
            String result = "Prime";
            if(isItPrime == 1){
                result = "Not prime";
            }
            else{
                for(int j = 2; j < (int) Math.sqrt(isItPrime) + 1; j++) {
                    if(isItPrime % j == 0) {
                        result = "Not prime";
                        break;
                    }
                }
            }
            System.out.println(result);
        }
    }
}

