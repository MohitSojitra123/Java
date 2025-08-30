// Write a program that prompts the user to enter three numbers. Find the largest
// number.

import java.util.Scanner;

public class Program_5 {
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println("Enter value 1 => ");
          int value1=sc.nextInt();

          System.out.println("Enter Value 2 => ");
          int value2=sc.nextInt();

          if(value1 > value2){
               System.out.println("Value 1 Is Largest => "+value1);
          }else if(value2 > value1){
            System.out.println("Value 2 Is Largest => "+value2);
          }else{
            System.out.println("Value 1 and Value 2 Is Also Same ");
          }


     }
}
