package Recursion.BasicRecursion;

public class PrintNumbers {

      // 🔁 Recursively print numbers from i to n (e.g., 1 to 4)
      public static void printNumbers(int i, int n) {
            // Base case: if i is greater than n, stop recursion
            if (i > n)
                  return;

            // Print the current value of i
            System.out.println(i);

            // Recursive call with i incremented
            printNumbers(i + 1, n);
      }

      // 🔁 Recursively print numbers from i to 1 (e.g., 4 to 1)
      public static void printReverseNumbers(int i, int n) {
            // Base case: if i is less than 1, stop recursion
            if (i < 1)
                  return;

            // Print the current value of i
            System.out.println(i);

            // Recursive call with i decremented
            printReverseNumbers(i - 1, n);
      }

      public static void main(String[] args) {
            int n = 4;

            // Prints: 1 2 3 4
            // printNumbers(1, n);

            // Prints: 4 3 2 1
            printReverseNumbers(n, n);
      }
}
