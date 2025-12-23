//        1 
//      212 
//    32123 
//  4321234 
//    32123 
//      212 
//        1 

import java.util.Scanner;

class Question_14{
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          int n;

        System.out.println("Enter N : ");
        n=sc.nextInt();

        for(int i=1; i<=n; i++){
            
            for(int space=n; space>i; space--){
                System.out.print(" ");
            }

            for(int j1=i; j1>=1; j1--){
                System.out.print(j1);
            }

            for(int j2=2; j2<=i; j2++){
                System.out.print(j2);
            }
          
            System.out.println("");
        }
      
        for(int i=n-1; i>=1; i--){

            for(int space=n; space>i; space--){
                System.out.print(" ");
            }

              for(int j1=i; j1>=1; j1--){
                System.out.print(j1);
              }

              for(int j2=2; j2<=i; j2++){
                System.out.print(j2);
              }
              System.out.println(" ");
        }

      }
}