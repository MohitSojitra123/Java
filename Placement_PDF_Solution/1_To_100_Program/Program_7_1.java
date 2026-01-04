// WAP to find a Fibonacci series up to n terms (n is entered by user) (iterative and recursive)

// 0 1 1 2 3 5 8 13 ...


import java.util.Scanner;

public class Program_7_1 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

          System.out.println("Enter Any  Number To Print Fibonacci Sequence : ");
          int user_num=sc.nextInt();

          int a=0,b=1,c=0;

          for(int i=1; i<=user_num; i++){
              System.out.print(a+" ");
                c=a+b;
                b=a;
                a=c;
          }


    }
}
