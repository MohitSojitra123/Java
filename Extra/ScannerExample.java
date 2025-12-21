    import java.util.Scanner;

    public class ScannerExample {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter your age: ");
            int age = scanner.nextInt(); // Reads integer, leaves newline in buffer

            scanner.nextLine(); // Consumes the leftover newline character

            System.out.print("Enter your full name: ");
            String fullName = scanner.nextLine(); // Reads the full line of text

            System.out.println("Age: " + age);
            System.out.println("Full Name: " + fullName);

            scanner.close();
        }
    }
