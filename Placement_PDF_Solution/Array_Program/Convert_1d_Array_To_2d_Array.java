// Convert 1D Array to 2D Matrix

import java.util.Scanner;

public class Convert_1d_Array_To_2d_Array {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        int array_size,row=0,col=0;

        System.out.println("Enter Array Size : ");
        array_size=sc.nextInt();

        int array[]=new int[array_size];
        
        for(int i=0; i<array_size; i++){
            System.out.println("Enter Element : ");
            array[i]=sc.nextInt();
        }
        
        if(array_size%2!=0){
            System.out.println("Not Convert In To 2d Array : ");
        }else{
            row=2;
            col=array_size/row;
            
            int  Two_Array[][]=new int[row][col];

            int k=0;
            
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    Two_Array[i][j]=array[k++];
                }
            }
              
              System.out.println("\n---------------------\n");
              for(int i=0; i<row; i++){
                  for(int j=0; j<col; j++){
                      System.out.print(Two_Array[i][j]+" ");
                    }
                    System.out.println("");
                }
                System.out.println("\n---------------------\n");
            
            }

    }
}
