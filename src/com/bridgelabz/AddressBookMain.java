package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome to the Address Book Problem");
		AddressBook adressBookImplementation = new AddressBook();
		boolean condition = true;

		while (condition == true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1.add" + "\n" + "2.Display" + "\n" + "3.edit" + "\n" +"4.delete" + "\n" +"5.addMultiplePerson");
			Scanner option = new Scanner(System.in);

			switch (option.nextInt()) {
			case 1:
				adressBookImplementation.add();
				break;
			case 2:
				adressBookImplementation.display();
				break;
			case 3:
				adressBookImplementation.edit();
				break;
			case 4:
				System.out.println("Enter the Name of the person do you wants to delete");
				String name = scanner.nextLine();
				adressBookImplementation.delete(name);
				break;
			case 5:
				adressBookImplementation.addMultiplePerson();
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
	}
}
