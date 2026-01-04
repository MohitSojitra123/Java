// Given an array, rotate the array to the right by k steps, where k is non-negative. 
// Example 1: 
// Input: nums = [1,2,3,4,5,6,7], k = 3 
// Output: [5,6,7,1,2,3,4] 
// Explanation: 
// rotate 1 step to the right: [7,1,2,3,4,5,6] 
// rotate 2 steps to the right: [6,7,1,2,3,4,5] 
// rotate 3 steps to the right: [5,6,7,1,2,3,4] 

import java.util.Scanner;

public class Program_39 {
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

          System.out.println("\n---------------------------\n");
          for(int i=0; i<array_size; i++){
            System.out.print(array[i]+" ");
          }
          System.out.println("\n---------------------------\n");

          System.out.println("Enter kth Steps To Rotate Array : ");
          int k=sc.nextInt();

            k = k % array_size;

          int x=0;
          int last_ele=array[array_size-1];

          while(x!=k){

            last_ele=array[array_size-1];

            for(int j=array_size-1; j>0; j--){
                array[j]=array[j-1];
            }

            array[0]=last_ele;
            x++;
          }

         System.out.println("\n---------------------------\n");
          for(int i=0; i<array_size; i++){
            System.out.print(array[i]+" ");
          }
          System.out.println("\n---------------------------\n");


    }
}
