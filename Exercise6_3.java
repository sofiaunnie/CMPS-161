 // CMPS 161
        // Program Assignment 08
        // Sofiat Adeyemi
        // W0775327
/*
Page 236
6.3 (Palindrome integer) 
Write the following two methods:

   // Return the reversal of an integer, i.e. reverse(456) returns 654
   public static int reverse(int number)

   // Return true if number is palindrome
   public static boolean isPalindrome(int number)

   Use the reverse method to implement isPalindrome. 
   A number is a palindrome if its reversal is the same as itself. 
   Write a test program that prompts the user to enter an integer and 
      reports whether the integer is a palindrome.

Sample run
   Enter a postive integer: 1234321
   1234321 is palindrome


import java.util.Scanner;

public class Exercise6_3 {
   public static void main(String[] args) {
      // Enter a postive integer: Scanner(System.in) 

  	   // if (the integer is a palindrome)
	   //	   Display it is palindrome
	   // else
	   //	   Display it is not palindrome
   }
  
   public static boolean isPalindrome(int number) {
      // return if number is palindrome: call reverse method
   }

   public static int reverse(int number) {
      int result = 0;
		// while (loop until all the digits are extracted)
         // extract a digit (%)
         // add the extracted digit into its reversal
			// remove the extracted digit (/)
       return result;
   }
}

/* Sample run
   Enter a positive integer: 1234321
   1234321 is palindrome

*/        
import java.util.Scanner;

public class Exercise6_3 {
   public static void main(String[] args) {
      // Prompt the user to enter a positive integer
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a positive integer: ");
      int number = input.nextInt();

      // Check if the entered integer is a palindrome
      if (isPalindrome(number)) {
         System.out.println(number + " is a palindrome");
      } else {
         System.out.println(number + " is not a palindrome");
      }

      input.close();
   }

   public static boolean isPalindrome(int number) {
      // Check if the number is equal to its reverse
      return number == reverse(number);
   }

   public static int reverse(int number) {
      int result = 0;
      while (number != 0) {
         int digit = number % 10;
         result = result * 10 + digit;
         number /= 10;
      }
      return result;
   }
}
