// WAP to find weather given number is Ugly or not. 
// An ugly number is a positive integer which does not have a prime factor other than 2, 3, and 5. 
// Input: n = 6 Output: true Explanation: 6 = 2 × 3 

import java.util.Scanner;

public class Question_2 {
   public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

       int num;

       System.err.println("Enter Any Number To Check Numbmer Is Ugly Or Not : ");
       num=sc.nextInt();

       boolean isUgly = true;

    for(int i=2; i<=num; i++){
       while(num%i==0){
             if(i==2 || i==3 || i==5){
                 num/=i;
                }else{
                    isUgly=false;
                    break;
             }
       }      
    }

    if(isUgly){
        System.err.println("Number Is Ugly : "+num);
    }else{
        System.out.println("NumberIs Not Ugly : "+num);
    }

  }    
}
