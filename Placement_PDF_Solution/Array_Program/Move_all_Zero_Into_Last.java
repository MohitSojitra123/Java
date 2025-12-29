// Move all zeros to end of the array.
import java.util.Arrays;
import java.util.Scanner;

public class Move_all_Zero_Into_Last {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);

        int array_size;

        System.out.println("Enter Array Size : ");
        array_size=sc.nextInt();

        int array[]=new int[array_size];

        for(int i=0; i<array_size; i++){
            System.out.println("Enter Array Element : "+(i+1));
            array[i]=sc.nextInt();
        }

        System.out.println("\n-------------------\n");
        
        for(int i=0; i<array_size; i++){
            System.out.print(array[i]+" ");
        }
        
        System.out.println("\n-------------------\n");
        
        int index=0;
        
        for(int i=0; i<array_size; i++){
            if(array[i]!=0){
                array[index]=array[i];
                index++;
            }
        }
        
        while(index<array_size){
            array[index]=0; 
            index++;
        }
        
        System.out.println("\n-------------------\n");
        for(int i=0; i<array_size; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n-------------------\n");


        System.out.println("\n-------------------\n");
        System.out.println("Convert Array in To Strgin");
        System.out.println(Arrays.toString(array));
        System.out.println("\n-------------------\n");

    }
}
