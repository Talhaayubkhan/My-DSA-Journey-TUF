package Recursion.BasicRecursion;

public class PrintNumbersvBackTrack {

      // 🔁 Print numbers from 1 to n using backtracking (called with n to 1)
      public static void printNumBackTrack(int i, int n) {
            // Base case: if i is less than 1, stop recursion
            if (i < 1)
                  return;

            // Recursive call first (goes deep to i=1)
            printNumBackTrack(i - 1, n);

            // Print happens after recursive call → backtracking style
            System.out.println(i);
      }

      // 🔁 Print numbers from n to 1 using backtracking (called from 1 to n)
      public static void printNumBackTracInReverse(int i, int n) {
            // Base case: if i > n, stop recursion
            if (i > n)
                  return;

            // Recursive call first (goes deep to i=n)
            printNumBackTracInReverse(i + 1, n);

            // Print happens after recursive call → backtracking style
            System.out.println(i);
      }

      public static void main(String[] args) {
            int n = 4;

            // Prints: 1 2 3 4 (backtracking from n to 1)
            // printNumBackTrack(n, n);

            // Prints: 4 3 2 1 (backtracking from 1 to n)
            printNumBackTracInReverse(1, n);
      }
}
