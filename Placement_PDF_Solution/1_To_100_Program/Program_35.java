// Given two integer arrays nums1 and nums2, return an array of their intersection. Each 
// element in the result must appear as many times as it shows in both arrays and you may 
// return the result in sorted order.

import java.util.ArrayList;
import java.util.Scanner;

public class Program_35 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array Size 1 : ");
        int array_size1=sc.nextInt();

        System.out.println("Enter Array Size 2 : ");
        int array_size2=sc.nextInt();

        int array1[]=new int[array_size1];
        int array2[]=new int[array_size2];

        for(int i=0; i<array_size1; i++){
            System.out.println("Enter Array 1 Element : ");
            array1[i]=sc.nextInt();
        }

        for(int j=0; j<array_size2; j++){
            System.out.println("Enter Array 2 Element : ");
            array2[j]=sc.nextInt();
        }

     ArrayList<Integer> list1=new ArrayList<>();
   
       boolean used[]=new boolean[array_size2];


     for(int i=0; i<array_size1; i++){
        for(int j=0; j<array_size2; j++){
            if(array1[i] == array2[j]  && !used[j]){
                    list1.add(array1[i]);
                    used[j]=true;
                    break;
            }
        }
     }

     int result[]=new int[list1.size()];

     for(int i=0; i<list1.size(); i++){
        result[i]=list1.get(i);
     }

     System.out.println("\n------------------------\n");
     for(int i=0; i<result.length; i++){
         System.out.print(result[i]+" ");
        }
        System.out.println("\n------------------------\n");


    }
}
