// Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements 
// such that the first element becomes the last, the second element becomes second last and so on. (Do 
// not use any additional Array) 
// Input: arr[] = {1, 4, 3, 2, 6, 5}   
// Output: {5, 6, 2, 3, 4, 1}

import java.util.Scanner;

public class Question_24 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);  

            int array_size;

            System.err.println("Enter Array Size : ");
            array_size=sc.nextInt();

            int array[]=new int[array_size];

            for(int i=0; i<array_size; i++){
                System.err.println("Enter Array Element : ");
                array[i]=sc.nextInt();
            }

            System.out.println("--------------------------");
            for(int i=0; i<array_size; i++){
                System.out.print(array[i]+" ");
            }
            System.out.println("\n--------------------------");

            int j=array_size-1;
            int Temp=0;

            for(int i=0; i<array_size; i++){
                if(i<j){
                    Temp=array[i];
                    array[i]=array[j];
                    array[j]=Temp;
                    j--;
                }
            }

            System.out.println("--------------------------");
            for(int i=0; i<array_size; i++){
                System.out.print(array[i]+" ");
            }
            System.out.println("\n--------------------------");
            
    }
}
