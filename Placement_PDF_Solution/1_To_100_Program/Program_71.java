// You are given an integer array nums and an integer target. 
// You want to build an expression out of nums by adding one of the symbols '+' and '-' before 
// each integer in nums and then concatenate all the integers. 
// For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate 
// them to build the expression "+2-1". 
// Return the number of different expressions that you can build, which evaluates to target. 
// Input: nums = [1,1,1,1,1], target = 3 
// Output: 5 
// Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3. 
// -1 + 1 + 1 + 1 + 1 = 3 
// +1 - 1 + 1 + 1 + 1 = 3 
// +1 + 1 - 1 + 1 + 1 = 3 
// +1 + 1 + 1 - 1 + 1 = 3 
// +1 + 1 + 1 + 1 - 1 = 3

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Program_71 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        int array_size;

         System.out.println("Enter Array Size : ");
          array_size=sc.nextInt();
         
          int array[]=new int[array_size];

          for(int i=0; i<array_size; i++){
               System.out.println("Enter Array Element : ");
               array[i]=sc.nextInt();
          }

          System.out.println("Enter Target Value : ");
          int targer=sc.nextInt();

          int new_element=0;
          int sum=0;

          for(int i=0; i<array_size; i++){
              for(int j=0; j<array_size; j++){
                if(i==j){
                     array[i]=-array[i];
                }
              }
              for(int k=0; k<array_size; k++){
                    sum+=array[k];
              }

              if(sum==targer){
                    System.out.println(Arrays.toString(array));  
              }

              if(array[i]<0){
                array[i]=array[i]*-1;
              }

              sum=0;
          }
         

    }

}
