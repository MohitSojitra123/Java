// WAP to find a Factor of a given number (iterative and recursive)

import java.util.Scanner;

public class Program_3_2 {

      static void Factor(int n,int i){
         if(i>n){
            return;
         }else{
               if(n%i==0){
                  System.out.print(i+" ");
               }
                 Factor(n,i+1);
         }
      }

    public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter Factor : ");
         int user_num=sc.nextInt();

         Program_3_2.Factor(user_num, 1);

    }
}
