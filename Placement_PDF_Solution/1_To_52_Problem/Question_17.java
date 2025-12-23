// Write a program to print Pascal triangle.

import java.util.Scanner;

class Question_17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n;

        System.out.println("Enter N : ");
        n=sc.nextInt();

        for(int i=1; i<=n; i++){
            
            for(int space=n; space>i; space--){
                System.out.print(" ");
            }

            for(int j1=1; j1<=i; j1++){
                System.out.print(j1);
            }

            for(int j2=i-1; j2>=1; j2--){
                System.out.print(j2);
            }
                System.out.println(" ");
        }

    }
}