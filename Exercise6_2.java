/*
Page 236
6.2 (Sum the digits in an integer) 
Write a method that computes the sum of the digits in an integer. 
   Use the following method header: 

      public static int sumDigits(long n)
   
   For example, sumDigits(234) returns 9 (2 + 3 + 4).

Hint:
Use the % operator to extract digits, and 
   use the / operator to remove the extracted digit. 
   For instance, to extract 4 from 234, use 234 % 10 (= 4). 
   To remove 4 from 234, use 234 / 10 (= 23). 
   Use a loop to repeatedly extract and remove the digit until 
      all the digits are extracted.
   Write a test program that 
      prompts the user to enter an integer and 
      displays the sum of all its digits.
*/

/* import java.util.Scanner;

public class Exercise6_2 {
	public static void main(String[] args) {
      // Enter a postive integer: Scanner(System.in) 
 
      // Call method sumDigits and then display the result

	} // end of main

	public static int sumDigits(long n) {
		int temp = (int)Math.abs(n);	// temp value
		int sum = 0;	// the sum of the digits

		// while (loop until all the digits are extracted) {
			// extract a digit (%)
			// add the extracted digit into sum
			// remove the extracted digit (/)
		// }
		// return the sum of the digits
		return sum;
	}	// end of sumDigits
} // end of Exercise6_2

/* Sample Run
   Enter a  number: 234
   The sum of digits for 234 is 9
*/

import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        int sum = sumDigits(number);

        System.out.println("The sum of digits for " + number + " is " + sum);
    }

    public static int sumDigits(long n) {
        int temp = (int) Math.abs(n); // Get the absolute value of n
        int sum = 0; // Initialize the sum of the digits

        while (temp > 0) {
            int digit = temp % 10; // Extract the last digit
            sum += digit; // Add the extracted digit to the sum
            temp /= 10; // Remove the last digit
        }

        return sum;
    }
}