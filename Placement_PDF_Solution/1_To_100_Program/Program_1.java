// WAP to find a sum of even number into 1D array.

import java.util.Scanner;

class Program_1{
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          int array_size,sum=0;

          System.out.println("Enter Array Size : ");
          array_size=sc.nextInt();


          int array[]=new int[array_size];

          for(int i=0; i<array_size; i++){
            System.out.println("Enter Array Size : ");
            array[i]=sc.nextInt();

            if(array[i] %2 ==0){
                 sum+=array[i];
            }
          }


          System.out.println("Array All Even Element Sum Is : "+sum);
          
    }
}