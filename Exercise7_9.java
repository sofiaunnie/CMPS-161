   // CMPS 161
        // Program Assignment 09
        // Sofiat Adeyemi
        // W0775327
/*
Page 282
7.9 (Finding the smallest element) 
Write a method that 
   finds the smallest element is an array of double using the following header: 

      public static double min(double[] array)

Write a test program that 
   prompts the user to enter 10 numbers, 
   invokes this method to return the minimum value, 
   and displays the minimum value. 
   Here is a sample run of the program:
   
      Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
      The minimum number is 1.5


import java.util.Scanner;

public class Exercise7_9 {
   public static void main(String[] args) {
      double[] numbers = new double[10];
  
      // Enter ten double numbers: Scanner(System.in) 

      // Call method min and then display the result
   }

   public static double min(double[] list) {
      double m = list[0]; 	// m is the smallest element

      // for (i = 1 to list.length - 1)
 	 	   // if (m is larger than list[i])
			   // list[i] is the new smallest element  

	   // return the smallest element, m 
      return m;
   }
}

/* Sample Run:
   Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
   The minimum number is 1.5

*/        
import java.util.Scanner;

public class Exercise7_9 {
    public static void main(String[] args) {
        double[] numbers = new double[10];

        // Enter ten double numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // Call method min and then display the result
        System.out.println("The minimum number is " + min(numbers));

        input.close();
    }

    public static double min(double[] list) {
        double m = list[0]; // m is the smallest element

        for (int i = 1; i < list.length; i++) {
            if (m > list[i]) {
                m = list[i]; // list[i] is the new smallest element
            }
        }

        // return the smallest element, m
        return m;
    }
}
