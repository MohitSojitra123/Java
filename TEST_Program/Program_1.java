import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);

           System.out.println("Enter Value 1 : ");
           int val1=sc.nextInt();

           System.out.println("Enter Value 2 : ");
           int val2=sc.nextInt();

           System.out.println("Enter Values 3 : ");
           int val3=sc.nextInt();

           if(val1 > val2 && val1 > val3){
            System.out.println("Val 1 Is Largest "+val1);
           }else if (val2 > val1 && val2 > val3) {
             System.out.println("Val 2 Is Largest "+val2);  
           }else if(val3 > val1 && val3 > val2){
              System.out.println("Val 3 Is Largest "+val3);
           }

    }
}
