// WAP to convert a Decimal to Binary.

import java.util.Scanner;

public class Program_30 {
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //    Scanner sc=new Scanner(System.in);
    
    
    //    System.out.println("Enter Binary Number To Conver Into Decimal : ");
    //    int Binary=sc.nextInt();
    
    //    int Decimal=0,last_digit=0,power=0;
    
    
    //    while(Binary>0){
    //     last_digit=Binary%10;
    //     Decimal+=(int)(last_digit*Math.pow(2, power));
    //     power++;
    //     Binary/=10;
    //    }
    
    //    System.out.println("Decimal Number Is : "+Decimal);
    
    // }    