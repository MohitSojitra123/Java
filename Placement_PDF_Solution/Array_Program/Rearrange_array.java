// Rearrange array in alternating positive and negative numbers.

// Example 1
// Input: [1, 2, 3, -4, -1, 4]
// Positives: [1, 2, 3, 4]
// Negatives: [-4, -1]
// Alternating merge: [-4, 1, -1, 2, 3, 4]
// Output:
// [-4, 1, -1, 2, 3, 4]

// Example 2
// Input: [-5, -2, 5, 2, 4, 7, 1, 8, 0, -8]
// Positives: [5, 2, 4, 7, 1, 8, 0]
// Negatives: [-5, -2, -8]
// Alternating merge: [-5, 5, -2, 2, -8, 4, 7, 1, 8, 0]
// Output:
// [-5, 5, -2, 2, -8, 4, 7, 1, 8, 0]

// Example 3
// Input: [3, -3, 3, -3, 3]
// Positives: [3, 3, 3]
// Negatives: [-3, -3]
// Alternating merge: [-3, 3, -3, 3, 3]
// Output:
// [-3, 3, -3, 3, 3]

import java.util.Scanner;

public class Rearrange_array {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

          int array_size;

          System.out.println("Enter Array Size : ");
          array_size=sc.nextInt();

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

        int positive_num[]=new int[array_size];
        int nagative_num[]=new int[array_size];

        int positive_index=0,nagative_index=0;

        for(int i=0; i<array_size; i++){
               if(array[i]<0){
                nagative_num[nagative_index]=array[i];
                 nagative_index++;
               }else{
                positive_num[positive_index]=array[i];
                positive_index++;
               }
        }

        int print_positive_index=0,print_nagative_index=0;

        int i=1;

        while(print_positive_index<positive_index && print_nagative_index<nagative_index){
               if(i%2!=0){
                  System.out.println(nagative_num[print_nagative_index]);
                  print_nagative_index++;
                  i++;
               }else{
                System.out.println(positive_num[print_positive_index]);
                print_positive_index++;
                i++;
               }      
        }
        
        while(print_nagative_index<nagative_index){
            System.out.println(nagative_num[print_nagative_index]);
            print_nagative_index++;
        }

        while(print_positive_index<positive_index){
            System.out.println(positive_num[print_positive_index]);
            print_positive_index++;
        }

    }
}
