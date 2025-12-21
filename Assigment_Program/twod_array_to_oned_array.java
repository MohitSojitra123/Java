import java.util.Scanner;

public class twod_array_to_oned_array  {
      public static void main(String[] args) {
           Scanner sc=new Scanner(System.in); 

           int array_size;

            System.out.println("Enter 2D array Size => ");
             array_size=sc.nextInt();

             int array[][]=new int[array_size][array_size];

             for(int i=0; i<array_size; i++){
                for(int j=0; j<array_size; j++){
                      System.out.println("Enter Element ["+i+"]["+j+"] => ");
                      array[i][j]=sc.nextInt();
                }
             }

           for(int i=0; i<array_size; i++){
            for(int j=0; j<array_size; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
           }

           int Oned_array[]=new int[array_size*array_size];
           int ind=0;

           for(int i=0; i<array_size; i++){
            for(int j=0; j<array_size; j++){
                 Oned_array[ind++]=array[i][j];
            }
           }

           System.out.println("------------------Oned Array------------------");
           for(int i=0; i<Oned_array.length; i++){
               System.out.print(Oned_array[i]+" ");
           }
           System.out.println();
           System.out.println("----------------------------------------------");

             int array2[][]=new int[array_size][array_size];

            ind=0;

           System.out.println("--------------------Twod Array---------------");
                for(int i=0; i<array_size; i++){
                    for(int j=0; j<array_size; j++){
                          array2[i][j]=Oned_array[ind++];
                    }
                }

                for(int i=0; i<array_size; i++){
                    for(int j=0; j<array_size; j++){
                        System.out.print(array2[i][j]);
                    }
                    System.out.println();
                }
           System.out.println("----------------------------------------------");

      }
}
