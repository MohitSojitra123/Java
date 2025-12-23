// 3 3 3 3 3 3 3 3 5 6 
// 3 2 2 2 2 2 2 4 5 6
// 3 2 1 1 1 1 3 4 5 6
// 3 2 1 0 0 2 3 4 5 6
// 3 2 1 0 1 2 3 4 5 6
// 3 2 1 0 2 2 3 4 5 6
// 3 2 1 3 3 3 3 4 5 6
// 3 2 4 4 4 4 4 4 5 6
// 3 5 5 5 5 5 5 5 5 6
// 6 6 6 6 6 6 6 6 6 6 

import java.util.Scanner;

class Question_18{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         int n;

         System.out.println("Enter n : ");
         n=sc.nextInt();

         for(int i=1-n; i<=n; i++){
            for(int j=1-n; j<=n; j++){
                  if(Math.abs(i)>Math.abs(j)){
                      System.out.print(Math.abs((i)+1)+" ");
                  }else{
                     System.out.print(Math.abs((j)+1)+" ");
                  }
            }
            System.err.println("");
         }

    }
}
