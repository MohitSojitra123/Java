// Write a program to create basic calculator by getting 2 numbers and an operation(+,-
// ,/,*,%) from the user and apply the operation given in a string on the given numbers.

import java.util.Scanner;

public class Program_2 {
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);


     int user_num=1,num1,num2;   
     char user_choice;
     String str;

       do{

          System.out.println("Enter Number 1 =>  ");
          num1=sc.nextInt();

          System.out.println("Enter Number 2 => ");
          num2=sc.nextInt();

          sc.nextLine(); 

          System.out.println("-------------------------------");
          System.out.println("Ennter Any Choice \n+ Add \n- Sub \n* Mul \n/ divide \n% Mod");
          str=sc.nextLine();
          user_choice=str.charAt(0);
          System.out.println("-------------------------------");
          System.out.println("Ans Is =>  ");
          
          
          switch (user_choice) {
             case '+':
             System.out.println("Num 1  + "+num1+"  Num 2  "+ num2 + " =>  " + (num1+num2)); 
             break;
             case '-':
             System.out.println("Num 1  - "+num1+"  Num 2  "+ num2 + " =>  " + (num1-num2)); 
             break;   
             case '*':
             System.out.println("Num 1  * "+num1+"  Num 2  "+ num2 + " =>  " + (num1*num2)); 
             break;
             case '/':
             System.out.println("Num 1  / "+num1+"  Num 2  "+ num2 + " =>  " + (num1/num2)); 
             break;
             case '%':
             System.out.println("Num 1  % "+num1+"  Num 2  "+ num2 + " =>  " + (num1%num2)); 
             break;
             default:
             System.out.println("Ple Choose Valid Option => ");
             System.out.println("Ennter Any Choice \n + Add \n- Sub \n* Mul \n/ divide \n% Mod");
             user_choice=sc.nextLine().charAt(0);
                break;
          }
          
          System.out.print("Continue To Calculate => ");
          System.out.print("\n-1 Break \n1 Continue");
          user_num=sc.nextInt();
          System.out.println("-------------------------------");
          sc.nextLine();
          
         }while(user_num!=-1);
         
      }    
   }
