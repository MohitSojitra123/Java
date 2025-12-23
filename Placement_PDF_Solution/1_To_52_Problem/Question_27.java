import java.util.Scanner;

public class Question_27 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

         int user_num;

         System.out.println("Enter Any Number : ");
         user_num=sc.nextInt();

         int sum=0,last_digit;

         while(user_num!=0){
            last_digit=user_num%10;
            sum+=last_digit;
            user_num/=10;
         }


        if(sum%3==0){
            System.out.println("Divisible For 3 : "+sum);
        }else{
            System.out.println("Not Divisible For 3 : "+sum);
        } 


    }
}
