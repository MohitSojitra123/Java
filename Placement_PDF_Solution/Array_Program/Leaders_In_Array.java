// Find leaders in an array.

// A leader in an array is an element that is strictly greater than all the elements to its right in the array.

import java.util.Scanner;

public class Leaders_In_Array {
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

        System.out.println("\n------------------------\n");
        for(int i=0; i<array_size; i++){
            System.out.println(array[i]+" ");
        }
        System.out.println("\n------------------------\n");
        
        boolean isLeader=true;
        
        System.out.println("\n------------------------\n");
        System.out.println("Leaders Element Is : ");
        
        for(int i=0; i<array_size; i++){
            isLeader=true;
            for(int j=i+1; j<array_size; j++){
                if(array[i]<=array[j]){
                    isLeader=false;
                    break;
                }
            }
            if(isLeader){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println("\n------------------------\n");

        
    }
}
