public class Patterns {
      public static void patternsPrint(int n) {
            for (int i = 0; i < n; i++) { // Iterate over the rows
                  for (int j = 0; j < n; j++) { // Iterate over the columns
                        System.out.print("*"); // Print an asterisk
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      // Method to print a right-angled triangle pattern of asterisks
      public static void patternsPrint2(int n) {
            for (int i = 0; i < n; i++) { // Iterate over the rows
                  for (int j = 0; j <= i; j++) { // Print asterisks equal to the current row number
                        System.out.print("*"); // Print an asterisk
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      // Method to print a right-angled triangle of numbers
      public static void patternsPrint3(int n) {
            for (int i = 1; i <= n; i++) { // Iterate over the rows
                  for (int j = 1; j <= i; j++) { // Print numbers from 1 to the current row number
                        System.out.print(j + " "); // Print the number followed by a space
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      // Method to print a right-angled triangle pattern with the same number in each
      // row
      public static void patternsPrint4(int n) {
            for (int i = 1; i <= n; i++) { // Iterate over the rows
                  for (int j = 1; j <= i; j++) { // Print the current row number multiple times
                        System.out.print(i + " "); // Print the current row number followed by a space
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      // Method to print an inverted right-angled triangle pattern of asterisks
      public static void patternsPrint5(int n) {
            for (int i = 0; i < n; i++) { // Iterate over the rows
                  for (int j = 0; j < n - i; j++) { // Print asterisks decreasing with each row
                        System.out.print("*"); // Print an asterisk
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      // Method to print a triangle of numbers in descending order
      public static void patternsPrint6(int n) {
            for (int i = 1; i <= n; i++) { // Iterate over the rows
                  for (int j = 1; j <= n - i + 1; j++) { // Print numbers from 1 to the current limit
                        System.out.print(j + ""); // Print the number without a space
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      // Method to print a pyramid pattern of asterisks
      public static void patternsPrint7(int n) {
            for (int i = 0; i < n; i++) { // Iterate over the rows
                  // Print leading spaces
                  for (int j = 0; j < n - i - 1; j++) {
                        System.out.print(" "); // Print a space
                  }
                  // Print asterisks in a pyramid shape
                  for (int j = 0; j < 2 * i + 1; j++) {
                        System.out.print("*"); // Print an asterisk
                  }
                  // Print trailing spaces
                  for (int j = 0; j < n - i - 1; j++) {
                        System.out.print(" "); // Print a space
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      // Method to print an inverted pyramid pattern of asterisks
      public static void patternsPrint8(int n) {
            for (int i = 0; i < n; i++) { // Iterate over the rows
                  // Print leading spaces
                  for (int j = 0; j < i; j++) {
                        System.out.print(" "); // Print a space
                  }
                  int starFormula = 2 * n - (2 * i + 1); // Calculate number of asterisks to print
                  for (int j = 0; j < starFormula; j++) {
                        System.out.print("*"); // Print an asterisk
                  }
                  // Print trailing spaces
                  for (int j = 0; j < i; j++) {
                        System.out.print(" "); // Print a space
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      // Method to print a diamond shape of asterisks
      public static void patternsPrint9(int n) {
            for (int i = 1; i <= 2 * n - 1; i++) { // Iterate over rows
                  int starts = i; // Determine how many asterisks to print
                  if (i > n)
                        starts = 2 * n - i; // Adjust for the second half of the diamond

                  for (int j = 1; j <= starts; j++) {
                        System.out.print("* "); // Print an asterisk with a space
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      // Method to print a triangle pattern of alternating 1s and 0s
      public static void patternsPrint10(int n) {
            int start = 1; // Start with 1
            for (int i = 0; i < n; i++) { // Iterate over the rows
                  // Alternate starting number based on row number
                  if (i % 2 == 0)
                        start = 1; // Even row starts with 1
                  else
                        start = 0; // Odd row starts with 0
                  for (int j = 0; j <= i; j++) { // Print numbers for the current row
                        System.out.print(start); // Print the starting number
                        start = 1 - start; // Toggle between 0 and 1
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      // Method to print a pattern with numbers and spaces in a diamond shape
      public static void patternsPrint11(int n) {
            int numFormula = 2 * (n - 1); // Initial spacing between numbers
            for (int i = 1; i <= n; i++) { // Iterate over rows
                  // Print increasing numbers
                  for (int j = 1; j <= i; j++) {
                        System.out.print(j); // Print the number
                  }
                  // Print spaces between the numbers
                  for (int j = 1; j <= numFormula; j++) {
                        System.out.print(" "); // Print a space
                  }
                  // Print decreasing numbers
                  for (int j = i; j >= 1; j--) {
                        System.out.print(j); // Print the number
                  }
                  System.out.println(); // Move to the next line after each row
                  numFormula -= 2; // Decrease the space for the next row
            }
      }

      // Method to print a triangle pattern with increasing numbers
      public static void patternsPrint12(int n) {
            n = 4; // Fixed size for this pattern
            int num = 1; // Starting number
            for (int i = 1; i <= n; i++) { // Iterate over rows
                  for (int j = 1; j <= i; j++) { // Print increasing numbers
                        System.out.print(num + " "); // Print the current number
                        num++; // Increment the number
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      // Method to print a triangle pattern with characters
      public static void patternsPrint13(int n) {
            for (int i = 1; i <= n; i++) { // Iterate over rows
                  char str = 'A'; // Starting character
                  for (int j = 1; j <= i; j++) { // Print increasing characters
                        System.out.print(str + " "); // Print the current character
                        str++; // Move to the next character
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      // Method to print a triangle pattern of decreasing characters
      public static void patternsPrint14(int n) {
            for (int i = 0; i < n; i++) { // Iterate over rows
                  for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) { // Print characters in decreasing order
                        System.out.print(ch + " "); // Print the character
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      public static void patternsPrint15(int n) {
            char ch = 'A'; // Starting character
            for (int i = 1; i <= n; i++) { // Iterate over rows
                  for (int j = 1; j <= i; j++) { // Print increasing characters
                        System.out.print(ch + " "); // Print the current character
                  }
                  ch++; // Move to the next character
                  System.out.println(); // Move to the next line after each row
            }
      }

      // Method to print a pyramid pattern of characters that increase then decrease
      public static void patternsPrint16(int n) {
            for (int i = 1; i <= n; i++) { // Iterate over rows
                  // Print leading spaces for pyramid shape
                  for (int j = 1; j <= n - i + 1; j++) {
                        System.out.print(" "); // Print a space
                  }
                  char ch = 'A'; // Starting character
                  int breakPoint = (2 * i - 1) / 2; // Calculate midpoint for increasing/decreasing characters
                  for (int j = 1; j <= 2 * i - 1; j++) { // Print characters in the current row
                        System.out.print(ch); // Print the current character
                        if (j <= breakPoint) // Check if in the first half
                              ch++; // Increase character
                        else
                              ch--; // Decrease character after midpoint
                  }
                  // Print trailing spaces
                  for (int j = 1; j <= n - i + 1; j++) {
                        System.out.print(" "); // Print a space
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      // Method to print a triangle pattern of decreasing characters starting from 'E'
      public static void patternsPrint17(int n) {
            for (int i = 1; i <= n; i++) { // Iterate over rows
                  for (char ch = (char) ('E' - i + 1); ch <= 'E'; ch++) { // Print decreasing characters
                        System.out.print(ch + " "); // Print the current character
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      // Method to print a pattern with two mirrored triangles
      public static void patternsPrint18(int n) {
            int spces = 0; // Initialize spaces for the top half

            // Top half of the pattern
            for (int i = 0; i < n; i++) { // Iterate for the top half rows
                  // Print left triangle of stars
                  for (int j = 1; j <= n - i; j++) {
                        System.out.print("*"); // Print a star
                  }
                  // Print spaces in the middle
                  for (int j = 1; j <= spces; j++) {
                        System.out.print(" "); // Print a space
                  }
                  // Print right triangle of stars
                  for (int j = 1; j <= n - i; j++) {
                        System.out.print("*"); // Print a star
                  }
                  spces += 2; // Increase spaces for the next row
                  System.out.println(); // Move to the next line after each row
            }

            spces = 2 * n - 2; // Reset spaces for the bottom half

            // Bottom half of the pattern
            for (int i = 1; i <= n; i++) { // Iterate for the bottom half rows
                  // Print left triangle of stars
                  for (int j = 1; j <= i; j++) {
                        System.out.print("*"); // Print a star
                  }
                  // Print spaces in the middle
                  for (int j = 1; j <= spces; j++) {
                        System.out.print(" "); // Print a space
                  }
                  // Print right triangle of stars
                  for (int j = 1; j <= i; j++) {
                        System.out.print("*"); // Print a star
                  }
                  spces -= 2; // Decrease spaces for the next row
                  System.out.println(); // Move to the next line after each row
            }
      }

      // Method to print a pattern with two mirrored pyramids
      public static void patternsPrint19(int n) {
            int spaces = 2 * n - 2; // Initialize spaces for the pattern

            for (int i = 1; i <= 2 * n - 1; i++) { // Iterate for each row
                  int stars = i; // Set number of stars for the current row
                  if (i > n)
                        stars = 2 * n - i; // Adjust number of stars for the second half
                  // Print left triangle of stars
                  for (int j = 1; j <= stars; j++) {
                        System.out.print("*"); // Print a star
                  }
                  // Print spaces in the middle
                  for (int j = 1; j <= spaces; j++) {
                        System.out.print(" "); // Print a space
                  }
                  // Print right triangle of stars
                  for (int j = 1; j <= stars; j++) {
                        System.out.print("*"); // Print a star
                  }
                  System.out.println(); // Move to the next line after each row
                  if (i < n)
                        spaces -= 2; // Decrease spaces for the upper part
                  else
                        spaces += 2; // Increase spaces for the lower part
            }
      }

      // Method to print a hollow square pattern
      public static void patternsPrint20(int n) {
            for (int i = 0; i < n; i++) { // Iterate over rows
                  for (int j = 0; j < n; j++) { // Iterate over columns
                        // Check if we're on the border of the square
                        if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                              System.out.print("*"); // Print a star for borders
                        else
                              System.out.print(" "); // Print a space inside the hollow square
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      // Method to print a concentric square pattern
      public static void patternsPrint21(int n) {
            for (int i = 0; i < 2 * n - 1; i++) { // Iterate over each row
                  for (int j = 0; j < 2 * n - 1; j++) { // Iterate over each column
                        int top = i; // Distance from top edge
                        int left = j; // Distance from left edge
                        int right = (2 * n - 2) - j; // Distance from right edge
                        int down = (2 * n - 2) - i; // Distance from bottom edge

                        // Calculate the minimum distance from any edge
                        int calculate = n - Math.min(Math.min(top, down), Math.min(left, right));
                        System.out.print(calculate + " "); // Print the calculated value
                  }
                  System.out.println(); // Move to the next line after each row
            }
      }

      public static void main(String[] args) {
            int n = 4;
            // patternsPrint(n);
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
            // patternsPrint12(n);
            // patternsPrint13(n);
            // patternsPrint14(n);
            // patternsPrint15(n);
            patternsPrint16(n);
            // patternsPrint17(n);
            // patternsPrint18(n);
            // patternsPrint19(n);
            // patternsPrint20(n);
            // patternsPrint21(n);
      }
}
