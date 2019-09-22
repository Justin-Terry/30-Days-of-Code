import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);

        String[] returned = input.nextLine().split(" ");
        String[] dueDate = input.nextLine().split(" ");

        int fee = 0;

        if(Integer.parseInt(returned[2]) == Integer.parseInt(dueDate[2])) {
            // Same Year
            if(Integer.parseInt(returned[1]) == Integer.parseInt(dueDate[1])){
                // Same Month
                if(Integer.parseInt(returned[0]) > Integer.parseInt(dueDate[0])){
                    fee = (Integer.parseInt(returned[0]) - Integer.parseInt(dueDate[0])) * 15;
                } 
            }else{
                if(Integer.parseInt(returned[1]) > Integer.parseInt(dueDate[1])){
                    fee = (Integer.parseInt(returned[1]) - Integer.parseInt(dueDate[1])) * 500;
                }
            }
        } else {
            // Fixed fee
            if(Integer.parseInt(returned[2]) > Integer.parseInt(dueDate[2])){
                fee = 10000;
            }
        }
        System.out.println(fee);
    }
}

