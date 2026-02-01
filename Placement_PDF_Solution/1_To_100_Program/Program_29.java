// WAP to find a quotient and reminder of 2 number (bigger number should be divided by 
// lower number) and you are not allowed to use a division and quotient operator.

import java.util.Scanner;

public class Program_29 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println("Enter Number 1 : ");
          int num1=sc.nextInt();

          System.out.println("Enter Number 2 : ");
          int num2=sc.nextInt();

          int bigger,smaller;

          if(num1>num2){
                bigger=num1;
                smaller=num2;
          }else{
            bigger=num2;
            smaller=num1;
          }

          int reminder=bigger;
          int quotient=0;

          while (reminder>=smaller) {
                 reminder=reminder-smaller;
                 quotient++;
          }

          System.out.println("Reminde Is : "+reminder);
          System.out.println("Quotien Is : "+quotient);

    }
}
