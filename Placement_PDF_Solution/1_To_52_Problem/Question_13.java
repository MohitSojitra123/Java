// * * * * * * * 
//  *                *  
//   *           *   
//          *    
//     *         *   
//  *                *  
// * * * * * * *

import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n;

        System.err.println("Enter N : ");
        n=sc.nextInt();

         for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if((i==j) || (i==1 && j<=n) || (i==n && j<=n) || (j>i && j+i==n+1) || (j<i && j+i==n+1)){
                    System.err.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.err.println("");
         }

    }
}
