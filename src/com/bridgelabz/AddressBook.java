package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook implements IAddressBook {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Person> personList = new ArrayList<Person>();
	Map<String,Person>hashmap = new HashMap<>();

	@Override
	public void add() {
		System.out.println("Enter your first name");
		String firstName = scanner.nextLine();
		System.out.println("Enter your last name");
		String lastName = scanner.nextLine();
		System.out.println("Enter your address");
		String address = scanner.nextLine();
		System.out.println("Enter your city");
		String city = scanner.nextLine();
		System.out.println("Enter your state");
		String state = scanner.nextLine();
		System.out.println("Enter your phone");
		long mobileNo = scanner.nextLong();
		System.out.println("Enter your zip code");
		int zip = scanner.nextInt();

		Person person1 = new Person(firstName, lastName, address, city, state, mobileNo, zip);
		personList.add(person1);
		System.out.println("contact added successfully");

	}
	
	public void edit() {
		String enteredName;
		System.out.println("Enter First name of contact to edit it ");
		enteredName = scanner.next();
		for (int i = 0; i < personList.size(); i++) {
			if (personList.get(i).getFirstName().equals(enteredName)) {
				int check = 0;
				System.out.println("Person found , what do you want to edit ?");
				System.out.println(
						"Enter\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Phone\n8.Email");
				check = scanner.nextInt();
				switch (check) {
				case 1:
					System.out.println("Enter new first name");
					personList.get(i).setFirstName(scanner.next());
					break;
				case 2:
					System.out.println("Enter new last name");
					personList.get(i).setLastName(scanner.next());
					break;
				case 3:
					System.out.println("Enter new Address");
					personList.get(i).setAddress(scanner.next());
					break;
				case 4:
					System.out.println("Enter new city");
					personList.get(i).setCity(scanner.next());
					break;
				case 5:
					System.out.println("Enter new state");
					personList.get(i).setState(scanner.next());
					break;
				case 6:
					System.out.println("Enter new zip");
					personList.get(i).setPincode(scanner.nextInt());
					break;
				case 7:
					System.out.println("Enter new phone number");
					personList.get(i).setMobileNo(scanner.nextLong());
					break;
				default:
					System.out.println("Invalid Entry");

				}
			}
		}

	}
	
	public void delete(String name) {
		for (int i = 0; i < personList.size(); i++) {
			if (personList.get(i).getFirstName().equals(name)) {
				Person person = personList.get(i);
				personList.remove(person);
			}
		}
	}
	
	public void addMultiplePerson() {
		System.out.println("Enter a person Name:");
		String firstName = scanner.nextLine();
		for (int i = 0; i < personList.size(); i++) {
			Person person = personList.get(i);
		}
	}

	public void display() {
		for (int i = 0; i < personList.size(); i++) {
			Person person = personList.get(i);
			System.out.println("FirstName:" + person.getFirstName() + "\n" + "LastName:" + person.getLastName() + "\n"
					+ "Adress:" + person.getAddress() + "\n" + "City:" + person.getCity() + "\n" + "State:"
					+ person.getCity() +"\n" + "Phone-Number:" + person.getMobileNo() + "\n" + "Pin-code:"
					+ person.getPincode());
		}
	}
}
