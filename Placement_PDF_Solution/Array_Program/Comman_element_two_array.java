// Find common elements between two arrays.

import java.util.Scanner;

public class Comman_element_two_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int array_size1,array_size2;

            System.out.println("Enter Array Size 1 : ");
            array_size1=sc.nextInt();

            System.out.println("Enter Array Size 2 : ");
            array_size2=sc.nextInt();

            int array1[]=new int[array_size1];
            int array2[]=new int[array_size2];


            System.out.println("\n---------------------------\n");
            for(int i=0; i<array_size1; i++){
                System.out.println("Enter Array 1 Element : ");
                array1[i]=sc.nextInt();
            }
            System.out.println("\n---------------------------\n");

            System.out.println("\n---------------------------\n");
            for(int i=0; i<array_size2; i++){
                System.out.println("Enter Array 2  Element : ");
                array2[i]=sc.nextInt();
            }
            System.out.println("\n---------------------------\n");


            // Unique Element : 

            for(int i=0; i<array_size1; i++){
                for(int j=i+1; j<array_size1; j++){
                    if(array1[i]==array1[j]){
                           for(int k=j; k<array_size1-1; k++){
                               array1[k]=array1[k+1];
                           }
                           array_size1--;
                    }
                }
            }

            for(int i=0; i<array_size2; i++){
                for(int j=i+1; j<array_size2; j++){
                    if(array2[i]==array2[j]){
                           for(int k=j; k<array_size2-1; k++){
                               array2[k]=array2[k+1];
                           }
                           array_size2--;
                    }
                }
            }

            // Unique Element : 

            System.out.println("\n---------------------------\n");
            System.out.println("Array : 1");
            System.out.println("\n---------------------------\n");
            for(int i=0; i<array_size1; i++){
                System.out.print(array1[i]+" ");
            }
            System.out.println("\n---------------------------\n");
            
            System.out.println("\n---------------------------\n");
            System.out.println("Array : 2 ");
            System.out.println("\n---------------------------\n");
            for(int i=0; i<array_size2; i++){
                System.out.print(array2[i]+" ");
            }
            System.out.println("\n---------------------------\n");
            
            
            System.out.println("\n---------------------------\n");
            System.out.println("Common Element : ");
            System.out.println("\n---------------------------\n");

            for(int i=0; i<array_size1; i++){

                for(int j=0; j<array_size2; j++){
                    if(array1[i]==array2[j]){
                         System.out.print(array1[i]+" ");
                        }
                    }
            }

            System.out.println("\n");




    }
}
