// WAP to delete an element from array specified by user. if element is not found print a 
// message “Element is not found” (do not take a new array).

import java.util.Scanner;

public class Program_24 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter Array Size : ");
         int array_size=sc.nextInt();

         int array[]=new int[array_size];

         for(int i=0; i<array_size; i++){
               System.out.println("Enter Array Element : ");
               array[i]=sc.nextInt();
         }

         System.out.println("\n------------------------------\n");
         for(int i=0; i<array_size; i++){
             System.out.print(array[i]+" ");
            }
            System.out.println("\n------------------------------\n");
        
            System.out.println("Enter Delete Element : ");
            int del_ele=sc.nextInt();

            boolean isDelete=false;

            for(int i=0; i<array_size; i++){
                if(array[i]==del_ele){
                     for(int j=i; j<array_size-1; j++){
                        array[j]=array[j+1];
                     } 
                     array_size--;
                     isDelete = true;
                }
            }

            if(!isDelete){
                System.out.println("Element Is Not Preset in Array : ");
            }else{
                System.out.println("Element Is Present  Delete SuccessFully : ");
            }

        System.out.println("\n------------------------------\n");
         for(int i=0; i<array_size; i++){
             System.out.print(array[i]+" ");
            }
        System.out.println("\n------------------------------\n");

    }
}
