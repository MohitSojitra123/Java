// WAP to convert a Binary to Decimal.  

import java.util.Scanner;

public class Program_26 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println("Enter Binary Number To Convert Decimal : ");
          int Binary=sc.nextInt();

          int Power=0;
          int Decimal=0;

          while(Binary>0){
              int Last_Digit=Binary%10;
              Decimal+=(int)Last_Digit*Math.pow(2, Power);
              Power++;
              Binary/=10;
          }

          System.out.println("Decimal : "+Decimal);
                  
    }
}
