// * * * * * * 
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *

import java.util.Scanner;

public class Program_22_2 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter N: ");
         int n=sc.nextInt();

        //  for(int i=1; i<=n; i++){
        //     for(int space=i; space>1; space--){
        //         System.out.print(" ");
        //     }
        //     for(int j=n; j>=i; j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //  }

        for(int i=n; i>=1; i--){

           for(int space=i; space<n; space++){
               System.err.print(" ");
           }
            for(int j=1; j<=i; j++){
                System.err.print("* ");
            }
            System.out.println();
        }

    }
}
