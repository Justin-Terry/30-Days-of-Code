import java.io.*;
import java.util.*;

public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		if(initialAge >= 0) {
              age = initialAge;
          } else {
              age = 0;
              System.out.println("Age is not valid, setting age to 0.");
          }
	}

	public void amIOld() {
      
        if(inInclusiveRange(age, 0, 12)){
            System.out.println("You are young.");
        } else if(inInclusiveRange(age, 13, 17)){
            System.out.println("You are a teenager.");
        } else{
            System.out.println("You are old.");
        }
	}

    public static boolean inInclusiveRange(int n, int low, int high) {
        if(n >= low && n <= high) {
            return true;
        }
        return false;
    }

	public void yearPasses() {
  		// Increment this person's age.
          age++;
	}

	public static void main(String[] args) {