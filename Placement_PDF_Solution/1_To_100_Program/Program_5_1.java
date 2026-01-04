// WAP to find a summation of a digit of a given number. (Iterative and recursive)

import java.util.Scanner;

public class Program_5_1 {
     public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter Any Number To Summation Of a Digit : ");
            int num=sc.nextInt();

            int last_digit=0,sum=0;

            while(num!=0){
                last_digit=num%10;
                sum+=last_digit;
                num/=10;
            }

            System.out.println("Summation Of a Digit : "+sum);
            
     }
}
