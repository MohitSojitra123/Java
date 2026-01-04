// WAP to sort an Array using Bubble sort.

import java.util.Scanner;

public class Program_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Arry Size : ");
        int array_size=sc.nextInt();

        int array[]=new int[array_size];

        for(int i=0; i<array_size; i++){
            System.out.println("Enter Array Element : ");
            array[i]=sc.nextInt();
        }

        System.out.println("\n--------------------------------------\n");
        for(int i=0; i<array_size; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n--------------------------------------\n");

        for(int i=0; i<array_size-1; i++){
            for(int j=0; j<array_size-1-i; j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        System.out.println("\n--------------------------------------\n");
        for(int i=0; i<array_size; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n--------------------------------------\n");

    }
}
