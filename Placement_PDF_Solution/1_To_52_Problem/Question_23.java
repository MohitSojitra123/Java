// Given an array, rotate the array to the right by k steps, where k is non-negative.  
// Input: nums = [1,2,3,4,5,6,7], k = 3 
// Output: [5,6,7,1,2,3,4] 

import java.util.Scanner;


class Question_23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int array_size = sc.nextInt();

        int array1[] = new int[array_size];

        for(int i = 0; i < array_size; i++){
            System.out.print("Enter Array Element : ");
            array1[i] = sc.nextInt();
        }

        System.out.print("Enter Index Number To Rotate Array : ");
        int index = sc.nextInt();

        int array2[] = new int[array_size];
        int count = 0;


        for(int i = index+1; i < array_size; i++){
            array2[count++] = array1[i];
        }

        for(int i = 0; i <= index; i++){
            array2[count++] = array1[i];
        }

        System.out.println("--------------------");
        for(int i = 0; i < array_size; i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println("\n--------------------");
    }
}
