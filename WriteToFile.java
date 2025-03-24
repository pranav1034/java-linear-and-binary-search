import java.io.*;

public class WriteToFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Pranav Aggarwal\\OneDrive\\Desktop\\example3.txt";
        System.out.println("Enter text (type 'exit' to stop):");

        try (
                InputStreamReader isr = new InputStreamReader(System.in); // Read bytes → characters
                BufferedReader reader = new BufferedReader(isr);          // Efficient line reading
                FileWriter writer = new FileWriter(filePath, true);       // Append mode
                BufferedWriter bw = new BufferedWriter(writer)            // Buffer for efficiency
        ) {
            String line;
            while (true) {
                line = reader.readLine(); // Read user input
                if (line.equalsIgnoreCase("exit")) {
                    break; // Stop when user types "exit"
                }
                bw.write(line); // Write input to file
                bw.newLine();   // Add a new line
            }
            System.out.println("User input has been saved to: " + filePath);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
