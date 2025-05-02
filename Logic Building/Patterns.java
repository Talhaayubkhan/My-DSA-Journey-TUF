import java.util.*;

public class Patterns {
      public static void patternsPrint(int n) {
            for (int i = 0; i < n; i++) { // Iterate over the rows
                  for (int j = 0; j < n; j++) { // Iterate over the columns
                        System.out.print("*"); // Print an asterisk
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      public static void patternsPrint1(int n) {

            for (int i = 0; i < n; i++) { // Iterate over the rows
                  for (int j = 0; j <= i; j++) { // Iterate over the columns
                        System.out.print("* ");
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      public static void patternsPrint2(int n) {

            for (int i = 1; i <= n; i++) { // Iterate over the rows
                  for (int j = 1; j <= i; j++) { // Iterate over the columns
                        System.out.print(j + " ");
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      public static void patternsPrint3(int n) {

            for (int i = 1; i <= n; i++) { // Iterate over the rows
                  for (int j = 1; j <= i; j++) { // Iterate over the columns
                        System.out.print(i + " ");
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      public static void patternsPrint4(int n) {

            for (int i = 1; i <= n; i++) { // Iterate over the rows
                  for (int j = 0; j < n - i + 1; j++) {
                        System.out.print("* ");
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      public static void patternsPrint5(int n) {

            for (int i = 1; i <= n; i++) { // Iterate over the rows
                  for (int j = 1; j <= n - i + 1; j++) {
                        System.out.print(j + " ");
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      public static void patternsPrint6(int n) {

            for (int i = 0; i < n; i++) { // Iterate over the rows
                  // spce for each column
                  for (int j = 0; j < n - i - 1; j++) {
                        System.out.print("  ");
                  }
                  for (int j = 0; j < 2 * i + 1; j++) {
                        System.out.print("* ");
                  }
                  // space for each column
                  for (int j = 0; j < n - i - 1; j++) {
                        System.out.print("  ");
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      public static void patternsPrint7(int n) {
            for (int i = 0; i < n; i++) {
                  // space for each column
                  for (int j = 0; j < i; j++) {
                        System.out.print("  ");
                  }

                  for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                        System.out.print("* ");
                  }
                  // space for each column
                  for (int j = 0; j < i; j++) {
                        System.out.print("  ");
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      public static void patternsPrint8(int n) {
            for (int i = 1; i <= 2 * n - 1; i++) { // Loop runs from 1 to (2 * n - 1)
                  int stars = i;
                  if (i > n) { // If i exceeds n, adjust stars
                        stars = 2 * n - i;
                  }
                  for (int j = 1; j <= stars; j++) { // Print 'stars' number of '*'
                        System.out.print("* ");
                  }
                  System.out.println(""); // Move to the next line
            }
      }

      public static void patternsPrint9(int n) {
            int start = 1;
            for (int i = 0; i < n; i++) {

                  if (i % 2 == 0) {
                        start = 1;
                  } else {
                        start = 0;
                  }

                  for (int j = 0; j <= i; j++) {
                        System.out.print(start);
                        start = 1 - start;
                  }
                  System.out.println();
            }

      }

      public static void patternsPrint10(int n) {

            int spaces = 2 * (n - 1);
            // outer loop
            for (int i = 1; i <= n; i++) {
                  // numbers
                  for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                  }
                  // space
                  for (int j = 1; j < spaces; j++) {
                        System.out.print(" ");
                  }
                  // numbers in opposite
                  for (int j = i; j >= 1; j--) {
                        System.out.print(j);
                  }
                  System.out.println();
                  spaces -= 2;
            }

      }

      public static void patternsPrint11(int n) {
            int num = 1;
            for (int i = 1; i <= n; i++) {
                  for (int j = 1; j <= i; j++) {
                        System.out.print(num + " ");
                        num = num + 1;
                  }
                  System.out.println();
            }
      }

      public static void patternPrint12(int n) {
            for (int i = 0; i < n; i++) {
                  for (char ch = 'A'; ch <= 'A' + i; ch++) {
                        System.out.print(ch + " ");
                  }
                  System.out.println();
            }

      }

      public static void patternPrint13(int n) {
            for (int i = 0; i < n; i++) {
                  for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                        System.out.print(ch + "");
                  }
                  System.out.println();
            }

      }

      public static void patternPrint14(int n) {
            for (int i = 0; i < n; i++) {
                  char ch = (char) ('A' + i);
                  for (int j = 0; j <= i; j++) {
                        System.out.print(ch + "");
                  }
                  System.out.println();
            }

      }

      public static void patternPrint15(int n) {

            for (int i = 0; i < n; i++) {
                  // spaces
                  for (int j = 0; j < n - i - 1; j++) {
                        System.out.print(" ");
                  }

                  // char
                  char ch = 'A';
                  int charBreakPoint = (2 * i + 1) / 2;
                  for (int j = 0; j < 2 * i + 1; j++) {
                        System.out.print(ch);
                        if (j < charBreakPoint) {
                              ch++;
                        } else {
                              ch--;
                        }
                  }

                  // spaces

                  for (int j = 0; j < n - i - 1; j++) {
                        System.out.print(" ");
                  }
                  System.out.println();
            }
      }

      public static void patternPrint16(int n) {

            for (int i = 0; i < n; i++) {

                  for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                        System.out.print(ch + " ");
                  }
                  System.out.println();
            }
      }

      public static void patternPrint17(int n) {
            int spaces = 0;
            for (int i = 0; i < n; i++) {

                  // stars
                  for (int j = 1; j <= n - i; j++) {
                        System.out.print("*");
                  }

                  // spaces
                  for (int j = 1; j <= spaces; j++) {
                        System.out.print(" ");
                  }

                  // stars
                  for (int j = 1; j <= n - i; j++) {
                        System.out.print("*");
                  }

                  spaces += 2;
                  System.out.println();
            }

            spaces = 2 * n - 2;
            for (int i = 1; i <= n; i++) {

                  // star
                  for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                  }

                  // space
                  for (int j = 1; j <= spaces; j++) {
                        System.out.print(" ");
                  }

                  // star
                  for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                  }
                  spaces -= 2;
                  System.out.println();
            }
      }

      public static void patternPrint18(int n) {

            int spaces = 2 * n - 2;

            for (int i = 1; i <= 2 * n - 1; i++) {
                  int stars = i;
                  if (i > n)
                        stars = 2 * n - i;

                  // stars
                  for (int j = 1; j <= stars; j++) {
                        System.out.print("*");
                  }

                  // spaces
                  for (int j = 1; j <= spaces; j++) {
                        System.out.print(" ");
                  }
                  // stars
                  for (int j = 1; j <= stars; j++) {
                        System.out.print("*");
                  }
                  System.out.println();
                  if (i < n)
                        spaces -= 2;

                  else
                        spaces += 2;
            }

      }

      public static void patternPrint19(int n) {

            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < n; j++) {
                        if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                              System.out.print("*");
                        } else {
                              System.out.print(" ");
                        }
                  }
                  System.out.println();
            }
      }

      public static void main(String[] args) {
            int n = 4;
            // patternsPrint(n);
            // patternsPrint1(n);
            // patternsPrint2(n);
            // patternsPrint3(n);
            // patternsPrint4(n);
            // patternsPrint5(n);
            // patternsPrint6(n);
            // patternsPrint7(n);
            // patternsPrint8(n);
            // patternsPrint9(n);
            // patternsPrint10(n);
            // patternsPrint11(n);
            // patternPrint12(n);
            // patternPrint13(n);
            // patternPrint14(n);
            // patternPrint15(n);
            // patternPrint16(n);
            // patternPrint17(n);
            // patternPrint18(n);
            patternPrint19(n);

      }
}
