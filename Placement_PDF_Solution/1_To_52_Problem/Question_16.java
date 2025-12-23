import java.util.Scanner;

public class Question_16 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        int n;

        System.out.println("Enter Odd Number (9-11-13 etc )");
       n=sc.nextInt();

        int middle=n/2+1;

       for(int i=1; i<=n; i++){
        for(int j=1; j<=n; j++){
              if((j==middle && (i<=n)) || (i==middle && j<=n) || (j==1 && i<middle) || (j==n && i>middle) || (i==n && j<middle) ||( j>middle && i==1)){
                System.out.print("*");
              }else{
                System.out.print(" ");
              }
        }
        System.out.println(" ");
       }
        
    }
}
