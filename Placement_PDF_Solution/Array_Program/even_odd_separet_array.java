// Separate even and odd numbers into two arrays.

import java.util.Scanner;

public class even_odd_separet_array {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        
     int array_size;

    System.out.println("Enter Array Size : ");
    array_size=sc.nextInt();


    int array[]=new int[array_size];

    for(int i=0; i<array_size; i++){
        System.out.println("Enter Array Element : "+(i+1));
        array[i]=sc.nextInt();
    }

    System.out.println("\n-----------------------------\n");
    for(int i=0; i<array_size; i++){
        System.out.print(array[i]+" ");
    }
    System.out.println("\n-----------------------------\n");


    int odd_array[]=new int[array_size];
    int even_array[]=new int[array_size];

    int odd_index=0,even_index=0;

    for(int i=0; i<array_size; i++){
         if(array[i]%2==0){
              even_array[even_index]=array[i];
              even_index++;
         }else{
            odd_array[odd_index]=array[i];
            odd_index++;
         }
    }

    System.out.println("\n----------------------------\n");
    System.out.println("Odd Array Element : \n");
    for(int i=0; i<odd_index; i++){
        System.out.print(odd_array[i]+" ");
    }
    System.out.println("\n----------------------------\n");

    System.out.println("\n----------------------------\n");
    System.out.println("Even Array Element : \n");
    for(int i=0; i<even_index; i++){
        System.out.print(even_array[i]+" ");
    }
    System.out.println("\n----------------------------\n");

    }
}
