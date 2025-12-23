import java.util.Scanner;

class Question_19{
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);

         int n;
         int count=1;

         System.out.println("Enter N : ");
         n=sc.nextInt();

         for(int i=1; i<=n; i++){

              if(i%2!=0){
                for(int j=1; j<=n; j++){
                    System.out.print(count+" ");
                    count++;
                }
              }else{
                  count=count+n-1;
                for(int j=1; j<=n; j++){
                    System.out.print(count+" ");
                   count--;
                }
                 count=count+n+1;
              }

              System.out.println(" ");
         }

    }
}