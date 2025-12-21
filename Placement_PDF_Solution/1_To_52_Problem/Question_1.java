import java.util.Scanner;

class Question_1{
    
    // WAP to find weather given number is Prime or not.

    static boolean  Isprime(int num){
        for(int i=2; i<num; i++){
            if(num%i==0){
                  return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter Number To Check Number Is Prime Or Not : ");
         int user=sc.nextInt();

         if(Question_1.Isprime(user)){
            System.out.println("Number Is Prime : "+user);
         }else{
            System.out.println("Number Is Not Prime : "+user);
         }

    }
}