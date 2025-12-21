import java.util.Scanner;

public class Cricket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int over,ball=6;

        System.out.println("Enter no. of overs");
        over= sc.nextInt();

        int [] [] arr = new int [over][ball];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<6;j++){
                System.out.println("Enter Runs ["+i+"] ["+j+"]");
                arr[i][j]=sc.nextInt();
            }
        }

        int totalrun=0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<6;j++){
                
                totalrun+=arr[i][j];
            }
        }

        for(int i=0;i<over;i++){
            int runover=0;
            for(int j=0;j<ball;j++){
                runover+=arr[i][j];
                
            }
            System.out.println("run in over["+i+"]"+runover);
        }

        double average = totalrun / (double) arr.length;
        System.out.println("Totalrun"+totalrun);
        System.out.println("Average Run"+average);


    }
}
