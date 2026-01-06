// Convert 2D Matrix to 1D Array

import java.util.Scanner;

class Convert_2d_Array_Into_1d_Array{
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          
           int row,col;

           System.out.println("Enter Row Size : ");
           row=sc.nextInt();

           System.out.println("Enter Col Size : ");
           col=sc.nextInt();

           int array1[][]=new int[row][col];
           int array2[]=new int[row*col];
           int k=0;

           for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.println("Enter Element : ");
                array1[i][j]=sc.nextInt();
                array2[k++]=array1[i][j];
            }
           }

           System.out.println("\n-----------------------\n");
           for(int i=0; i<array2.length; i++){
               System.out.print(array2[i]+"  ");
            }
            System.out.println("\n-----------------------\n");

    }
}