import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number;
        int sum=0;
        while(true){
            
            System.out.println("Enter number");
            number=sc.nextInt();

            sum+=number;
            System.out.println(+sum);

            if(number==-1){
                break;
            }
        }
        
        sc.close();

    }
}
