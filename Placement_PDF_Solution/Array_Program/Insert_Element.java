// Insert an element at a given position.

import java.util.Scanner;

public class Insert_Element {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);

      int array_size;

      System.out.println("Enter Array Size : ");
      array_size=sc.nextInt();
      
      int array[]=new int[array_size+1];

      for(int i=0; i<array_size; i++){
        System.out.println("Enter Array Element  :");
        array[i]=sc.nextInt();
      }

    System.out.println("\n---------------------\n");
      for(int i=0; i<array_size; i++){
          System.out.println(array[i]);
        }
    System.out.println("\n---------------------\n");

    int position,new_element;

    System.out.println("Enter Array Position To Insert Element (0-n)");
    position=sc.nextInt();

    System.out.println("Enter New Element : ");
    new_element=sc.nextInt();

    array_size++;
      
       for(int i=array_size-1; i>position; i--){
            array[i]=array[i-1];
       }

       array[position]=new_element;

    System.out.println("\n---------------------\n");
      for(int i=0; i<array_size; i++){
          System.out.println(array[i]);
        }
    System.out.println("\n---------------------\n");

   }    
}
