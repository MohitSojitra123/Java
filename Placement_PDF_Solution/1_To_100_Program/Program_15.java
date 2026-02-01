// WAP to convert a Decimal number to BCD. 

import java.util.Scanner;

public class Program_15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number: ");
        int num = sc.nextInt();

        String bcd = "";

        while (num > 0) {
            int digit = num % 10;   
            String binary = "";

            for (int i = 0; i < 4; i++) {
                binary = (digit % 2) + binary;
                digit = digit / 2;
            }

            bcd = binary + " " + bcd;
            num = num / 10;
        }

        System.out.println("BCD Equivalent: " + bcd.trim());
    }
}

