package com.techelevator;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;
import java.util.Scanner;

import static com.techelevator.Program.mainMenu;

public class Money {
    private BigDecimal amountOwed;
    private BigDecimal amountPaid;
    private BigDecimal changeDue;
    private int quarter = 0;
    private int dimes = 0;
    private int nickels =0;


//    public Money(VendingMachine machine) {
//            this.machine = machine;
//    }

    public BigDecimal getAmountOwed() {
        return amountOwed;
    }

    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    public void setAmountOwed(BigDecimal amountOwed) {
        this.amountOwed = amountOwed;
    }

    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }
    public BigDecimal getChangeDue() {
        changeDue= amountPaid.subtract(amountOwed);
        return changeDue;
    }
    public void returnChangeInCoins(BigDecimal changeDue){

        while(changeDue.compareTo(BigDecimal.valueOf(0.25)) >= 0) {
        changeDue.subtract( BigDecimal.valueOf(0.25));
        quarter++;
        }

        while(changeDue.compareTo(BigDecimal.valueOf(0.10)) >= 0){
            changeDue.subtract( BigDecimal.valueOf(0.10));
         dimes++;
        }

        while(changeDue.compareTo(BigDecimal.valueOf(0.05)) >= 0) {
            changeDue.subtract( BigDecimal.valueOf(0.05));
        nickels++;}
        System.out.println("Your change in quarters: " + quarter + " dimes " + dimes + " nickels " + nickels);
   }

//    public void purchaseMenu() {
//        Money money = new Money(machine);
//
//        Scanner purchaseMenu = new Scanner(System.in);
//        // VendingMachine machine;
//        System.out.println("(1) Feed Money\n(2) Select Product\n(3) Finish Transaction");
//        String selection = purchaseMenu.nextLine();
//
//
//        System.out.println("Please enter your selection eg. 'A3'");
//        String userSelection = purchaseMenu.nextLine().toUpperCase();
//
//        //TODO have to hit enter twice. need to fix
//        Product userProductChoice = machine.getSlotProducts().get(userSelection); //getting value from slot products
//
//        //for (String slotProduct: machine.getSlotProducts().keySet()){
//
//        if (userProductChoice.getProductQuantity() == 0) {
//            System.out.println("Sorry, this item is sold out.");
//            mainMenu();
//        } else if (!machine.getSlotProducts().containsKey(userSelection)) {
//            System.out.println("Invalid selection. Have fun going back to main menu.");
//            mainMenu();
//        } else {
//            userProductChoice.setProductQuantity(userProductChoice.getProductQuantity() - 1);
//        }
//    }
}

