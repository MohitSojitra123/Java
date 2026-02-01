// Write a program to check weather number is happy number is not, happy number are those 
// number whose digit’s square summation eventually reaches to 1, if the sequence start 
// repeating then it is not a happy number, to store this sequence, use a dynamic data structure. 
// E.g., 49 is a happy number whose sequence is 49 97 130 10 1 
// E.g., 50 is not a happy number whose sequence is 50 25 29 85 89 145 42 20 4 16 37 58 89 
// it should stop when 89 is detected 2nd time and print 50 is not a happy number.

import java.util.ArrayList;
import java.util.Scanner;

public class Program_58 {

     static  int Divide_Pow_Sum(int n){
            int last_digit=0,sum=0;
            while (n!=0) {
                  last_digit=n%10;
                  sum+=last_digit*last_digit; 
                  n/=10;
             }  
             return sum;
        }
         
    public static void main(String[] args) {    

              Scanner sc=new Scanner(System.in);
        
              System.out.println("Enter Any Number To Check Number Is Happy Or Not : ");
              int num=sc.nextInt();

              int num2=num;
              ArrayList list1=new ArrayList<>();

           while (true) {
              int Ishappy_num=Program_58.Divide_Pow_Sum(num);
              if(Ishappy_num==1){
                System.out.println("Number Is Happy : "+num2);
                break;
              }     

              if(list1.contains(Ishappy_num)){
                 System.out.println("Number Is Not Happy : "+num2); 
                break;
              }else{
                list1.add(Ishappy_num);
              }
                num=Ishappy_num;
           }


    }
}
