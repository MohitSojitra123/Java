// Find the majority element (appears more than n/2 times).


// Example 1:
// Array: [3, 3, 4, 2, 3, 3, 3]
// Size n = 7 → n/2 = 3.5 → so majority element must appear more than 3 times
// 3 appears 5 times → ✅ majority element

// Example 2:
// Array: [1, 2, 3, 4]
// Size n = 4 → n/2 = 2 → majority element must appear more than 2 times
// No element appears more than 2 times → ❌ no majority element

// Example 3:
// Array: [7, 7, 5, 7, 2, 7, 7]
// Size n = 7 → n/2 = 3.5 → majority element must appear more than 3 times
// 7 appears 5 times → ✅ majority element = 7

// Example 4:
// Array: [1, 1, 2, 2, 3, 3, 4]
// Size n = 7 → n/2 = 3.5 → majority element must appear more than 3 times
// No element appears more than 3 times → ❌ no majority element

// Example 5:
// Array: [9, 9, 9, 9, 2, 2, 2]
// Size n = 7 → n/2 = 3.5 → majority element must appear more than 3 times
// 9 appears 4 times → ✅ majority element = 9

// Example 6:
// Array: [5, 5, 5, 5, 5]

// Size n = 5 → n/2 = 2.5 → majority element must appear more than 2 times
// 5 appears 5 times → ✅ majority element = 5

import java.util.Scanner;

public class Majority_Element {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         int array_size;

         System.out.println("Enter Array Size : ");
         array_size=sc.nextInt();

         int majority_ele_size=(int)array_size/2;

         int array[]=new int[array_size];

         for(int i=0; i<array_size; i++){
             System.out.println("Enter Array Element : ");
             array[i]=sc.nextInt();
         }

         System.out.println("\n----------------------\n");
         for(int i=0; i<array_size; i++){
            System.out.print(array[i]+" ");
         }
         System.out.println("\n----------------------\n");

         int visited_array[]=new int[array_size];

        int count=1;

         for(int i=0; i<array_size; i++){
                   if (visited_array[i]==-1) {
                           continue;
                   }else{
                        for(int j=i+1; j<array_size; j++){
                              if(array[i]==array[j]){
                                  count++;
                                  visited_array[j]=-1;
                              }
                        }
                        if(count>=majority_ele_size){
                            System.out.println("Mojority Element Is : ");
                            System.out.println(array[i]);
                        }
                        count=1;
                   }
         }
    
        }
}
