package BasicsMathsForDSA;

import java.util.*;

public class CountDigits {
      public static void countDigits(int n) {
            int count = 0;
            while (n > 0) {
                  int lastDigit = n % 10;
                  System.out.print(lastDigit + " ");
                  n = n / 10;
                  count++;
            }
            System.out.print(" -> total digits are : " + count);

      }

      public static void reverseNumber(int n) {
            int reverseNum = 0;

            while (n > 0) {
                  int lastDigit = n % 10;
                  reverseNum = (reverseNum * 10) + lastDigit;
                  n = n / 10;

            }
            System.out.println("Reverse number are : " + reverseNum);
      }

      public static void main(String[] args) {
            int n = 7789;
            // countDigits(n);
            reverseNumber(n);
            // int count = (int) (Math.log(n) + 1);
            // System.out.println(count);
      }
}
