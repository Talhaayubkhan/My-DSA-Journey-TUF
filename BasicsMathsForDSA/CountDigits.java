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

      public static void isNumPalindrome(int n) {
            // Initialize variables
            int reverseNum = 0;
            // Store original number for later comparison
            // The value of n will become 0 during the reversal process,
            // so we store a duplicate of n first to check for palindrome later
            int duplicateNum = n;

            // Reverse the number
            while (n > 0) {
                  int lastDigit = n % 10; // Get the last digit of the number
                  n = n / 10; // Remove the last digit from the number
                  reverseNum = (reverseNum * 10) + lastDigit; // Add the last digit to the reversed number
            }

            // Check if the number is a palindrome
            if (duplicateNum == reverseNum) {
                  System.out.println("Palindrome Number");
            } else {
                  System.out.println("Not a Palindrome Number");
            }
      }

      // Armstrong number is a number that is equal to the sum of its own digits each
      // raised to the power of the number of digits.
      public static void isArmstrong(int n) {
            // Initialize sum to 0
            int sum = 0;
            // Store original number for later comparison
            int duplicateNum = n;

            // Loop to calculate the sum of the cubes of the digits
            while (n > 0) {
                  // Get the last digit of the number
                  int lastDigit = n % 10;
                  // Add the cube of the last digit to the sum
                  sum = sum + (lastDigit * lastDigit * lastDigit);
                  // Remove the last digit from the number
                  n = n / 10;
            }

            // Check if the number is an Armstrong number
            if (sum == duplicateNum) {
                  System.out.println("Armstrong Number");
            } else {
                  System.out.println("Not an Armstrong Number");
            }

      }

      public static void printAllDivisonOfNum(int n) {
            // Loop to print all divisors of the number
            for (int i = 1; i <= n; i++) {
                  // Check if i is a divisor of n
                  if (n % i == 0)
                        System.out.print(" " + i + " ");
            }

      }

      // Main method to execute the program
      public static void main(String[] args) {
            int n = 36; // Example number to test the methods

            // Uncomment the line below to count and print the digits
            // countDigits(n);

            // Call the method to reverse the number and print the result
            // reverseNumber(n);

            // Call the method to check if the number is a palindrome
            // isNumPalindrome(n);

            // Call the method to check if the number is an Armstrong number
            // isArmstrong(n);

            // Call the method to print all divisors of the number
            printAllDivisonOfNum(n);

            // Optionally, count the number of digits using logarithm (not used in this
            // implementation)
            // int count = (int) (Math.log(n) + 1);
            // System.out.println("Count using logarithm: " + count);
      }
}
