package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("(1) Display Vending Machine Items\n(2) Purchase\n(3) Exit");
		String userInput = scanner.nextLine();
		if (userInput.equals("1")){
			String filePath = "C:/Users/Student/workspace/java-mini-capstone-module-1-team-2/vendingmachine.csv";
			File inventory = new File(filePath);
			try (Scanner scan = new Scanner(inventory)){
				while (scan.hasNextLine()) {
					String nextline = scan.nextLine();
					System.out.println(nextline);
				}
			}catch (FileNotFoundException e){
				System.out.println("File not found.");
			}
			System.out.println("Please enter your selection eg. 'A3'");
			String userSelection = scanner.nextLine().toUpperCase();

			VendingMachine machine = new VendingMachine();

			 Product userProductChoice = machine.getSlotProducts().get(userSelection); //getting value from slot products


			if (userProductChoice.getProductQuantity()==0){
				System.out.println("Sorry, this item is sold out.");
				/////////////////// method for return to main method





			}


















		}



	}
}
