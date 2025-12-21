import java.util.Scanner;
import java.util.Arrays; // For sorting to easily find min/max

public class NumberOperations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Please enter five integers:");

        // Get five numbers from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("Enter 'E' to execute it ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                Arrays.sort(numbers); // Sort the array to easily find the smallest
                System.out.println("The smallest number is: " + numbers[0]);
                
            case 2:
                Arrays.sort(numbers); // Sort the array to easily find the largest
                System.out.println("The largest number is: " + numbers[4]); // Last element after sorting
            
            case 3:
                int sum = 0;
                for (int num : numbers) {
                    sum += num;
                }
                System.out.println("The sum of the numbers is: " + sum);
                
            case 4:
                double average = 0;
                int totalSum = 0;
                for (int num : numbers) {
                    totalSum += num;
                }
                average = (double) totalSum / numbers.length;
                System.out.printf("The average of the numbers is: %.2f%n", average);
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                break;
        }

        input.close();
    }
}