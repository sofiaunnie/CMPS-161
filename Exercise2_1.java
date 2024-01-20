package CMPS161;

//CMPS 161
//Program Assignment 02
//Sofiat Adeyemi
//W0775327

/*
Page 70
2.1 (Converting Celsius	to	Fahrenheit)	
Write	a program that	
	reads	a Celsius degree in double	from the	console,	
	then coverts it to Fahrenheit	and displays the result. 
	The formula	for the conversion is as follows:

		fahrenheit = (9 /	5)	* celsius +	32

	Hint:	In	Java,	9 / 5	is	1,	but 9.0 / 5	is	1.8.
	Here is a sample run:

		Enter	a temperature in Celsius: 43
		43.0 Celsius is 109.4 Fahrenheit
*/

import java.util.Scanner;

public class Exercise2_1 {
   public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);
		        
		        // Read Celsius degree from the user
		        System.out.print("Enter a temperature in celsius: ");
		        double celsius = scanner.nextDouble();
		        
		        // Calculate Fahrenheit using the formula
		        double fahrenheit = (9.0 / 5.0) * celsius + 32;
		        
		        // Display the result
		        System.out.println(celsius +" Celsius is "+ fahrenheit + " Fahrenheit ");
		        
		        scanner.close();
		 

        
	   // Enter a temperature in celsius

	   // Convert celsius to fahrenheit

	   // Display the result
   }
}

/* Sample Run
    Enter a temperature in Celsius: 43
    43.0 Celsius is 109.4 Fahrenheit
*/