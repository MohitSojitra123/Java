// Repeated Number Print  In Array  :  

import java.util.Scanner;

public class Repeated_number {
    public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter Array Size : ");
         int array_size=sc.nextInt();

         int array[]=new int[array_size];

         for(int i=0; i<array_size; i++){
             System.out.println("Enter Array Element : ");
             array[i]=sc.nextInt();
         }

         int Used[]=new int[array_size];

         for(int i=0; i<array_size; i++){
             int count=1;
            for(int j=i+1; j<array_size; j++){
                if(array[i]==array[j] && Used[j]!=-1){
                       count++;
                       Used[j]=-1;
                }
            }
            if(count>1){
                System.out.println(array[i]);
            }
         }

    }
}
