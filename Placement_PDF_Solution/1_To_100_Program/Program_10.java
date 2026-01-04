// WAP to find a prime number between range (range should be entered by user).

import java.util.Scanner;

public class Program_10 {

     static boolean Isprime(int n){
        for(int i=2; i<n/2; i++){
            if(n%i==0){
                  return false;
            }
        }
        return true;
     }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int starting_point,ending_point;

        System.out.println("Enter Starting Point : ");
        starting_point=sc.nextInt();

        System.out.println("Enter Ending Point : ");
        ending_point=sc.nextInt();


         System.out.println("Prime Number List : ");  
        for(int i=starting_point; i<=ending_point; i++){
                if(Program_10.Isprime(i)){
                    System.out.println(i);
                }
        }
    }
}
