package BasicsMathsForDSA;

import java.util.*;

public class CountDigits {

      // Method to count and print the digits of a given number
      public static void countDigits(int n) {
            int count = 0; // Initialize digit count
            System.out.print("Digits: "); // Print label for digits output

            // Loop to extract and print each digit
            while (n > 0) {
                  int lastDigit = n % 10; // Get the last digit
                  System.out.print(lastDigit + " "); // Print the last digit
                  n = n / 10; // Remove the last digit from the number
                  count++; // Increment the digit count
            }

            // Print the total number of digits
            System.out.print(" -> Total digits are: " + count);
      }

      // Method to reverse a given number
      public static void reverseNumber(int n) {
            int reverseNum = 0; // Initialize reversed number

            // Loop to reverse the digits of the number
            while (n > 0) {
                  int lastDigit = n % 10; // Get the last digit
                  reverseNum = (reverseNum * 10) + lastDigit; // Build the reversed number
                  n = n / 10; // Remove the last digit from the number
            }

            // Print the reversed number
            System.out.println("Reversed number: " + reverseNum);
      }

      // Main method to execute the program
      public static void main(String[] args) {
            int n = 7789; // Example number to test the methods

            // Uncomment the line below to count and print the digits
            // countDigits(n);

            // Call the method to reverse the number and print the result
            reverseNumber(n);

            // Optionally, count the number of digits using logarithm (not used in this
            // implementation)
            // int count = (int) (Math.log(n) + 1);
            // System.out.println("Count using logarithm: " + count);
      }
}
