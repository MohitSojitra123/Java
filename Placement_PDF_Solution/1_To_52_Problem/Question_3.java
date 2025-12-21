// WAP to find weather given number is Kaprekar or not. 
// A Kaprekar number is a non-negative integer that, when squared, can be split into two parts whose sum 
// equals the original number.  
// For E.g. 45 is a Kaprekar number because 45 squared (2025) can be split into 20 and 25, and 20 + 25 = 45

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int num,temp_num,num_squre,num_length=0;

        System.err.println("Enter Any Number To Check Number Is Kaprekar Or Not ");
        num=sc.nextInt();

        temp_num=num;

        num_squre=num*num;

        while(temp_num!=0){
            temp_num/=10;
            num_length++;
        }

        int divisor=(int)Math.pow(10, num_length);

    int left=num_squre/divisor;
    int right=num_squre%divisor;

    if((left+right)==num){
        System.err.println("Number Is Kaprekar Number : "+num);
    }else{
        System.out.println("Number Is Not Kaprekar Number : "+num);
    }
     



    }
}
