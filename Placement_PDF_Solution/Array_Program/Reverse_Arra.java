// Reverse an array.

import java.util.Scanner;

public class Reverse_Arra {
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

         System.out.println("\n--------------------------\n");
         for(int i=0; i<array_size; i++){
             System.out.println(array[i]);
            }
        System.out.println("\n--------------------------\n");

        int end=array_size-1;

        for(int i=0; i<array_size; i++){
                if(i<end){
                    array[i]=array[i]+array[end];
                    array[end]=array[i]-array[end];
                    array[i]=array[i]-array[end];
                    end--;
                }
        }

          System.out.println("\n--------------------------\n");
         for(int i=0; i<array_size; i++){
             System.out.println(array[i]);
            }
        System.out.println("\n--------------------------\n");

    }
}
