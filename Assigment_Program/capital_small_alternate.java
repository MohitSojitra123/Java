import java.util.Scanner;

public class capital_small_alternate {
      public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           
           System.out.println("Enter Any Strgin Mix Capital Or Small => ");
           String str=sc.nextLine();

           String new_str="";

           for(int i=0; i<str.length(); i++){
                 if(str.charAt(i) >= 97 && str.charAt(i) <= 122){
                       new_str+=Character.toUpperCase(str.charAt(i));
                 }else if(str.charAt(i) >=65 && str.charAt(i) <= 90){
                    new_str+=Character.toLowerCase(str.charAt(i));
                 }else{
                    new_str+=str.charAt(i);
                 }
           }

           System.out.println("-----------------------------------");
           System.out.println(new_str);
           System.out.println("-----------------------------------");


      }
}
