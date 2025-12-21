import java.util.Scanner;

public class Program_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Any Number To Check Number Is Harshad Number Or Not....");
        int num=sc.nextInt();

        int sum=0;
        int num2=num;
        int last_digit;


        while (num!=0) {
              last_digit=num%10;
              sum+=last_digit;
              num/=10;
        }

        System.out.println("Number Is : "+num2);
        System.out.println("Sum Is : "+sum);

        if(num2%sum==0){
            System.out.println("Number Is Harshad : "+num2);
        }else{
            System.out.println("Number Is Not Harshad : "+num2);
        }

    }
}
