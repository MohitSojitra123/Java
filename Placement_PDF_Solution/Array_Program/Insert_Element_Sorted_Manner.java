import java.util.Scanner;

public class Insert_Element_Sorted_Manner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size: ");
        int array_size = sc.nextInt();

        int array[] = new int[array_size + 1];

        // Input elements
        for (int i = 0; i < array_size; i++) {
            System.out.print("Enter Array Element: ");
            array[i] = sc.nextInt();
        }

        // Sort array (Bubble Sort)
        for (int i = 0; i < array_size; i++) {
            for (int j = i + 1; j < array_size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("\nSorted Array:");
        for (int i = 0; i < array_size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.print("\nEnter Element To Insert: ");
        int new_ele = sc.nextInt();

        int pos = 0;

        // Find correct position
        while (pos < array_size && array[pos] < new_ele) {
            pos++;
        }

        // Shift elements right
        for (int i = array_size; i > pos; i--) {
            array[i] = array[i - 1];
        }

        // Insert element
        array[pos] = new_ele;
        array_size++;

        System.out.println("\nArray After Insertion:");
        for (int i = 0; i < array_size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
