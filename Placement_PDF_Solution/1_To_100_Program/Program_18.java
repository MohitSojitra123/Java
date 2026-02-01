// WAP to sort an Array using Selection sort. 

import java.util.Scanner;

public class Program_18 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter Array Size : ");
      int array_size=sc.nextInt();

      int array[]=new int[array_size];

      for(int i=0; i<array_size; i++){
           System.out.println("Enter Array Element : ");
           array[i]=sc.nextInt();
      }

      System.out.println("\n---------------------\n");
      for(int i=0; i<array_size; i++){
        System.out.println(array[i]+" ");
      }
      System.out.println("\n---------------------\n");
      
      for(int i=0; i<array_size-1; i++){
            int minindex=i;
        for(int j=i+1; j<array_size; j++){
              if(array[j]<array[minindex]){
                minindex=j;
              }
        }

          int temp=array[minindex];
          array[minindex]=array[i];
          array[i]=temp;
      }

        System.out.println("\n---------------------\n");
      for(int i=0; i<array_size; i++){
        System.out.println(array[i]+" ");
      }
      System.out.println("\n---------------------\n");

    }
}
