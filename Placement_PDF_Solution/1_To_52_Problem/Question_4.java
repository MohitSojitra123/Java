// WAP to find weather given number is Automorphic or not. 
// An automorphic number is a number whose square ends with the same digits as the number itself.  
// For example, 5 is automorphic because 5² = 25, which ends in 5.  
// Similarly, 76 is automorphic because 76² = 5776, which ends in 76. 

import java.util.Scanner;

class Question_4{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         int num_1,num_squre=0,num_len=0;

         System.out.println("Enter Any  Number To Check Number Is Automorphic Number :  ");
         num_1=sc.nextInt();

         num_squre=num_1*num_1;

         String num_2=Integer.toString(num_1);
         num_len=num_2.length(); 

         String num_squre_convert=Integer.toString(num_squre);
         String sub_part=num_squre_convert.substring(num_squre_convert.length()-num_len);
         int check_part=Integer.parseInt(sub_part);

         if(check_part==num_1){
            System.err.println("Number Is Automorphic Number : "+num_1);
        }else{
             System.err.println("Number Is Not Automorphic Number  : "+num_1);
         }




         

    }
}