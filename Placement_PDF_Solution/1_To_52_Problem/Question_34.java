// Given an array of positive integers arr[] of size n, the task is to find the second largest distinct element in 
// the array. 
// Note: If the second largest element does not exist, return -1. 
// Input: arr[] = [12, 35, 1, 10, 34, 1] 
// Output: 34 
// Explanation: The largest element of the array is 35 and the second largest element is 34. 
// Input: arr[] = [10, 10, 10] 
// Output: -1 
// Explanation: The largest element of the array is 10 there is no second largest element.

import java.util.Scanner;

public class Question_34 {
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


        System.out.println("--------------------------");
            for(int i=0; i<array_size; i++){
                System.out.print(array[i]+" ");
            }
        System.out.println("\n--------------------------");


        int big_1=-1;
        int big_2=-1;

        for(int i=0; i<array_size; i++){
            if(array[i] > big_1){
                  big_2=big_1;
                  big_1=array[i];
            }else if(big_1 != array[i] && array[i] < big_1 && array[i] > big_2){
                  big_2=array[i];
            }
        }

        System.out.println("Big 1 : "+big_1);
        System.out.println("Big 2 : "+big_2);
    }
}
