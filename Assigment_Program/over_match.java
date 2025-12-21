import java.util.Scanner;

public class over_match {
       public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);   

            int array_row;

            System.out.println("Enter Total Over => ");
            array_row=sc.nextInt();

            int array[][]=new int[array_row][6];

           for(int i=0; i<array_row; i++){
            for(int j=0; j<6; j++){
                System.out.println("Enter Over  ["+(i+1)+"] Run ["+(j+1)+"] => ");
                array[i][j]=sc.nextInt();
            }
           }

           for(int i=0; i<array_row; i++){
            System.out.println("---------------------------------------");
            System.out.println("Over Number => "+(i+1));
            System.out.print("Run Is =>  ");
            int total_run=0,avg=0;
            for(int j=0; j<6; j++){
                 total_run+=array[i][j];
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
            System.out.println("Total Run Is => "+total_run);
            System.out.println("Avg.. Is => "+(total_run/6));
            System.out.println("---------------------------------------");
           }

        
       }
}
