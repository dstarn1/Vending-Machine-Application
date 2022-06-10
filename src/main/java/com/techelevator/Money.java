package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class Money {
    private BigDecimal amountOwed;
    private BigDecimal amountPaid;
    private BigDecimal changeDue;


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
    public void transaction(){
        Scanner transaction = new Scanner(System.in);

        System.out.println("(1) Feed Money\n(2) Select Product\n(3) Finish Transaction");
        String selection = transaction.nextLine();
        if("1"){

        }
    }
}
