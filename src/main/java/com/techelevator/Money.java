package com.techelevator;



import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

import static com.techelevator.Program.mainMenu;

public class Money {

    private BigDecimal changeDue;
    private int quarter = 0;
    private int dimes = 0;
    private int nickels =0;

    public String returnChangeInCoins(BigDecimal changeDue){

        while (changeDue.compareTo(new BigDecimal("0.00").setScale(2, RoundingMode.HALF_UP))!=-1 && changeDue.compareTo(new BigDecimal("0.00").setScale(2, RoundingMode.HALF_UP))!=0 ) {

            if (changeDue.compareTo(new BigDecimal("0.25").setScale(2, RoundingMode.HALF_UP)) >= 0) {
                changeDue = changeDue.subtract(new BigDecimal(0.25).setScale(2, RoundingMode.HALF_UP));
                quarter++;
            } else if (changeDue.compareTo(new BigDecimal("0.10").setScale(2, RoundingMode.HALF_UP)) >= 0) {
                changeDue = changeDue.subtract(new BigDecimal("0.10").setScale(2, RoundingMode.HALF_UP));
                dimes++;
            }

        else { //(changeDue.compareTo(new BigDecimal(0.05)) >= 0)
                changeDue = changeDue.subtract(new BigDecimal("0.05").setScale(2, RoundingMode.HALF_UP));
                nickels++;
            }
        }
        String changeInCoins ="Your change in quarters: " + quarter + " dimes: " + dimes + " nickels: " + nickels;
       return changeInCoins;
       /// just changed the method to return a string, and put system.out.println in main program
   }


//   public void purchaseMenu(BigDecimal moneyProvided, String dateTimeStamp, String salesLog) throws IOException {
//       Scanner selection = new Scanner(System.in);
//       Scanner scanner = new Scanner(System.in);
//       VendingMachine machine = new VendingMachine();
//       FileWriter fileWriter = new FileWriter(salesLog);
//       if (selection.equals("2")) {
//           do {
//               System.out.println("Please enter your selection eg. 'A3'");
//               String userSelection = scanner.nextLine().toUpperCase();
//
//
//               Product userProductChoice = machine.getSlotProducts().get(userSelection); //getting value from slot products
//
//
//               try{
//                   if (userProductChoice.getProductQuantity() == 0) {
//                       System.out.println("Sorry, this item is sold out.");
//                       //mainMenu();
//                   } else if (!machine.getSlotProducts().containsKey(userSelection)) {
//                       System.out.println("Invalid selection. Have fun going back to main menu.");
//                       mainMenu();
//                   } else {
//                       System.out.println();
//                       //get price
//                       BigDecimal price = userProductChoice.getPrice();
//                       BigDecimal change;
//                       // outputs 1 if moneyProvided is greater - change is due, 0 if equal, -1 if less than
//                       if (moneyProvided.compareTo(price) > 0) {
//                           change = moneyProvided.subtract(price);
//                           System.out.println("Item name: " + userProductChoice.getProductName() + " Cost of item $" + price + " Money remaining $" + change);
//                           fileWriter.println(dateTimeStamp + " " +userProductChoice.getProductName() + " "+ userProductChoice.getSlotLocation() + " $" + userProductChoice.getPrice() + " $" + (moneyProvided.subtract(userProductChoice.getPrice()))); // k added 6/12
//
//                           userProductChoice.getPrice();
//                           userProductChoice.setProductQuantity(userProductChoice.getProductQuantity() - 1);
//                           System.out.println("Dispensing ");
//                           System.out.println(userProductChoice.getDispenseMsg());
//                           System.out.println();
//                           System.out.println("(1) Make another selection\n(2) Finish Transaction");
//                           selection = scanner.nextLine();
//                           if(selection.equals("1")){
//                               break;
//                           }
//                           if(selection.equals("2")){
//                               System.out.println("Dispensing change: $" + change);
//                               Money returnChangeInCoins = new Money();
//                               fileWriter.println(dateTimeStamp + " GIVE CHANGE: " + "$"+ change + " $0.00"); // k added 6/12
//                               System.out.println();// k added 6/12
//                               fileWriter.flush();// k added 6/12
//                               fileWriter.close();// k added 6/12
//
//                               System.out.println(returnChangeInCoins.returnChangeInCoins(change));
//                               change = new BigDecimal(0.00);
//                               moneyProvided = new BigDecimal(0.00);
//                               System.out.println();
//                               mainMenu();
//
//
//
//                           }
//
//                           System.out.println();
//
//                       } else if (moneyProvided.compareTo(price) <= 0) {
//                           System.out.println("Insufficient money provided");
//                           mainMenu();
//
//                       }
//                   }
//               }catch (NullPointerException e){
//                   System.out.println("Invalid Selection");
//               }
   //}

}



