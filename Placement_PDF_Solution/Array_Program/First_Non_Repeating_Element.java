// Find first non-repeating element in an array.

import java.util.Scanner;

public class First_Non_Repeating_Element {
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

        System.out.println("\n-----------------------------\n");
          for(int i=0; i<array_size; i++){
              System.out.print(array[i]+" ");
            }
        System.out.println("\n-----------------------------\n");

        boolean isRepeated=false;
        
        for(int i=0; i<array_size; i++){
            for(int j=i+1; j<array_size; j++){
                     if(array[i]==array[j]){
                         isRepeated=true;
                         break;
                        }
            }
            if(!isRepeated){
                System.out.println("First Non Repeating Element Is : "+array[i]);
                break;
            }
            isRepeated=false;
        }

    }
}
