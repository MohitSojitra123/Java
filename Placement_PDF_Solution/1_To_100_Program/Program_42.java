// WAP to implement a sliding window problem
// . You are given an array of integers nums, 
// there is a sliding window of size k which is moving from the very left of the array to the 
// very right. You can only see the k numbers in the window. Each time the sliding window 
// moves right by one position. 
// Input: nums = [1,3, -1, -3,5,3,6,7], k = 3 
// Output: [3,3,5,5,6,7] 
// Explanation:  
// Window position                Max 
// ---------------               ----- 
// [1  3  -1] -3  5  3  6  7       3 
//  1 [3  -1  -3] 5  3  6  7       3 
//  1  3 [-1  -3  5] 3  6  7       5 
//  1  3  -1 [-3  5  3] 6  7       5 
//  1  3  -1  -3 [5  3  6] 7       6 
//  1  3  -1  -3  5 [3  6  7]      7

import java.util.Scanner;

public class Program_42 {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);

           System.out.println("Enter Array Size : ");
           int array_size=sc.nextInt();

        int array[]=new int[array_size];

        for(int i=0; i<array_size; i++){
            System.out.println("Enter Array Element : ");
            array[i]=sc.nextInt();
        }
        System.out.println("\n-----------------------\n");

        System.out.println("Enter Kth Element : ");
        int kth=sc.nextInt();

        int[] result = new int[array_size - kth + 1];


        for (int i = 0; i <= array_size - kth; i++) {

            int max = array[i];

            for (int j = i; j < i + kth; j++) {
                if (array[j] > max) {
                    max = array[j];
                }
            }
            result[i] = max;
        }

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
