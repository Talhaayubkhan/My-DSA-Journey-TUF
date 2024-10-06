public class Patterns {
      public static void patternsPrint(int n) {
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < n; j++) {
                        System.out.print("*");
                  }
                  System.out.println();
            }
      }

      public static void patternsPrint2(int n) {
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                  }
                  System.out.println();
            }
      }

      public static void patternsPrint3(int n) {
            for (int i = 1; i <= n; i++) {
                  for (int j = 1; j <= i; j++) {
                        System.out.print(j + " ");
                  }
                  System.out.println();
            }
      }

      public static void patternsPrint4(int n) {
            for (int i = 1; i <= n; i++) {
                  for (int j = 1; j <= i; j++) {
                        System.out.print(i + " ");
                  }
                  System.out.println();
            }
      }

      public static void patternsPrint5(int n) {
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < n - i; j++) {
                        System.out.print("*");
                  }
                  System.out.println();
            }
      }

      public static void patternsPrint6(int n) {
            for (int i = 1; i <= n; i++) {
                  for (int j = 1; j <= n - i + 1; j++) {
                        System.out.print(j + "");
                  }
                  System.out.println();
            }
      }

      public static void patternsPrint7(int n) {
            for (int i = 0; i < n; i++) {
                  // space
                  for (int j = 0; j < n - i - 1; j++) {
                        System.out.print(" ");
                  }
                  // stars
                  for (int j = 0; j < 2 * i + 1; j++) {
                        System.out.print("*");
                  }
                  // space
                  for (int j = 0; j < n - i - 1; j++) {
                        System.out.print(" ");
                  }
                  System.out.println();
            }

      }

      public static void patternsPrint8(int n) {
            for (int i = 0; i < n; i++) {
                  // space
                  for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                  }
                  int starFormula = 2 * n - (2 * i + 1);
                  // stars
                  for (int j = 0; j < starFormula; j++) {
                        System.out.print("*");
                  }
                  // space
                  for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                  }
                  System.out.println();
            }

      }

      public static void patternsPrint9(int n) {

            for (int i = 1; i <= 2 * n - 1; i++) {
                  // tell n we print i
                  int starts = i;
                  if (i > n)
                        // but after i, then we reduce it so we use this formula!
                        starts = 2 * n - i;

                  for (int j = 1; j <= starts; j++) {
                        System.out.print("* ");
                  }

                  System.out.println();
            }

      }

      public static void patternsPrint10(int n) {
            int start = 1;
            for (int i = 0; i < n; i++) {
                  if (i % 2 == 0)
                        start = 1;
                  else
                        start = 0;
                  for (int j = 0; j <= i; j++) {
                        System.out.print(start);
                        start = 1 - start;
                  }
                  System.out.println();
            }

      }

      public static void patternsPrint11(int n) {

            int numFormula = 2 * (n - 1);
            for (int i = 1; i <= n; i++) {

                  // spce
                  for (int j = 1; j <= i; j++) {
                        System.out.print(j);
                  }
                  // numbers
                  for (int j = 1; j <= numFormula; j++) {
                        System.out.print(" ");
                  }
                  // space
                  for (int j = i; j >= 1; j--) {
                        System.out.print(j);
                  }
                  System.out.println();
                  numFormula -= 2;
            }

      }

      public static void patternsPrint12(int n) {
            n = 4;
            int num = 1;
            for (int i = 1; i <= n; i++) {
                  for (int j = 1; j <= i; j++) {
                        System.out.print(num + " ");
                        num++;
                  }
                  System.out.println();
            }
      }

      public static void patternsPrint13(int n) {

            for (int i = 1; i <= n; i++) {
                  char str = 'A';
                  for (int j = 1; j <= i; j++) {
                        System.out.print(str + " ");
                        str++;
                  }
                  System.out.println();
            }
      }

      public static void patternsPrint14(int n) {
            for (int i = 0; i < n; i++) {
                  // char ch = 'A';
                  for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                        System.out.print(ch + " ");
                        // ch++;
                  }
                  System.out.println();
            }
      }

      public static void patternsPrint15(int n) {

            char ch = 'A';
            for (int i = 1; i <= n; i++) {
                  for (int j = 1; j <= i; j++) {
                        System.out.print(ch + " ");
                  }
                  ch++;
                  System.out.println();
            }
      }

      public static void patternsPrint16(int n) {

            for (int i = 1; i <= n; i++) {
                  // space
                  for (int j = 1; j <= n - i + 1; j++) {
                        System.out.print(" ");
                  }
                  // characters
                  char ch = 'A';
                  int breakPoint = (2 * i - 1) / 2;
                  for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print(ch);
                        if (j <= breakPoint)
                              ch++;
                        else
                              ch--;
                  }
                  // space
                  for (int j = 1; j <= n - i + 1; j++) {
                        System.out.print(" ");
                  }
                  System.out.println();
            }
      }

      public static void patternsPrint17(int n) {
            for (int i = 1; i <= n; i++) {
                  for (char ch = (char) ('E' - i + 1); ch <= 'E'; ch++) {
                        System.out.print(ch + " ");
                  }
                  System.out.println();
            }
      }

      public static void patternsPrint18(int n) {

            int spces = 0;

            for (int i = 0; i < n; i++) {
                  // stars
                  for (int j = 1; j <= n - i; j++) {
                        System.out.print("*");
                  }
                  // spaces
                  for (int j = 1; j <= spces; j++) {
                        System.out.print(" ");
                  }

                  for (int j = 1; j <= n - i; j++) {
                        System.out.print("*");
                  }
                  spces += 2;
                  System.out.println();
            }

            spces = 2 * n - 2;

            for (int i = 1; i <= n; i++) {
                  // stars
                  for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                  }
                  // spaces
                  for (int j = 1; j <= spces; j++) {
                        System.out.print(" ");
                  }

                  for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                  }
                  spces -= 2;
                  System.out.println();
            }

      }

      public static void patternsPrint19(int n) {

            int spaces = 2 * n - 2;

            for (int i = 1; i <= 2 * n - 1; i++) {
                  int stars = i;
                  if (i > n)
                        stars = 2 * n - i;
                  // star
                  for (int j = 1; j <= stars; j++) {
                        System.out.print("*");
                  }
                  // spaces
                  for (int j = 1; j <= spaces; j++) {
                        System.out.print(" ");
                  }
                  // star
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

      public static void patternsPrint20(int n) {

            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < n; j++) {

                        if (i == 0 || j == 0 || i == n - 1 || j == n - 1)

                              System.out.print("*");
                        else
                              System.out.print(" ");
                  }
                  System.out.println();
            }
      }

      public static void patternsPrint21(int n) {

            for (int i = 0; i < 2 * n - 1; i++) {
                  for (int j = 0; j < 2 * n - 1; j++) {
                        int top = i;
                        int left = j;
                        int right = (2 * n - 2) - j;
                        int down = (2 * n - 2) - i;

                        int calculate = n - Math.min(Math.min(top, down), Math.min(left, right));

                        System.out.print(calculate + " ");
                  }
                  System.out.println();
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
            // patternsPrint16(n);
            // patternsPrint17(n);
            // patternsPrint18(n);
            // patternsPrint19(n);
            // patternsPrint20(n);
            patternsPrint21(n);
      }
}
