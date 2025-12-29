// Check if two arrays are equal or not.

import java.util.Scanner;

public class Array_Equal_Check {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

          int array_size1,array_size2;

          System.out.println("Enter Array Size 1 : ");
          array_size1=sc.nextInt();

          System.out.println("Enter Array Size 2 : ");
          array_size2=sc.nextInt();

          int array1[]=new int[array_size1];
          int array2[]=new int[array_size2];

          for(int i=0; i<array_size1; i++){
            System.out.println("Enter Array 1 Element : ");
            array1[i]=sc.nextInt();
          }

          System.out.println("\n-----------------------\n");
          
          for(int j=0; j<array_size2; j++){
              System.out.println("Enter Array 2 Element : ");
              array2[j]=sc.nextInt();
            }
            
            boolean issame=true;

            System.out.println("\n--------------------------------\n");
            if(array_size1==array_size2){
                for(int i=0; i<array_size1; i++){
                    if(array1[i] != array2[i]){
                        System.out.println("array 1 and array 2 are Not Same...");
                        issame=false;
                        break;
                    }   
                }
            }else{
                System.out.println("Array Size Is Not Same : ");
            }

            if(issame){
                System.out.println("Array Is Same Equal...");
            }

            System.out.println("\n--------------------------------\n");

    }
}
