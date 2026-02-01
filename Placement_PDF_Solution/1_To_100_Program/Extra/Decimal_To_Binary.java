package Extra;

import java.util.Scanner;

public class Decimal_To_Binary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number To Convert Binary Number: ");
        int decimal = sc.nextInt();

        if (decimal == 0) {
            System.out.println("Binary Number: 0");
            return;
        }

        String binary = "";

        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal = decimal / 2;
        }

        System.out.println("Binary Number: " + binary);
    }
}

