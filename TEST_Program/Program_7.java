import java.util.Scanner;

public class Program_7 {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);

           System.out.println("Enter Any Number To Check Number Is Prime Or Not...");
           int num=sc.nextInt();

           int count=0;

           for(int i=2; i<num; i++){
               if(num%i==0){
                  count++;
               }
           }

           if(count==0){
            System.out.println("Number Is Prime : "+num);
           }else{
            System.out.println("Number Is Not Prime : "+num);
           }

    }
}
