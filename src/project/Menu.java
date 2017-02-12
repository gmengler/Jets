package project;

import java.util.Scanner;

public class Menu {
	Scanner kb = new Scanner(System.in);
	Hangar menu = new Hangar();
	

	public void jetsMenu() {
		
		int choice = 0;
		System.out.println("Helicopters are cooler than jets, but we'll continue anyway.\n");

		do {
			System.out.println("MENU - select from the following:");
			System.out.println("1. List fleet");
			System.out.println("2. View fastest jet");
			System.out.println("3. View jet with longest range");
			System.out.println("4. Add jet to fleet");
			System.out.println("5. Quit");
			choice = kb.nextInt();
			System.out.println();

			if (choice < 1 || choice > 5) {
				System.out.println("Invalid selection, please select 1-5.");
				choice = kb.nextInt();
				System.out.println();
			}

			switch (choice) {
			case 1:
				menu.jetList();
				break;
			case 2:
				menu.fastest();
				break;
			case 3:
				menu.longest();
				break;
			case 4:
				menu.addJet();
				break;
			}

		} while (choice != 5);

		System.out.println("Goodbye");
		kb.close();
	}
}
