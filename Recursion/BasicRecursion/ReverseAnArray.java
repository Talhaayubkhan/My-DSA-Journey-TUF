package Recursion.BasicRecursion;

public class ReverseAnArray {

      // 🔁 Recursively reverses array elements from both ends
      public static void reverseArrayViaRecursion(int i, int[] arr, int n) {
            // 🛑 Base case: if i has reached or passed the middle, stop recursion
            if (i >= n / 2)
                  return;

            // 🔄 Swap elements at positions i and n - i - 1
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;

            // ⏭ Recursive call to move toward the center
            reverseArrayViaRecursion(i + 1, arr, n);
      }

      public static void main(String[] args) {
            int n = 5;
            int[] arr = { 1, 2, 3, 4, 5 }; // Original array

            // 🖨 Print original array
            System.out.println("Original array:");
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }
            System.out.println();

            // 🔁 Call recursive function to reverse array
            reverseArrayViaRecursion(0, arr, n);

            // 🖨 Print reversed array
            System.out.println("Reversed array:");
            for (int i = 0; i < arr.length; i++) {
                  System.out.print(arr[i] + " ");
            }
      }
}
