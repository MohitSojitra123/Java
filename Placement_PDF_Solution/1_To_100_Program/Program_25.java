// WAP  to  check  weather  number  is  present  in  array  or  not  (using  recursion  only)  and  the 
// function’s syntax is given below 
// Int isInArray(int a[],int m);  
// Where int a[] is Array of integer and m is element to be searched. 

import java.util.Scanner;

public class Program_25 {

    static int i;   // static index

   static int isInArray(int a[], int m) {
//     int isInArray(int a[], int m) {

        // Base condition
        if (i < 0) {
            return -1;
        }

        // If element found
        if (a[i] == m) {
            return i;
        }

        // Move to previous index
        i--;
        return isInArray(a, m);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Program_25 obj = new Program_25();

        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int array[] = new int[n];

        for (int j = 0; j < n; j++) {
            System.out.print("Enter Element: ");
            array[j] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int m = sc.nextInt();

        i = array.length - 1;

        int result = Program_25.isInArray(array, m);
        // int result = obj.isInArray(array, m);

        System.out.println("\n---------------------------\n");
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
        System.out.println("\n---------------------------\n");

        
    }
}

