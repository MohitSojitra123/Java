import java.io.*;

public class Count_Number_of_occurence {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide file name as command-line argument.");
            return;
        }

        String fileName = args[0];
        int count = 0;

        try {
            FileReader fr = new FileReader(fileName);
            int ch;

            while ((ch = fr.read()) != -1) {  // Read character by character
                if (ch == '5') {              // Check if character is digit 5
                    count++;
                }
            }

            fr.close();

            System.out.println("Total number of digit '5': " + count);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}

