import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter Any Number To Reverse Number : ");
         int num=sc.nextInt();

         int reverse=0;

         while (num!=0) {
               int last_digit=num%10;
               reverse=(reverse*10)+(last_digit);
               num/=10;
         }

         System.out.println("Reverse Number Is : "+reverse);

    }
}
