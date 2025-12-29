// Implement binary search on a sorted array.

import java.util.Scanner;

public class Binary_Search {

    static int binary_search(int arr[],int search_ele){
        
        // Array Is Sorted First..... Than Work in Binary Search.....

         int end=arr.length-1;
         int start=0;
         int mid;

         while (start<=end) {
            mid=(start+end)/2;
            
            if(arr[mid] == search_ele){
                 return mid;
            }else if(search_ele > arr[mid]){
                start=mid+1;  // search right side
            }else   if(search_ele < arr[mid]){
                end=mid-1;  // search left side
            }
         }
        return -1;
    }

    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println("Enter Array Size : ");
          int array_size=sc.nextInt();

          int array[]=new int[array_size];

          for(int i=0; i<array_size; i++){
            System.out.println("Enter Array Element : ");
            array[i]=sc.nextInt();  
          }

          System.out.println("\n------------------------\n");
          for(int i=0; i<array_size; i++){
            System.out.print(array[i]+" ");
          }
          System.out.println("\n------------------------\n");

        System.err.println("Enter Search Element : ");
        int find_ele=sc.nextInt();

        int result=Binary_Search.binary_search(array, find_ele);


        if(result==-1){
            System.out.println("Element Is Not Present : "+find_ele);
        }else{
            System.out.println("Element Is Index Number Is : "+result);
        }


    }
}
