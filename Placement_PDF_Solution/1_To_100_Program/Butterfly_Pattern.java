import java.util.Scanner;

public class Butterfly_Pattern {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println("Enter N : ");
          int n=sc.nextInt();

          for(int i=1; i<n; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }

                for(int space=1; space<=(((n-i)*2)-1); space++){
                    System.out.print(" ");
                }

                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }

                 System.out.println();
          }

          for(int i=1; i<=(n*2-1); i++){
            System.out.print("*");
          }
          System.out.println();

          for(int i=1; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.print("*");
            }
            for(int space=1; space<=((i*2)-1); space++){
                    System.out.print(" ");
            }

            for(int j=n; j>i; j--){
                System.out.print("*");
            }

            System.out.println();
          }

        

    }
}
