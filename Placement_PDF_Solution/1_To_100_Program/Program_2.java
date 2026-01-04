// WAP to find whether string is palindrome or not. 

import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter Any String To Check String Is Palindrom or Not : ");
       String str=sc.nextLine();

    char[] str_cha=str.toCharArray();

       int end=str_cha.length-1;

       boolean IsPalindrom=true;

       for(int start=0; start<str_cha.length; start++){
               if(start<end){
                   if(str_cha[start]==str_cha[end]){
                         end--;
                   }else{
                       IsPalindrom=false;
                       break;
                   }
               }
       }

       if(IsPalindrom){
        System.out.println("String Is Palindrom : "+str);
       }else{
        System.out.println("String Is Not Palindrom : "+str);
       }
    

    }
}
