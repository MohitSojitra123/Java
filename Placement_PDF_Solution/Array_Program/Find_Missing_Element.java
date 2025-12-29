// Find the missing number in an array of 1 to n.

import java.util.Scanner;

public class Find_Missing_Element {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          int array_size;

          System.out.println("Enter Array Size : ");
          array_size=sc.nextInt();

          int array[]=new int[array_size];

          int max_ele=Integer.MIN_VALUE;

          for(int i=0; i<array_size; i++){
                System.out.println("Enter Array Element : ");
                array[i]=sc.nextInt();

                if(array[i]>max_ele){
                    max_ele=array[i];
                }
        }

        boolean num_arr[]=new boolean[max_ele+1];

        for(int i=0; i<array_size; i++){
             num_arr[array[i]]=true;
        }

        System.out.println("\n-------------------------------\n");
        System.out.println("Missing Element : ");
        
        for(int i=1; i<max_ele; i++){
            if(num_arr[i]!=true){
                System.out.println(i);
            }
        }
        
        System.out.println("\n-------------------------------\n");

        


    }
}
