package BasicsMathsForDSA;

import java.util.*;

public class BasicMaths {

      // ✅ Method 1: Count digits using a loop
      public static int countDigitsIterative(int n) {
            // Time Complexity: O(log₁₀(n))
            // Space Complexity: O(1)
            if (n == 0)
                  return 1;

            int count = 0;
            while (n > 0) {
                  count++;
                  n = n / 10;
            }
            return count;
      }

      // ✅ Method 2: Count digits using log10
      public static int countDigitsLog(int n) {
            // Time Complexity: O(1)
            // Space Complexity: O(1)
            if (n == 0)
                  return 1;
            return (int) (Math.log10(n)) + 1;
      }

      // ✅ Reverse a number
      public static int reverseDigit(int n) {
            int reverseNum = 0;
            while (n > 0) {
                  int lastDigit = n % 10;
                  n = n / 10;
                  reverseNum = (reverseNum * 10) + lastDigit;
            }
            return reverseNum;
      }

      // ✅ Check if a number is a palindrome
      public static boolean isPalindrome(int n) {
            int reversed = reverseDigit(n);
            return reversed == n;
      }

      // ✅ Check if a number is an Armstrong number
      public static void isArmstrongNum(int n) {
            int sum = 0;
            int dup = n;
            int numDigits = countDigitsIterative(n);

            while (n > 0) {
                  int lastDigit = n % 10;
                  sum += Math.pow(lastDigit, numDigits);
                  n = n / 10;
            }

            if (sum == dup) {
                  System.out.println("Yes, it's an Armstrong Number!");
            } else {
                  System.out.println("No, it's NOT an Armstrong Number.");
            }
      }

      // ✅ Print all divisors of a number using √n optimization
      public static void printDivisors(int n) {
            // Time Complexity: O(√n + k log k), where k = number of divisors (for sorting)
            // Space Complexity: O(k), where k = number of divisors (stored in list)

            List<Integer> divisors = new ArrayList<>();

            for (int i = 1; i <= Math.sqrt(n); i++) {
                  if (n % i == 0) {
                        divisors.add(i);
                        if ((n / i) != i) {
                              divisors.add(n / i);
                        }
                  }
            }

            Collections.sort(divisors);

            System.out.print("Divisors of " + n + " are -> ");
            for (int d : divisors) {
                  System.out.print(d + " ");
            }
            System.out.println();
      }

      // ✅ Check if a number is Prime using √n optimization
      public static void isPrimeNum(int n) {
            // Time Complexity: O(√n)
            // Space Complexity: O(1)

            if (n <= 1) {
                  System.out.println("No, it is Not a Prime Number");
                  return;
            }

            int count = 0;

            for (int i = 1; i <= Math.sqrt(n); i++) {
                  if (n % i == 0) {
                        count++;
                        if ((n / i) != i) {
                              count++;
                        }
                  }
            }
            if (count == 2) {
                  System.out.println("Yes, It Is a Prime Number!");
            } else {
                  System.out.println("No, it is Not a Prime Number");
            }
      }

      // ✅ Main method to test
      public static void main(String[] args) {
            int n = 11;

            // 🔢 Count digits (loop)
            // int count1 = countDigitsIterative(n);
            // System.out.println("Digit Count (Iterative) = " + count1);

            // 🔢 Count digits (log10)
            // int count2 = countDigitsLog(n);
            // System.out.println("Digit Count (Log) = " + count2);

            // 🔁 Reverse the number
            // int reversed = reverseDigit(n);
            // System.out.println("Reversed Number = " + reversed);

            // 🔍 Check palindrome
            // if (isPalindrome(n)) {
            // System.out.println("Yes, it is a Palindrome.");
            // } else {
            // System.out.println("No, it is NOT a Palindrome.");
            // }

            // 🔎 Check Armstrong number
            // isArmstrongNum(n);

            // 🔢 Print divisors
            // printDivisors(n);

            // 🔎 Check Prime number
            isPrimeNum(n);
      }
}
