// WAP to find a Multiplication of 2 Matrix (dimension and value should be entered by user)


import java.util.Scanner;

public class Program_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row1, col1, row2, col2;

        System.out.print("Enter Matrix 1 Rows: ");
        row1 = sc.nextInt();
        System.out.print("Enter Matrix 1 Columns: ");
        col1 = sc.nextInt();

        System.out.print("Enter Matrix 2 Rows: ");
        row2 = sc.nextInt();
        System.out.print("Enter Matrix 2 Columns: ");
        col2 = sc.nextInt();

        if (col1 != row2) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }

        int[][] arr1 = new int[row1][col1];
        int[][] arr2 = new int[row2][col2];
        int[][] result = new int[row1][col2];

        // Input matrix 1
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print("Enter Matrix1[" + i + "][" + j + "]: ");
                arr1[i][j] = sc.nextInt();
            }
        }

        // Input matrix 2
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print("Enter Matrix2[" + i + "][" + j + "]: ");
                arr2[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }


        System.out.println("Result Matrix:");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
