// WAP to find a summation of a digit of a given number. (Iterative and recursive)

import java.util.Scanner;

public class Program_5_2 {

    //   static int sum_of_digit(int n){
    //     if(n==0){
    //         return 0;
    //     }else{
    //        return (n%10) + sum_of_digit(n/10);
    //     //    return (n%10) + sum_of_digit(n/=10);
    //     }
    //   }

    static int sum=0;

    static int sum_of_digit(int n){
        if(n==0){
            return sum;
        }else{
              sum+=n%10;
              return sum_of_digit(n/=10);
        }
    }

     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter Any Number To Summation Of a Digit : ");
         int num=sc.nextInt();

         System.out.println("Summation of Digit : "+Program_5_2.sum_of_digit(num));

        

     }
}
