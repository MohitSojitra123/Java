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

         for(int i=1; i<=n; i++){
            for(int space=i; space>1; space--){
                System.out.print(" ");
            }
            for(int j=n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
         }

    }
}
