// WAP to enter an element at specific position into array. (Do not take a new array)

import java.util.Scanner;

public class Question_10_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int array_size = sc.nextInt();

        int array[] = new int[array_size+1]; 

        System.out.println("array size : "+array_size);

        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < array_size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter New Element Index (1 to " + (array_size + 1) + "): ");
        int ele_index = sc.nextInt();

        System.out.print("Enter New Element Value : ");
        int ele_value = sc.nextInt();

        array_size++; 
        
        for (int i = array_size - 2; i >= ele_index-1 ; i--) {
            array[i + 1] = array[i];
        }


        array[ele_index - 1] = ele_value;


        System.out.println("------ New Array ------");
        for (int i = 0; i < array_size; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
