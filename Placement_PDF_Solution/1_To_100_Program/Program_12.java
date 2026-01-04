// WAP to find Max, Min, Average of n numbers, n should be taken from user and all n value 
// should be taken from user (Note that you are not allowed to use an array for this) 

import java.util.Scanner;

public class Program_12 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println("Enter N : ");
          int user_num=sc.nextInt();

          int min=Integer.MAX_VALUE;
          int max=Integer.MIN_VALUE;
          int sum=0;
          int current_num;

          for(int i=1; i<=user_num; i++){
            System.out.println("Enter Any Number : ");
            current_num=sc.nextInt();
            
            if(current_num<min){
                 min=current_num;
            }
            if(current_num>max){
                max=current_num;
            }

            sum+=current_num;
          }

          System.out.println("Max Number Is : "+max);
          System.out.println("Min Number Is : "+min);
          System.out.println("Sum  Is : "+sum);
          System.out.println("Avg..  Is : "+(sum/user_num));
        

    }
}
