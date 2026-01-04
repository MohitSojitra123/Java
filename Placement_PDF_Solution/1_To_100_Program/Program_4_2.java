// WAP to find a factorial of a given integer (iterative and recursive) 

import java.util.Scanner;

public class Program_4_2 {

       static int factorial(int n){
           if(n==0){
               return 1;
           }else{
               return n* factorial(n-1);
           }
           
       }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter Any Number To Calculate Factorial : ");
         int user_num=sc.nextInt();

         int Factorial=Program_4_2.factorial(user_num);

         System.out.println("Factorial Is : "+Factorial);

    }
}
