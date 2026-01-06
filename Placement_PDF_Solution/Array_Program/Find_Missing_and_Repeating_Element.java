// Find missing and repeating number in array of 1 to n.

import java.util.Scanner;

public class Find_Missing_and_Repeating_Element {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

         int array_size;

         System.err.println("Enter Array Size : ");
         array_size=sc.nextInt();
         
         int array[]=new int[array_size];
         int array_sum=0;

         for(int i=0; i<array_size; i++){
             System.out.println("Enter Array Element : ");
             array[i]=sc.nextInt();
             array_sum+=array[i];
         }

        System.out.println("\n-----------------------\n");
         for(int i=0; i<array_size; i++){
            System.out.println(array[i]+" ");
         }
        System.out.println("\n-----------------------\n");
        
        int n=array_size+1;
        int n_sum=n*(n+1)/2;
        

        System.out.println("\n-----------------------\n");
        System.out.println("Missing Element Is : "+(n_sum-array_sum));
        System.out.println("\n-----------------------\n");

        int visited_array[]=new int[array_size];
        int count=1;

        for(int i=0; i<array_size; i++){
             if(visited_array[i]==-1){
                continue;
             }else{
                 for(int j=i+1; j<array_size; j++){
                    if(array[i]==array[j]){
                        count++;
                        visited_array[j]=-1;
                    }
                 }
                 System.out.println(array[i]+" ->  "+count);
                 count=1;
             }
        }


    }
}
