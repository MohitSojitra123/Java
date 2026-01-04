// WAP to find a total odd and total even digit of a given number.

import java.util.Scanner;

public class Program_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Digit To Find Odd-Even Digit : ");
        int user_num=sc.nextInt();

        int even_count=0,odd_count=0;

        while(user_num!=0){
              if((user_num%10)%2==0){
                System.out.println("Even : "+(user_num%10));
                even_count++;
            }else{
                  System.out.println("Odd : "+(user_num%10));
                 odd_count++;
              }
              user_num/=10;
        }
        
        System.out.println("Total Odd Count : "+odd_count);
        System.out.println("Total Even Count : "+even_count);

    } 
}
