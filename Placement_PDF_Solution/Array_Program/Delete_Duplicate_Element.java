// Delete Duplicate Element From Array

import java.util.Scanner;

public class Delete_Duplicate_Element {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int array_size=sc.nextInt();

          int array[]=new int[array_size];

          for(int i=0; i<array_size; i++){
             System.out.println("Enter Array Size : ");
             array[i]=sc.nextInt();
          }

          System.out.println("\n--------------------------\n");
          for(int i=0; i<array_size; i++){
            System.out.print(array[i]+" ");
          }
          System.out.println("\n--------------------------\n");
          
          for(int i=0; i<array_size; i++){
              for(int j=i+1; j<array_size; j++){
                  if(array[i] == array[j]){
                      for(int k=j; k<array_size-1; k++){
                          array[k]=array[k+1];
                        }
                        array_size--;
                    }
                }      
            }
            
        System.out.println("\n--------------------------\n");
        for(int i=0; i<array_size; i++){
            System.out.print(array[i]+" ");
        }
          System.out.println("\n--------------------------\n");

    }
}
