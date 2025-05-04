package Recursion.BasicRecursion;

public class StringPalindrome {

      // 🔁 Recursive method to check if string is a palindrome
      public static boolean checkIsPalindrome(int i, String str) {

            // 🛑 Base case: all characters matched
            if (i >= str.length() / 2) {
                  return true;
            }

            // ❌ If characters at mirrored positions don't match
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                  return false;
            }

            // 🔁 Recurse for next pair
            return checkIsPalindrome(i + 1, str);
      }

      public static void main(String[] args) {
            String str = "MADAM";

            // ✅ Check palindrome and print result
            boolean isPalindrome = checkIsPalindrome(0, str);
            System.out.println("Is \"" + str + "\" a palindrome? " + isPalindrome);
      }
}
