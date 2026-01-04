// WAP to find whether a number is Odd or Even without using a % operator. 

import java.util.Scanner;

public class Program_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Any Number To Find Number Is Odd Or Even : ");
        int user_num=sc.nextInt();

        // if((user_num/2)*2 == user_num){
        if((user_num&1) == 0){
            System.out.println("Number Is Even : "+user_num);
        }else{
            System.out.println("Number Is Odd : "+user_num);
        }
    }
}
