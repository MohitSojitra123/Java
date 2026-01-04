// Array: [1, 3, 5, 2, 2]

// Index 0 → left sum = 0, right sum = 3+5+2+2=12 → not equilibrium
// Index 1 → left sum = 1, right sum = 5+2+2=9 → not equilibrium
// Index 2 → left sum = 1+3=4, right sum = 2+2=4 → equilibrium!
// Index 3 → left sum = 1+3+5=9, right sum = 2 → not equilibrium
// Index 4 → left sum = 1+3+5+2=11, right sum = 0 → not equilibrium

// ✅ Equilibrium index = 2

// Find equilibrium index of an array.

import java.util.Scanner;

public class Equilibrium_Element_Index {
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
              System.out.print(array[i]+" ");
            }
            System.out.println("\n---------------------\n");

            int current_index=0;
            int right_side_sum=0; 
            int left_side_sum=0; 
            
            for(int i=0; i<array_size; i++){
                current_index=i;
                right_side_sum=0;
                left_side_sum=0; 
                
                for(int j=current_index+1; j<array_size; j++){
                     right_side_sum+=array[j];
                }

                for(int k=current_index-1; k>=0; k--){
                    left_side_sum+=array[k];
                }

                if(left_side_sum==right_side_sum){
                    System.out.println("Index Number Is "+current_index);
                }
            }
        
        
    }
}
