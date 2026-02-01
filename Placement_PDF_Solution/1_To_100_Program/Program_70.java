// Given a positive integer n, return the number of the integers in the range [0, n] whose binary 
// representations do not contain consecutive ones. 

import java.lang.reflect.Array;
import java.util.Scanner;

public class Program_70 {

     static  String Convert_Binary(int n){
               String Binary="";

               while(n>0){
                 Binary=(n%2)+Binary;
                 n/=2;
               }
               return Binary;
       }
    public static void main(String[] args) {
        
          Scanner sc=new Scanner(System.in);

          System.out.println("Enter N Number : ");
          int n=sc.nextInt();

          String Temp_Str="";
          char Temp_char[];
          boolean Isvalide=true;

          for(int i=1; i<=n; i++){
                Temp_Str=Program_70.Convert_Binary(i);
                Temp_char=Temp_Str.toCharArray();
                Isvalide=true;
                for(int j=0; j<Temp_char.length-1; j++){
                    if(Temp_char[j] == '1' && Temp_char[j+1] == '1'){
                           Isvalide=false;
                           break;
                    }
                }
                if(Isvalide){
                       System.out.println(i+" : "+Temp_Str);   
                }
            }
                
    }
}
