import java.util.Scanner;

public class ConcatenateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of strings
        System.out.println("Enter the number of strings:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Taking input for the array of strings
        String[] strings = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }

        // Concatenating strings using StringBuffer
        String result = concatenateStrings(strings);

        // Printing the concatenated result
        System.out.println("\nConcatenated String:");
        System.out.println(result);

        sc.close();
    }

    public static String concatenateStrings(String[] strings) {
        StringBuffer sb = new StringBuffer();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }
}
