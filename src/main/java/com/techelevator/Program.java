package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		mainMenu();
	}

	public static void mainMenu() {
		Scanner scanner = new Scanner(System.in);
		VendingMachine machine = new VendingMachine();
		String userInput;

		// insert loop here
		do {
			System.out.println("(1) Display Vending Machine Items\n(2) Purchase\n(3) Exit");
			userInput = scanner.nextLine();

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
			} else if (userInput.equals("2")) {        // Selecting PURCHASE

				System.out.println("(1) Feed Money\n(2) Select Product\n(3) Finish Transaction");
				String selection = scanner.nextLine();

				BigDecimal moneyProvided = new BigDecimal(0.00);

					if (selection.equals("1")) {
						do {
							System.out.println("How much money do you want to insert?");
							System.out.println("(1) $1.00\n(2) $5.00\n(3) $10.00\n(4) $20.00\n(5) Stop adding money");
							selection = scanner.nextLine();
									if (selection.equals("1")){		// TODO fix addition to moneyProvided
										moneyProvided = moneyProvided.add(new BigDecimal("1.00"));
									}
									else if (selection.equals("2")){
										moneyProvided = moneyProvided.add(new BigDecimal("5.00"));
									}
									else if (selection.equals("3")){
										moneyProvided = moneyProvided.add(new BigDecimal("10.00"));
									}
									else if (selection.equals("4")){
										moneyProvided = moneyProvided.add(new BigDecimal("20.00"));
									}
									else if (!selection.equals("5")){
										System.out.println("Invalid input");
									}
								System.out.println("Current Money Provided: $" + moneyProvided);
								System.out.println();

						} while (!selection.equals("5"));
					}
				if (selection.equals("2")) {
					System.out.println("Please enter your selection eg. 'A3'");
					String userSelection = scanner.nextLine().toUpperCase();

					//TODO have to hit enter twice. need to fix
					Product userProductChoice = machine.getSlotProducts().get(userSelection); //getting value from slot products

					//for (String slotProduct: machine.getSlotProducts().keySet()){

					if (userProductChoice.getProductQuantity() == 0) {
						System.out.println("Sorry, this item is sold out.");
						//mainMenu();
					} else if (!machine.getSlotProducts().containsKey(userSelection)) {
						System.out.println("Invalid selection. Have fun going back to main menu.");
						//mainMenu();
					} else {
						System.out.println();
						//get price
						BigDecimal quantity = machine.getSlotProducts().get(userSelection).getPrice();
						BigDecimal change;
						// outputs 1 if moneyProvided is greater - change is due, 0 if equal, -1 if less than
						if (moneyProvided.compareTo(quantity) > 0) {
							change = moneyProvided.subtract(quantity);
							System.out.println(change);
							// name, cost, money remaining and product message
						}
						}

						userProductChoice.getPrice();
						userProductChoice.setProductQuantity(userProductChoice.getProductQuantity() - 1);
					}
			}

			System.out.println();

		} while (!userInput.equals("3"));

	}
}
