package CMPS161;

//CMPS 161
// Program Assignment 04
// Sofiat Adeyemi
// W0775327

/*
Page 113
3.19 (Compute the perimeter of a triangle) 
Write a program that 
	reads three edges for a triangle and 
	computes the perimeter if the input is valid. 
	Otherwise, display that the input is invalid. 
	
	The input is valid if the sum of every pairs of two edges 
		is greater than the remaining edge
*/

import java.util.Scanner;

public class Exercise3_19 {
   public static void main(String[] args) {

      // Enter three edges: Scanner(System.in) 

      // Display results
	   // if (the sum of every pairs of two edges 
      //       is greater than the remaining edge)
	   //	   Display the perimeter of the triangle
	   // else
	   //	   Display the input is invalid
      
          Scanner input = new Scanner(System.in);
      
     // Prompt the user to enter the first edge
        System.out.print("Enter the length of the first edge: ");
        double edge1 = input.nextDouble();

        // Prompt the user to enter the second edge
        System.out.print("Enter the length of the second edge: ");
        double edge2 = input.nextDouble();

        // Prompt the user to enter the third edge
        System.out.print("Enter the length of the third edge: ");
        double edge3 = input.nextDouble();

        // Check if the input forms a valid triangle
        boolean isValidTriangle = isValidTriangle(edge1, edge2, edge3);

        if (isValidTriangle) {
            // Calculate the perimeter of the triangle
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter of the triangle is: " + perimeter);
        } else {
            System.out.println("Input is Invalid.");
        }

        input.close();
    }

    // Function to check if the input forms a valid triangle
    public static boolean isValidTriangle(double edge1, double edge2, double edge3) {
        return (edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge2 + edge3 > edge1);
    
   }
}

/* Sample Run
    Enter three edges: 3.0 4.0 5.0
    The perimeter of the triangle is 12.0

    Enter three edges: 1.0 2.0 3.0
    Input is invalid
*/