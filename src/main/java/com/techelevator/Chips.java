package com.techelevator;

import java.math.BigDecimal;

public class Chips extends Product {
    private String dispenseMsg = "Crunch crunch, Yum!";

    public Chips (String productName, BigDecimal price, String slotLocation) {
        super(productName, price, slotLocation);
    }
    @Override
    public String getDispenseMsg(){
        return dispenseMsg;
    }

}
