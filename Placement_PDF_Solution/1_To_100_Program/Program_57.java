// Write  a  Function  that  returns  either  1  or  0  based  on  following  condition  if  the  array  is  in 
// ascending order and occurrence of that number at least 3 then it should return 1 otherwise 
// it should return 0. 
// e.g.  
// if A=[1,1,1,2,2] it should return 0 
// if A=[1,1,1,3,3,3,3] it should return 1 
// if A=[2,2,2,1,1,1] it should return 0

import java.util.Scanner;

public class Program_57 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int array_size=sc.nextInt();

          int array[]=new int[array_size];

          for(int i=0; i<array_size; i++){
               System.out.println("Enter Array Element : ");
               array[i]=sc.nextInt();
          }

          boolean IsAscending=true;

          for(int i=0; i<array_size-1; i++){
            if (array[i]>array[i+1]) {
                    IsAscending=false; 
                    break;
            }
          }

          int count=1;
          boolean Isoccurence=true;

          for(int i=1; i<array_size; i++){
               if(array[i]==array[i-1]){
                      count++;
               }else{
                   if(count<3){
                       Isoccurence=false;
                       break;
                   }
                   count=1;
               }
          }

          if(count<3){
            Isoccurence=false;
          }

          if(Isoccurence && IsAscending){
              System.out.println("Array Is  ascending order and occurrence : 1 ");
          }else{
            System.out.println("Not Valid : 0");
          }

          System.out.println("End : ");
    }
}






// class Solution {

//     public static int checkArray(int[] A) {

//         int n = A.length;

//         // Step 1: Check ascending order
//         for (int i = 1; i < n; i++) {
//             if (A[i] < A[i - 1]) {
//                 return 0;
//             }
//         }

//         // Step 2: Check occurrences
//         int count = 1;

//         for (int i = 1; i < n; i++) {
//             if (A[i] == A[i - 1]) {
//                 count++;
//             } else {
//                 if (count < 3) {
//                     return 0;
//                 }
//                 count = 1;
//             }
//         }

//         // Check last number count
//         if (count < 3) {
//             return 0;
//         }

//         return 1;
//     }

//     public static void main(String[] args) {
//         int[] A = {1,1,1,3,3,3,3};
//         System.out.println(checkArray(A));
//     }
// }
