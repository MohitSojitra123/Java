// WAP to find weather given number is Pronic or not. 
// A Pronic Number is defined as a number that is the product of two consecutive non-negative integers. In 
// other words, N is a Pronic Number if there exists a non-negative integer k such that N = k * (k + 1).  
// E.g. 6 is a Pronic Number because 6=2*3 

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        int num;

        System.err.println("Enter Any Number To Check Number Is Pronic Or Not : ");
        num=sc.nextInt();


        boolean isPronic=false;

        for(int i=0; i*(i+1)<=num; i++){
             if(i*(i+1) == num){
                 isPronic=true;
                 break;
             }
        }

    if(isPronic){
        System.out.println("Number Is Pronic : ");
    }else{
        System.out.println("Number Is Not Pronic : ");
    }
    }
}
