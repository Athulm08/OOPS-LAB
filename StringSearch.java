import java.util.Scanner;

public class StringSearch  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of strings
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        String[] strings = new String[n];

        // Read strings from the user
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }

        // Get the string to search
        System.out.print("Enter the string to search: ");
        String searchString = sc.nextLine();

        // Search for the string
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (strings[i].equals(searchString)) {
                System.out.println("String found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("String not found.");
        }

        sc.close();
    }
}
