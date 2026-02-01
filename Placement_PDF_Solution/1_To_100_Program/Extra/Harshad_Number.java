package Extra;

import java.util.Scanner;

// Harshad Number :

// ✅ Examples

// Example 1
// Number = 18
// Digits: 1 + 8 = 9
// 18 ÷ 9 = 2 → divisible ✔
// 👉 18 is a Harshad Number

// Example 2
// Number = 21
// Digits: 2 + 1 = 3
// 21 ÷ 3 = 7 → divisible ✔
// 👉 21 is a Harshad Number

// Example 3
// Number = 19
// Digits: 1 + 9 = 10
// 19 ÷ 10 = 1.9 → not divisible ❌
// 👉 19 is NOT a Harshad Number

public class Harshad_Number {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Any Number To Check Number Is Harshad Number Or Not : ");
        int num=sc.nextInt();

        int num2=num;
         int sum=0;

        while (num2!=0) {
            sum+=(num2%10);
            num2/=10;
        }

        if(num%sum==0){
            System.out.println("Number Is Harshad Number : ");
        }else{
            System.out.println("Number Is Not Harshad Number : ");
        }

    }
}
