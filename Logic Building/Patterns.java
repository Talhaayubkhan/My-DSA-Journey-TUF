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

      public static void main(String[] args) {
            int n = 4;
            // patternsPrint(n);
            // patternsPrint1(n);
            // patternsPrint2(n);
            // patternsPrint3(n);
            patternsPrint4(n);
      }
}
