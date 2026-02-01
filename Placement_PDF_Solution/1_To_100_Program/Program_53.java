// Write a program to take 2 numbers from user and find out the distance between them.  
// (How to compute distance: If number is 10 and 18   then 10 in binary 1010 and 18 in binary 
// is 10010 and distance is 2 means total number of bits that needs to be changed when 10 is 
// converted into 18 or 18 is converted into 10, do not convert the number into binary)

import java.util.Scanner;

public class Program_53 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int num1,num2;

        System.err.println("Enter Number 1 : ");
        num1=sc.nextInt();

        System.out.println("ENter Number 2 : ");
        num2=sc.nextInt();

        int distance=0;

        while(num1>0 || num2>0){
            
              int num1_Binary=num1%2;
              int num2_Binary=num2%2;

              if(num1_Binary != num2_Binary){
                     distance++;
              }

              num1/=2;
              num2/=2;
        }

        System.out.println("Distance : "+distance);

    }
}
