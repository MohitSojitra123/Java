// Given an array of N integers, and an integer K, find the number of pairs of elements in the 
// array whose sum is equal to K. 
// e.g.  
// Input: 
// N = 4, K = 6 
// arr[] = {1, 5, 7, 1} 
// Output: 2 
// Explanation:  
// arr[0] + arr[1] = 1 + 5 = 6  
// and arr[1] + arr[3] = 5 + 1 = 6.

import java.util.Scanner;

public class Program_43 {
    public static void main(String[] args) {
        
          Scanner sc=new Scanner(System.in);

          int array_size;

          System.err.println("Enter Array Element : ");
          array_size=sc.nextInt();

          int array[]=new int[array_size];

          for(int i=0; i<array_size; i++){
            System.out.println("Enter Array Element : ");
            array[i]=sc.nextInt();
          }


          System.err.println("Enter Kth Element : ");
          int k=sc.nextInt();

          for(int i=0; i<array_size; i++){
             for(int j=i+1; j<array_size; j++){
                    if((array[i]+array[j])==k){
                          System.out.println("["+array[i]+","+array[j]+"]");
                    }
             }
          }

    }
}
