package CMPS161;
//
//2.13 (Financial application: compound value 
//Suppose you save $100 each month into a savings account 
//with the annual interest rate 5%. 
//Thus, the monthly interest rate is 0.05/12  = 0.00417. 
//
//After the first month, the value in the account becomes
//100 * (1 + 0.00417) = 100.417
//After the second month, the value in the account becomes
//(100 + 100.417) * (1 + 0.00417) = 201.252 
//After the third month, the value in the account becomes
//(100 + 201.252) * (1 + 0.00417) = 302.507 
//and so on.
//
//Write a program that prompts the user to enter a monthly saving amount and 
//displays the account value after the sixth month. (In Exercise 5.30, 
//you will use a loop to simplify the code and 
//display the account value for any month.)
//
//Enter the monthly saving amount: 100
//After the sixth month, the account value is $608.81
//

import java.util.Scanner;

public class Exercise2_13 {
	public static void main(String[] args) {

	   // Enter monthly saving: a positive integer

		// Original account value

    	// After the first month account value
 
     	// After the second month account value
		
    	// After the third month account value
  
    	// After the fourth month account value
  
    	// After the fifth month account value
  
    	// After the sixth month account value
  
		// Display the sixth month account value
		
//		        Scanner input = new Scanner(System.in);
//
//		        System.out.print("Enter the monthly saving amount: ");
//		        double monthlySavingAmount = input.nextDouble();
//		        double annualInterestRate = 0.05; // 5% annual interest rate
//		        double monthlyInterestRate = annualInterestRate / 12;
//
//		        // Calculate the account value after the sixth month
//		        double accountValue = 0;
//		        for (int i = 0; i < 6; i++) {
//		            accountValue = (accountValue + monthlySavingAmount) * (1 + monthlyInterestRate);
//		        }
//
//		        System.out.printf("After the sixth month, the account value is $%.2f%n", accountValue);
				

		        Scanner input = new Scanner(System.in);

		        // Constants
		        double monthlySavingAmount, annualInterestRate, monthlyInterestRate;
		        int months = 6;

		        // Prompt the user to enter the monthly saving amount
		        System.out.print("Enter the monthly saving amount: ");
		        monthlySavingAmount = input.nextDouble();

		        // Calculate monthly and annual interest rates
		        annualInterestRate = 0.05;
		        monthlyInterestRate = annualInterestRate / 12;

		        // Calculate the account value after the sixth month
		        double accountValue = 0;
		        for (int i = 0; i < months; i++) {
		            accountValue = (accountValue + monthlySavingAmount) * (1 + monthlyInterestRate);
		        }

		        // Display the result
		        System.out.println("After the sixth month, the account value is: $" + accountValue);

		        input.close();
		

	}

		
}

/* Sample Run
	Enter the monthly saving amount: 100
	After the sixth month, the account value is $608.8181155768638
*/

