// Write a program that should decode the given pattern and print the resulting expanded string. 
// Input: 2a3bc4dE5F2G7H 
// Output: aabbbcddddEFFFFFGGHHHHHHH 

import java.util.Scanner;

public class Question_28_2 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         String str;

         System.out.println("Enter String : ");
         str=sc.nextLine();

         int num=0;

         for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                  num=str.charAt(i)-'0';
                  for(int j=1; j<=num; j++){
                    System.out.print(str.charAt(i+1));
                  }
                  i++;
            }else{
                System.out.print(str.charAt(i));
            }
         }

        
    }    
}
