// WAP to find a Factor of a given number (iterative and recursive)

import java.util.Scanner;

public class Program_3_1 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println("Enter Any Number To Find Factors : ");
          int user_num=sc.nextInt();

          for(int i=1; i<=user_num; i++){
            if(user_num%i==0){
                System.out.print(i+" ");
            }
          }
         

    }
}
