package Extra;

import java.util.Scanner;

public class Series_1 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter Nth Element : ");
         int Nth=sc.nextInt();

         int Sum=0;

         for(int i=1; i<=Nth; i++){
            for(int j=1; j<=i; j++){
                Sum+=j;
            }
         }
         System.out.println("Sum : "+Sum);
    }
}
