// Find the maximum element in an array.

import java.util.Scanner;

class Maximum_Element{
      public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);

           int array_size;

           System.out.println("Enter Array Size  : ");
           array_size=sc.nextInt();

           int array[]=new int[array_size];
           int max_ele=Integer.MIN_VALUE;

           for(int i=0; i<array_size; i++){
            System.out.println("Enter Array Element : ");
            array[i]=sc.nextInt();

             if(array[i] > max_ele){
                max_ele=array[i];
             }
           }

           System.out.println("Max Element Is : "+max_ele);

      }
}