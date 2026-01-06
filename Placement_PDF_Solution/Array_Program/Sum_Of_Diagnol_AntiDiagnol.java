import java.util.Scanner;

class Sum_Of_Diagnol_AntiDiagnol{
    public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          
        int array_size;

          System.out.println("Enter Array Size : ");
          array_size=sc.nextInt();

          int array[][]=new int[array_size][array_size];

          for(int i=0; i<array_size; i++){
            for(int j=0; j<array_size; j++){
                System.out.println("Enter Array Element : ");
                array[i][j]=sc.nextInt();
            }
          }

          System.out.println("\n----------------------------\n");
          
          for(int i=0; i<array_size; i++){
              for(int j=0; j<array_size; j++){
                  System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("\n----------------------------\n");
            
            int diagnol=0;
            int antidiagnol=0;
            
            for(int i=0; i<array_size; i++){
                diagnol+=array[i][i];
                antidiagnol+=array[i][(array_size-1)-i];
            }
            
            System.out.println("\n----------------------------\n");
            System.out.println("Sum Of Diagnol Element : "+diagnol);
            System.out.println("Sum Of AntiDiagnol Element : "+antidiagnol);
            System.out.println("\n----------------------------\n");

    }
}