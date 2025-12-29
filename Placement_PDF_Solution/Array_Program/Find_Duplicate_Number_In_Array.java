// Find the duplicate number in an array.

import java.util.Scanner;

public class Find_Duplicate_Number_In_Array {
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

          int visited_array[]=new int[array_size];
          int count=1;


          System.out.println("\n ----------------------------------- \n");
          System.out.println("\n Repeted Element : \n");
          System.out.println("\n ----------------------------------- \n");
          
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
                }
                if(count>1){
                    System.out.println(array[i] +"  ->  " + count);
                }
                count=1;
            }
            
            System.out.println("\n ----------------------------------- \n");

    }
}
