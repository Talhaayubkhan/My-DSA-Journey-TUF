package BasicsMathsForDSA;

import java.util.*;

public class CountDigits {

      // Method to count and print the digits of a given number
      public static void countDigits(int n) {
            // Initialize the count of digits to 0
            int count = 0;

            while (n > 0) {
                  // Extract the last digit of the number using modulus operator (%) and integer
                  // division (/)
                  int lastDigit = n % 10;
                  System.out.print(lastDigit + " "); // Print the last digit
                  // Increment the count of digits by 1 using the addition operator (+)
                  count++;
                  // Remove the last digit from the number by integer division (/)
                  n = n / 10;
            }
            System.out.print("-> Number of digits: " + count); // Print the total count of digits
      }

      // Main method to execute the program
      public static void main(String[] args) {
            int n = 7789; // Example number to test the methods
            countDigits(n); // Call the countDigits method with the given number
      }
}
