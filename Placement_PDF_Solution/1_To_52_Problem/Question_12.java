// Dynamic

// 1 
// 1 * 1 
// 1 * 3 * 1 
// 1 * 3 * 5 * 3 * 1 

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          int n;

          System.out.println("Enter N : ");
          n=sc.nextInt();
          
          for(int i=1; i<=n; i++){
            for(int j1=1; j1<=i; j1++){
                if(j1%2==0){
                    System.out.print("* ");
                }else{
                    System.err.print(j1+" ");
                }
            }

            for(int j2=i-1; j2>=1; j2--){
              if(j2%2==0){
                    System.out.print("* ");
                }else{
                    System.err.print(j2+" ");
                }
            }
            System.err.println("");
          }

    }
}
