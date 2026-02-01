//      1 
//     A B
//    2 3 4
//   C D E F
//  5 6 7 8 9
// G H I J K L


import java.util.Scanner;

public class Program_22_1 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println("Enter N : ");
          int n=sc.nextInt();

            int alpha_count=1;
            // int num_count=64;
            char ch='A';

          for(int i=1; i<=n; i++){

            for(int space=n; space>i; space--){
                System.out.print(" ");
            }


            for(int j=1; j<=i; j++){
                if(i%2!=0){
                    System.out.print((alpha_count++)+" ");
                }else{
                    // System.out.print((char)((++num_count))+" ");
                    System.out.print((ch++)+" ");
                }
            }
            System.out.println();
          }

    }
}
