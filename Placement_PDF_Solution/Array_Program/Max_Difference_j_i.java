// Find maximum difference (arr[j] - arr[i]) where j > i.

// Input:
// arr = [2, 3, 10, 6, 4, 8, 1]

// Step by step:
// Pair differences (arr[j] - arr[i]) where j > i:

// i	j	arr[j]-arr[i]
// 0	1	3-2 = 1
// 0	2	10-2 = 8
// 0	3	6-2 = 4
// 1	2	10-3 = 7
// 3	5	8-6 = 2
// ...	...	...

// Maximum difference = 10 - 2 = 8

// Output:
// 8

import java.util.Scanner;

public class Max_Difference_j_i {
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

        System.out.println("\n-------------------------\n");
        for(int i=0; i<array_size; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n-------------------------\n");
        
        int final_max=Integer.MIN_VALUE,final_i=0,final_j=0,temp_max=0,temp_j=0;
        
        for(int i=0; i<array_size; i++){
            for(int j=i+1; j<array_size; j++){
                if(array[j]>array[i]){
                    temp_max=array[j]-array[i];
                    temp_j=j;
                }
                
                if(temp_max>final_max){
                    final_max=temp_max;
                    final_i=i+1;
                    final_j=temp_j;
                }
                
            }
        }
        
        System.out.println("\n-------------------------\n");
        System.out.println("Final Max Is : " +final_max);
        System.out.println("Final i : " +final_i);
        System.out.println("Final j  : " +final_j);
        System.out.println("\n-------------------------\n");
        
    }
}
