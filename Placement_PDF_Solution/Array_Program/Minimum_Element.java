// Find the minimum element in an array.

import java.util.Scanner;

public class Minimum_Element {
     public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);

           int array_size;

           System.out.println("Enter Array Size : ");
           array_size=sc.nextInt();

           int array[]=new int[array_size];
           int min_ele=Integer.MAX_VALUE;

           for(int i=0; i<array_size; i++){
            System.out.println("Enter Array Element : ");
            array[i]=sc.nextInt();

            if(array[i]<min_ele){
                min_ele=array[i];
            }
        }

        System.out.println("Minimum Value Is : "+min_ele);


     }
}


