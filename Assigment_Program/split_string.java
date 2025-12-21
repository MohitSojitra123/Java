import java.util.Scanner;

public class split_string {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter Any String To Splict => ");
         String str=sc.nextLine();


       String fullname[]=new String[2];
       int count=0;

       String temp_str="";

       for(int i=0; i<str.length(); i++){
             if(str.charAt(i) == ' ' || str.charAt(i) == '/' || str.charAt(i) == '.' || str.charAt(i) == '|'){
                   
                for(int j=0; j<=i; j++){
                        temp_str+=str.charAt(j);
                   }

                   fullname[count]=temp_str;
                   temp_str="";
                   count++;

                   for(int j=i+1; j<str.length(); j++){
                    temp_str+=str.charAt(j);
                   }

                   fullname[count]=temp_str;
             }
       }

       System.out.println("-----------------------------");
       for (String str1 : fullname) {
           System.out.println(str1);
        }
        System.out.println("-----------------------------");

             

     }
}
