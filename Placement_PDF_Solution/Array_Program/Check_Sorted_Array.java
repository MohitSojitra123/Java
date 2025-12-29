import java.util.Scanner;

public class Check_Sorted_Array {
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

          System.out.println("\n----------------------\n");
          for(int i=0; i<array_size; i++){
              System.out.println(array[i]+" ");
            }
            System.out.println("\n----------------------\n");

            boolean IsSorted=true;

            for(int i=0; i<array_size-1; i++){
                if(array[i] > array[i+1]){
                       IsSorted=false;
                       break;
                }
            }

            if(IsSorted){
                System.out.println(" Array Is Sorted : ");
            }else{
                System.out.println(" Array Is Not Sorted : ");
            }

    }
}
