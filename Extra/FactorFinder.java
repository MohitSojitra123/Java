import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        findFactors(num);
    }

    public static void findFactors(int number) {
        boolean flag = false; 

        System.out.print("Factors of " + number + " are: ");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                flag = true; 
            }
        }

        if (!flag && number > 1) {
            System.out.print("No other distinct factors found");
        } else if (number <= 0) {
            System.out.print("Factors are not typically defined for non-positive numbers ");
        }
        System.out.println(); 
    }

 
}