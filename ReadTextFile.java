import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Pranav Aggarwal\\OneDrive\\Desktop\\example.txt";

        try (FileReader fileReader = new FileReader(filePath); // Create FileReader
             BufferedReader bufferedReader = new BufferedReader(fileReader)) { // Wrap in BufferedReader

            String line;
            while ((line = bufferedReader.readLine()) != null) { // Read each line
                System.out.println(line); // Print the line
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}

