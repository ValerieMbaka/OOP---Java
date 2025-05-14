import java.util.Scanner;

public class NameSearch {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                String[] names = new String[100];
                
                // Read 100 student names
                System.out.println("Enter 100 student names:");
                for (int i = 0; i < names.length; i++) {
                        System.out.print("Student " + (i + 1) + ": ");
                        names[i] = input.nextLine();
                }
                
                // Ask user to search for a name
                System.out.print("\nEnter a name to search: ");
                String searchName = input.nextLine();
                
                // Search logic
                boolean found = false;
                for (int i = 0; i < names.length; i++) {
                        if (names[i].equalsIgnoreCase(searchName)) {
                                System.out.println("Match found: " + names[i] + " at position " + (i + 1));
                                found = true;
                                break;
                        }
                }
                
                if (!found) {
                        System.out.println("No match found for '" + searchName + "'.");
                }
                
                input.close();
        }
}
