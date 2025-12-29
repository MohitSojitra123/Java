import java.util.Scanner;

public class Nth_Small_Nth_Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int array_size=sc.nextInt();

        int array[]=new int[array_size];

        for(int i=0; i<array_size; i++){
           System.out.println("Enter Array Element : ");
           array[i]=sc.nextInt();
        }

      System.out.println("\n-----------------------------\n");

      for(int i=0; i<array_size; i++){
        for(int j=i+1; j<array_size; j++){
            if(array[i]>array[j]){
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
      }

    System.out.println("\n-----------------------------\n");
    System.out.println("Sorting Array : ");
    System.out.println("\n-----------------------------\n");
    for(int i=0; i<array_size; i++){
        System.out.print(array  [i]+" ");
    }
    System.out.println("\n-----------------------------\n");

    for(int i=0; i<array_size-1; i++){
        if(array[i] == array[i+1]){
            for(int j=i+1; j<array_size-1; j++){
                array[j]=array[j+1];
            }
            array_size--;
            i--;
        }
    }

    System.out.println("\n-----------------------------\n");
    System.out.println("Remove Duplicate : ");
    System.out.println("\n-----------------------------\n");
    for(int i=0; i<array_size; i++){
        System.out.print(array  [i]+" ");
    }
    System.out.println("\n-----------------------------\n");
          

    System.out.println("Enter Kth Position Smallest Element : ");
    int small_ele=sc.nextInt();

    System.out.println("Enter Kth Position Largest Element : ");
    int largest_ele=sc.nextInt();

    System.out.println("Small Element :  Position " + small_ele +"  --> " + array[small_ele-1]);
    System.out.println("Largest Element :  Position " + largest_ele +"  --> " + array[array_size-largest_ele]);


    // array  Is Sorting Than  Use In 
    // array[small_ele-1]
    // array[array_size-largest_ele]

    }
}
