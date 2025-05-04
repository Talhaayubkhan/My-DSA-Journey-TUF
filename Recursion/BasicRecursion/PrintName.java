package Recursion.BasicRecursion;

public class PrintName {

      public static void printNameViaRecursion(int i, int n) {
            // base case
            if (i > n)
                  return;
            System.out.println("Talha");
            printNameViaRecursion(i + 1, n);
      }

      public static void main(String[] args) {

            int n = 4;

            printNameViaRecursion(1, n);
      }
}
