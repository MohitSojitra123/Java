// WAP to find a power a^b (without using power and multiplication operation).

import java.util.Scanner;

public class Program_20_1 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter x : ");
      int x=sc.nextInt();

      System.out.println("Enter y : ");
      int y=sc.nextInt();

      int pow=1;

      for(int i=1; i<=y; i++){
           pow*=x;  
      }

      System.out.println("Power Is : "+pow);
    
    }
}
