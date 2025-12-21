// a => 123 => 3
// b => 456 => 4
//  3+4 => 7

import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Value Of A : ");
        int a=sc.nextInt();

        System.out.println("Enter Value Od B : ");
        int b=sc.nextInt();


        int last_digit=a%10;
        int first_digit=0;

        while (b!=0) {
            first_digit=b%10;
            b/=10;
        }

        System.out.println("Last Digit => "+last_digit);
        System.out.println("First Digit => "+first_digit);
        System.out.println("First Digit + Last Digit "+(first_digit+last_digit));
        

    }
}
