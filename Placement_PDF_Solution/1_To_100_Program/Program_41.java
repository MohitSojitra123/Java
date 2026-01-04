// You are given an integer num. Rearrange the digits of num such that its value is minimized 
// and it does not contain any leading zeros. 
// Return the rearranged number with minimal value. 
// Note that the sign of the number does not change after rearranging the digits. 
// Input: num = 310 
// Output: 103 
// Explanation:  The  possible  arrangements  for  the  digits  of  310  are  013,  031,  103,  130,  301, 
// 310.  
// The arrangement with the smallest value that does not contain any leading zeros is 103. 

import java.util.Scanner;

public class Program_41 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number To Rearrange : ");
        String input = sc.nextLine();

        boolean isNegative = false;

        // Check for negative sign
        if (input.charAt(0) == '-') {
            isNegative = true;
            input = input.substring(1);
        }

        // Validation: digits only
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                System.out.println("❌ Invalid input! Enter digits only.");
                return;
            }
        }

        // Convert to digit array
        char[] char_num = input.toCharArray();
        int[] num = new int[char_num.length];

        for (int i = 0; i < num.length; i++) {
            num[i] = char_num[i] - '0';
        }

        // Bubble sort
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {

                // Ascending for positive, Descending for negative
                if ((!isNegative && num[j] > num[j + 1]) ||
                    (isNegative && num[j] < num[j + 1])) {

                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        // Fix leading zero ONLY for positive
        if (!isNegative && num[0] == 0) {
            for (int i = 1; i < num.length; i++) {
                if (num[i] != 0) {
                    int temp = num[0];
                    num[0] = num[i];
                    num[i] = temp;
                    break;
                }
            }
        }

        // Build number
        int rearranged = 0;
        for (int i = 0; i < num.length; i++) {
            rearranged = rearranged * 10 + num[i];
        }

        // Restore negative sign
        if (isNegative) {
            rearranged = -rearranged;
        }

        System.out.println("Rearranged Number Is : " + rearranged);
    }
}
