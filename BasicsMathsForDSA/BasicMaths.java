package BasicsMathsForDSA;

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

      public static void main(String[] args) {
            int n = 7789;

            // // 🔢 Count digits (loop)
            // int count1 = countDigitsIterative(n);
            // System.out.println("Digit Count (Iterative) = " + count1);

            // // 🔢 Count digits (log10)
            // int count2 = countDigitsLog(n);
            // System.out.println("Digit Count (Log) = " + count2);

            // // 🔁 Reverse the number
            // int reversed = reverseDigit(n);
            // System.out.println("Reversed Number = " + reversed);

            // 🔍 Check palindrome
            if (isPalindrome(n)) {
                  System.out.println("Yes, it is a Palindrome.");
            } else {
                  System.out.println("No, it is NOT a Palindrome.");
            }
      }
}
