// Dynamic 

// 1 
// 2   6 
// 3   7   10 
// 4   8   11  13 
// 5   9   12  14   15 

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);

           System.err.println("Enter N : ");
           int n=sc.nextInt();

           int counter=n-1;
           int final_value=0;

           for(int i=1; i<=n; i++){
                counter=n-1;
                final_value=i;
            for(int j=i; j>=1; j--){
                System.err.print(final_value+" ");
                final_value=final_value+counter;  
                counter--;
            }
            System.err.println();
           }
        
    }
}
