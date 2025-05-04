package Recursion.BasicRecursion;

public class SumInRecursion {

      // 🔢 Parameterized way to calculate sum from n to 1
      // We pass 'currentNumber' and keep adding to 'accumulatedSum'
      public static void calculateSumParameterized(int currentNumber, int accumulatedSum) {
            // 🛑 Base case: stop when currentNumber goes below 1
            if (currentNumber < 1) {
                  System.out.println("Sum of numbers (parameterized): " + accumulatedSum);
                  return;
            }

            // 🔁 Recursive call with currentNumber - 1 and updated sum
            calculateSumParameterized(currentNumber - 1, accumulatedSum + currentNumber);
      }

      // 🧮 Functional way to calculate sum from n to 1
      // Returns the total sum as the function unwinds
      public static int calculateSumFunctional(int n) {
            // 🛑 Base case: sum of 0 is 0
            if (n == 0)
                  return 0;

            // 🔁 Return current number + recursive sum of smaller numbers
            return n + calculateSumFunctional(n - 1);
      }

      // ✳️ Functional way to calculate factorial of n (n * n-1 * ... * 1)
      public static int calculateFactorialFunctional(int n) {
            // 🛑 Base case: factorial of 0 is 1
            if (n == 0)
                  return 1;

            // 🔁 Return current number * factorial of (n - 1)
            return n * calculateFactorialFunctional(n - 1);
      }

      public static void main(String[] args) {
            int n = 4;

            // 🔸 Using parameterized approach to print sum directly
            // calculateSumParameterized(n, 0);

            // 🔹 Using functional approach to get sum
            // int totalSum = calculateSumFunctional(n);
            // System.out.println("Sum of numbers (functional): " + totalSum);

            // ✳️ Using functional approach to get factorial
            int factorial = calculateFactorialFunctional(n);
            System.out.println("Factorial (functional): " + factorial);
      }
}
