import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {    
    Scanner sc=new Scanner(System.in);

        System.out.println("Enter Any String To Reverse.....");
        String str = sc.nextLine();   // read full line only

        char ch[] = str.toCharArray();  // convert to char array
        String rev = "";

        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }

        System.out.println("---------------------------");
        System.out.println("Reversed String: " + rev);
        System.out.println("---------------------------");
    }
}
