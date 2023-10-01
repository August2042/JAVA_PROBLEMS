package javaCollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MembershipSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome");
		Set<String> emailAddress = new HashSet<>();
		char ch;

		do {
			System.out.println("1. Enter an email address");
			System.out.println("2. Display email addresses");

			System.out.print("Select an option: ");
			int option = sc.nextInt();
			sc.nextLine(); // Consume the newline character

			switch (option) {
			case 1:
				System.out.print("Enter the email address: ");
				String enteredEmail = sc.nextLine();
				if (emailAddress.contains(enteredEmail)) {
					System.out.println("Email address already exists!!!");
				} else {
					emailAddress.add(enteredEmail);
					System.out.println("Email address added successfully.");
				}
				break;
			case 2:
				System.out.println("List of email addresses:");
				for (String email : emailAddress) {
					System.out.println(email);
				}
				break;

			default:
				System.out.println("Invalid option. Please select a valid option.");
			}

			System.out.println("Do you want to continue? Press 'y' to continue or any other key to exit: ");
			ch = sc.next().charAt(0);
			sc.nextLine(); // Consume the newline character

		} while (ch == 'y');
	}
}
