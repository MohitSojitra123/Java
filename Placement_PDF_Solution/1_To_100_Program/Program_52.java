// Given a non-negative integer x, compute and return the square root of x. Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned. Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5. Explain in This Question in Simple Term

import java.util.Scanner;

public class Program_52 {

    static   int mysqrt(int x){
        if(x == 0 || x ==1 ){
            return 1;
        }
        int i=1;

        while ((i*i)<=x) {
               i++;
        }
        return (int)i-1;
      }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Any Number To Find Squre Root : ");
        int num=sc.nextInt();

        System.out.println(mysqrt(num));
        
       
    }
}
