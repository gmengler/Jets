package project;

import java.util.Scanner;

public class Hangar {
	Jets jet[] = new Jets[10];

	// starting array list
	public Hangar() {
		jet[0] = new Jets("UH-60 Black Hawk", 183, 368, 5.9);
		jet[1] = new Jets("Boeing 747", 690, 8900, 22.8);
		jet[2] = new Jets("F-18 Hornet", 1190, 1089, 29.0);
		jet[3] = new Jets("F-35 Lightning", 1200, 1200, 121.8);
		jet[4] = new Jets("SR-71 Blackbird", 2200, 3355, 33.0);

	}

	// method prints out list of jets
	public void jetList() {
		for (int i = 0; i < jet.length; i++) {
			if (jet[i] != null) {
				System.out.println(jet[i].toString());
			}
		}
	}

	// method to print fastest aircraft
	public void fastest() {
		Jets fastest = jet[0];
		for (int i = 0; i < jet.length; i++) {
			if (jet[i] != null) {
				if (fastest.getSpeed() < jet[i].getSpeed()) {
					fastest = jet[i];
				}
			}
		}
		System.out.println("The fastest aircraft is: \n" + fastest);
	}

	// method to print longest range aircraft
	public void longest() {
		Jets longest = jet[0];
		for (int i = 0; i < jet.length; i++) {
			if (jet[i] != null) {
				if (longest.getRange() < jet[i].getRange()) {
					longest = jet[i];
				}
			}
		}
		System.out.println("The aircraft with the longest range is: \n" + longest);
	}
	
//	method to add new jets to array
	public void addJet() {
		for (int i = 0; i < jet.length; i++) {
			if (jet[i] == null) {
				@SuppressWarnings("resource")
				Scanner kb = new Scanner(System.in);
				System.out.println("Please enter the model of aircraft: ");
				String model = kb.next();
				System.out.println("Please enter speed in MPH: ");
				float speed = kb.nextFloat();
				System.out.println("Please enter range in miles: ");
				int range = kb.nextInt();
				System.out.println("Please enter price of aircraft in millions: ");
				double price = kb.nextDouble();
				jet[i] = new Jets(model, speed, range, price);
				break;
			}
		}
	}


}
