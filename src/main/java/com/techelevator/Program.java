package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {


		mainMenu();
	}

	public static void mainMenu() {
		System.out.println("(1) Display Vending Machine Items\n(2) Purchase\n(3) Exit");
		Scanner scanner = new Scanner(System.in);
		VendingMachine machine = new VendingMachine();
		String userInput = scanner.nextLine();

		if (userInput.equals("1")) {
			String filePath = "C:/Users/Student/workspace/java-mini-capstone-module-1-team-2/vendingmachine.csv";
			File inventory = new File(filePath);
			try (Scanner scan = new Scanner(inventory)) {
				while (scan.hasNextLine()) {
					String scanLine = scan.nextLine() + ", ";
					int quantity = machine.getSlotProducts().get(scanLine.substring(0, 2)).getProductQuantity();
					System.out.println(scanLine + "Quantity: " + quantity);
				}

			} catch (FileNotFoundException e) {
				System.out.println("File not found.");
			}
			// create new method for purchase & feed money
			System.out.println("Please enter your selection eg. 'A3'");
			String userSelection = scanner.nextLine().toUpperCase();

			//TODO have to hit enter twice. need to fix
			Product userProductChoice = machine.getSlotProducts().get(userSelection); //getting value from slot products

			//for (String slotProduct: machine.getSlotProducts().keySet()){

			if (userProductChoice.getProductQuantity() == 0) {
				System.out.println("Sorry, this item is sold out.");
				mainMenu();
			}
				else if(!machine.getSlotProducts().containsKey(userSelection)) {
				System.out.println("Invalid selection. Have fun going back to main menu.");
				mainMenu();
			}
				else {
					userProductChoice.setProductQuantity(userProductChoice.getProductQuantity()-1);
				}

			}


			}


			}


