// You  are  given  a  0-indexed  integer  array  nums  representing  the  contents  of  a  pile,  where 
// nums[0] is the topmost element of the pile. 
 
// In one move, you can perform either of the following: 
 
// If the pile is not empty, remove the topmost element of the pile. 
// If  there  are  one  or  more  removed  elements,  add  any  one  of  them  back  onto  the  pile.  This 
// element becomes the new topmost element. 
// You are also given an integer k, which denotes the total number of moves to be made. 
 
// Return the maximum value of the topmost element of the pile possible after exactly k 
// moves. In case it is not possible to obtain a non-empty pile after k moves, return -1.


// It means 
// user Input
// 5 than (4) pop largest push (1)
// 9 than (8) pop largest push (1)

import java.util.ArrayList;
import java.util.Scanner;

public class Program_74 {
    public static void main(String[] args) {
           
        Scanner sc=new Scanner(System.in);


            System.out.println("Enter Array Size : ");
            int array_size=sc.nextInt();

            int array[]=new int[array_size+1];

            for(int i=0; i<array_size; i++){
                System.out.println("Enter Array Size : ");
                array[i]=sc.nextInt();
            }
        
            System.out.println("Enter Kth Element : ");
            int Kth=sc.nextInt();

            ArrayList<Integer> list1=new ArrayList<>();

        for(int i=0; i<Kth; i++){
            for(int j=0; j<array_size-1; j++){
                 if(j==0){
                     list1.add(array[j]);
                 }
                 array[j]=array[j+1];
            }
            array_size--;
        }

        System.out.println("Final Array Element : ");
        for(int i=0; i<array_size; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n---------------------\n");

        System.out.println("Array List Element : ");
        for(int i=0; i<list1.size(); i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println("\n---------------------\n");

        int max=list1.get(0);

        for(int i=1; i<list1.size(); i++){
              if(list1.get(i) > max){
                      max=list1.get(i);  
              }
        }

        array_size++;  

        for(int i=array_size-2; i>=0; i--){
            array[i+1]=array[i];
        }

        array[0]=max;

        System.out.println("\n----------------------\n");
        for(int i=0; i<array_size; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n----------------------\n");

    }
}
