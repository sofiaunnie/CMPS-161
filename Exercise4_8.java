//CMPS 161
// Program Assignment 05
// Sofiat Adeyemi
// W0775327

/*
Page 153
4.8 (Finding the character of an ASCII code) 
Write a program that receives an ASCII code 
	(an integer between 0 and 127) and displays its character. 
	
Here is a sample run:
	Enter an ASCII code: 69
	The character for ASCII code 69 is E
*/


import java.util.Scanner;

public class Exercise4_8 {
  public static void main(String[] args) {

    // Enter an ASCII code

    // Display result
    
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an ASCII code
        System.out.print("Enter an ASCII code (an integer between 0 and 127): ");
        int asciiCode = input.nextInt();

        // Check if the input is within the valid range
        if (asciiCode >= 0 && asciiCode <= 127) {
            // Convert the ASCII code to a character
            char character = (char) asciiCode;
            System.out.println("The character for ASCII code " + asciiCode + " is " + character);
        } else {
            System.out.println("Invalid input. The ASCII code must be between 0 and 127.");
        }

        input.close();
  }
}

/* Sample Run
    Enter an ASCII code: 69
    The character for ASCII code 69 is E
*/