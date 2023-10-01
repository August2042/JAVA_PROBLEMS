package javaCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> obj = new ArrayList<>();

		int num;

		do {
			System.out.println("WELCOME TO TO-DO-LIST ");
			System.out.println("----------------------");
			System.out.println();

			System.out.println("1> Add work in TO-DO-LIST ");
			System.out.println("2> Delete work in TO-DO-LIST ");
			System.out.println("3> Display work in TO-DO-LIST ");

			System.out.println("Select the given option...");
			int option = sc.nextInt();
			sc.nextLine(); // Consume newline character after reading the integer

			switch (option) {
			case 1:
				// For addition of work
				char choose;
				do {
					System.out.println("Enter the work that you want to enter in your TO-DO-LIST :");
					String work = sc.nextLine();
					obj.add(work);
					System.out.println("If you want to add more work then press y or else n...");
					choose = sc.next().charAt(0);
					sc.nextLine(); // Consume newline character after reading 'y' or 'n'
				} while (choose == 'y');
				break;
			case 2:
				// For removal of work
				System.out.println("Enter the work that you want to remove from the list: ");
				String enteredWork = sc.nextLine();
				if (obj.contains(enteredWork)) {
					obj.remove(enteredWork);
					System.out.println("Work removed successfully.");
				} else {
					System.out.println("Work not found in the list.");
				}
				break;
			case 3:
				// For display work that are present
				System.out.println(obj);
				break;
			}

			System.out.println("Do you want to continue it then press 1 or 0");
			num = sc.nextInt();
		} while (num == 1);
		System.out.println("Thankyou for using !!!!!");

		sc.close();
	}
}
