import java.util.Scanner;

public class equalignorecase {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter Strgin 1 => ");
         String str1=sc.nextLine();
         
         System.out.println("Enter Strgin 2 => ");
         String str2=sc.nextLine();

         System.out.println("--------------------------");

         if(str1.equalsIgnoreCase(str2)){
              System.out.println("Same As Alsoo...");
         }else{ 
              System.out.println("Not Same...");
         }

         System.out.println("--------------------------");
         
         if(str1.equals(str2)){
             System.out.println("Same As Alsoo...");
            }else{ 
                System.out.println("Not Same...");
            }
            
            System.out.println("--------------------------");


     }

}
