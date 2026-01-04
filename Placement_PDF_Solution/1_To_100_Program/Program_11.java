// WAP to find weather given number is Armstrong number is not.

import java.util.Scanner;

public class Program_11 {

     static int power(int x,int y){
          int pow=1;
          for(int i=1; i<=y; i++){
              pow*=x;
          }
          return pow;
     }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter Any Number To Check Number Is Armstrong Or Not : ");
       int user_num=sc.nextInt();

       int n1=user_num;
       int n2=user_num;
       int Armstrong_num=0;
       int last_digit=0;
      int num_length=0;

       while(n1!=0){
         n1/=10;
         num_length++;
       }

       while(n2!=0){
         last_digit=n2%10;
         Armstrong_num+=Program_11.power(last_digit, num_length);  
         n2/=10;
       }

       if(Armstrong_num==user_num){
        System.out.println("Nmber Is Armstrong : "+user_num);
    }else{
           System.out.println("Nmber Is Not  Armstrong : "+user_num);
       }

    }
}
