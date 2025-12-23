// 1 
// 1 2 1 
// 1 * 3 * 1 
// 1 * * 4 * * 1 
// 1 * * * 5 * * * 1 
// 1 * * * * 6 * * * *1

import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        int n;

        System.out.println("Enter N : ");
        n=sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=(2*i)-1; j++){
                if((j==1) || (j==((2*i)-1))){
                    System.err.print("1");
                }else if(j==i){
                       System.out.print(j);
                }else{
                    System.out.print("*");
                }
            }
        System.out.println();
        }

    }
}
