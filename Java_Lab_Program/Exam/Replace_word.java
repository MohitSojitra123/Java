import java.io.*;

public class ReplaceWords {
    public static void main(String[] args) {
        String file1 = "input.txt";
        String file2 = "output.txt";

        String word1 = "hello";   // Word to replace
        String word2 = "hi";      // New word

        int count = 0;  // To count replacements

        try {
            BufferedReader br = new BufferedReader(new FileReader(file1));
            BufferedWriter bw = new BufferedWriter(new FileWriter(file2));

            String line;

            while ((line = br.readLine()) != null) {
                // Count occurrences
                String[] words = line.split(" ");
                for (String w : words) {
                    if (w.equals(word1)) {
                        count++;
                    }
                }

                // Replace word1 with word2
                line = line.replace(word1, word2);

                // Write to file2
                bw.write(line);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Replacement Done!");
            System.out.println("Total Replacements: " + count);

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error reading/writing file.");
        }
    }
}
