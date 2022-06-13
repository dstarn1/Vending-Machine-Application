package com.techelevator;

import java.io.*;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		mainMenu();
	}

	public static void mainMenu() {
		Scanner scanner = new Scanner(System.in);
		VendingMachine machine = new VendingMachine();
		String userInput;
		BigDecimal moneyProvided = new BigDecimal(0.00);


		try{
			String salesLogDestination = "C:/Users/Student/Documents/SalesLog.txt";//K added 6/12
			File salesLog = new File(salesLogDestination) ;//K added 6/12
			PrintWriter fileWriter = new PrintWriter(salesLog);//
			//K added 6/12

			SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aa");//k added 6/12
			String dateTimeStamp = dateFormat.format(new Date()).toString();//k added 6/12




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



					if (selection.equals("1")) {
						do {
							System.out.println("How much money do you want to insert?");
							System.out.println("(1) $1.00\n(2) $5.00\n(3) $10.00\n(4) $20.00\n(5) Stop adding money");
							selection = scanner.nextLine();
							if (selection.equals("1")) {        // TODO fix addition to moneyProvided (in writer as well)
								moneyProvided = moneyProvided.add(new BigDecimal("1.00"));
								fileWriter.println(dateTimeStamp + " FEED MONEY" +" $" + new BigDecimal("1.00") + " $" + moneyProvided); //K added on 6/12
							} else if (selection.equals("2")) {
								moneyProvided = moneyProvided.add(new BigDecimal("5.00"));
								fileWriter.println(dateTimeStamp + " FEED MONEY" +" $" + new BigDecimal("5.00")+ " $"+  moneyProvided); //K added on 6/12
							} else if (selection.equals("3")) {
								moneyProvided = moneyProvided.add(new BigDecimal("10.00"));
								fileWriter.println(dateTimeStamp + " FEED MONEY" +" $" + new BigDecimal("10.00")+ " $" + moneyProvided); //K added on 6/12
							} else if (selection.equals("4")) {
								moneyProvided = moneyProvided.add(new BigDecimal("20.00"));
								fileWriter.println(dateTimeStamp + " FEED MONEY" +" $" + new BigDecimal("20.00") + " $" + moneyProvided); //K added on 6/12
							} else if (!selection.equals("5")) {
								System.out.println("Invalid input");
							}
							System.out.println("Current Money Provided: $" + moneyProvided);
							System.out.println();

						} while (!selection.equals("5"));
					}
					if (selection.equals("2")) {
						do {
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
								BigDecimal price = userProductChoice.getPrice();
								BigDecimal change;
								// outputs 1 if moneyProvided is greater - change is due, 0 if equal, -1 if less than
								if (moneyProvided.compareTo(price) > 0) {
									change = moneyProvided.subtract(price);
									System.out.println("Item name: " + userProductChoice.getProductName() + " Cost of item $" + price + " Money remaining $" + change);
									fileWriter.println(dateTimeStamp + " " +userProductChoice.getProductName() + " "+ userProductChoice.getSlotLocation() + " $" + userProductChoice.getPrice() + " $" + (moneyProvided.subtract(userProductChoice.getPrice()))); // k added 6/12

									userProductChoice.getPrice();
									userProductChoice.setProductQuantity(userProductChoice.getProductQuantity() - 1);
									System.out.println("Dispensing ");
									System.out.println(userProductChoice.getDispenseMsg());
									System.out.println();
									System.out.println("(1) Make another selection\n(2) Finish Transaction");
									selection = scanner.nextLine();
									if(selection.equals("2")){
										System.out.println("Dispensing change: $" + change);
										Money returnChangeInCoins = new Money();
										fileWriter.println(dateTimeStamp + " GIVE CHANGE: " + "$"+ change + " $0.00"); // k added 6/12
										System.out.println();// k added 6/12
										fileWriter.flush();// k added 6/12
										fileWriter.close();// k added 6/12
										returnChangeInCoins.returnChangeInCoins(change);
										change = new BigDecimal(0.00);
										moneyProvided = new BigDecimal(0.00);



										break;
									}

									System.out.println();
									// name, cost, money remaining and product message
								} else if (moneyProvided.compareTo(price) <= 0) {
									System.out.println("Insufficient money provided");
									//return to second menu
								} break; //ko added
							} break; //ko added to try to fix stuck after dispense


						} while (!selection.equals("3"));


					}

//					System.out.println();// k added 6/12
//					fileWriter.flush();// k added 6/12
//					fileWriter.close();// k added 6/12



				}



			}while (!userInput.equals("3")) ;
		} catch (FileNotFoundException e) {
			System.out.println("Error - maintenance required");
		}
	}}


//TODO gets stuck and does not continue after dispending change when purchasing one item!
// TODO does not dispense change if more than two items are purchased
