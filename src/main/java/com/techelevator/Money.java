package com.techelevator;

import java.math.BigDecimal;

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
}
