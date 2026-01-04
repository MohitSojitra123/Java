// WAP to enter an element at specific position into array. (Do not take a new array) 

import java.util.Scanner;

public class Program_23 {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);

           System.out.println("Enter Array Size ");
           int array_size=sc.nextInt();

           int array[]=new int[array_size+1];

           for(int i=0; i<array_size; i++){
            System.out.println("Enter Array Element : ");
            array[i]=sc.nextInt();
           }

           System.out.println("\n-------------------------\n");
           for(int j=0; j<array_size; j++){
            System.out.println(array[j]+" ");
           }
           System.out.println("\n-------------------------\n");


           System.out.println("Enter Index Number To Add Element : ");
           int index_num=sc.nextInt();

           System.out.println("Enter New Value : ");
           int new_value=sc.nextInt();

           array_size++;

           for(int i=array_size-1; i>index_num; i--){
                 array[i]=array[i-1];
           }

           array[index_num]=new_value;

           System.out.println("\n-------------------------\n");
           for(int j=0; j<array_size; j++){
               System.out.println(array[j]+" ");
            }
        System.out.println("\n-------------------------\n");


    }
}
