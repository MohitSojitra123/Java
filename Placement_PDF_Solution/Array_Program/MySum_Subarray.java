import java.util.Scanner;

public class MySum_Subarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Array Element: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Target Value: ");
        int target = sc.nextInt();

        System.out.println("\nSubarrays with sum = " + target + ":");

        // start index
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum == target) {
                    for (int x = i; x <= j; x++) {
                        System.out.print(arr[x] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
