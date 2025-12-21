import java.util.Scanner;

public class multidarraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] [] arr1= new int[3][3];
        int [] [] arr2= new int[3][3];
        int [] [] sum = new int[3][3];

        //get input from user

        for(int i = 0 ; i<arr1.length ; i++){
            for(int j=0 ; j<arr1.length ; j++){
                System.out.print("Enter array["+i+"]["+j+"]");
                arr1[i][j] = sc.nextInt();
            }
          
        }

        for(int i = 0 ; i<arr2.length ; i++){
            for(int j=0 ; j<arr2.length ; j++){
                System.out.print("Enter array["+i+"]["+j+"]");
                arr2[i][j] = sc.nextInt();
            }
          
        }

        //print output of both array
        System.out.println("output of an array");
        System.out.println("Array-1");
        for(int i = 0 ; i<arr1.length ; i++){
            for(int j=0 ; j<arr1.length ; j++){
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Array-2");
        for(int i = 0 ; i<arr2.length ; i++){
            for(int j=0 ; j<arr2.length ; j++){
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }

        //sum of an array
        System.out.println("sum of an array");
        for(int i = 0 ; i<sum.length ; i++){
            for(int j=0 ; j<sum.length ; j++){
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
