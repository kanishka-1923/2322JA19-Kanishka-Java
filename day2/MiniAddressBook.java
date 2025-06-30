package day2;
import java.util.Scanner;

public class MiniAddressBook {
	public static void main(String[] args) {
        final int SIZE = 5; // Maximum number of contacts
        String[] names = new String[SIZE];
        String[] phoneNumbers = new String[SIZE];
        Scanner  scanner = new Scanner (System.in);
        // Input contacts
        System.out.println("Enter details for " + SIZE + " contacts:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter name for contact " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
            System.out.print("Enter phone number for " + names[i] + ": ");
            phoneNumbers[i] = scanner.nextLine();
        }
        // Display contacts
        System.out.println("\n--- Address Book ---");
        for (int i = 0; i < SIZE; i++) {
            System.out.println("Contact " + (i + 1) + ": " + names[i] + " - " + phoneNumbers[i]);
        }
        scanner.close();
    }
}


