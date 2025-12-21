//  0 , 1 , 1 , 2 , 3 , 5 , 8 , 13
// n Term 

import java.util.Scanner;

public class Program_6 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          
          
          System.out.println("Enter N Term...");
          int n=sc.nextInt();
          
          
                    int a=0;
                    int b=1;
                    int ans=0;
          
                    System.out.print(a+" "+b+" ");

       for(int i=2; i<=n; i++){
        ans=a+b;   
        System.out.print(ans+" ");
        a=b;
        b=ans;
       }    




    }
}
