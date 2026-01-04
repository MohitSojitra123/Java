// WAP to find a factorial of a given integer (iterative and recursive) 

import java.util.Scanner;

public class Program_4_1 {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);

           System.out.println("Enter Any Number To Find Factorial : ");
           int user_num=sc.nextInt();

           int factorial=1;

           for(int i=1; i<=user_num; i++){
              factorial*=i;
           }

           System.out.println("Factorial Is : "+factorial);
    }
}
