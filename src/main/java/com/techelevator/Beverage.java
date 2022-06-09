package com.techelevator;

import java.math.BigDecimal;

public class Beverage extends Product {

    private String dispenseMsg = "Slurp Slurp, Yum!";

    public Beverage(String productName, BigDecimal price, String slotLocation) {
        super(productName, price, slotLocation);

    }
    public String getDispenseMsg(){
        return dispenseMsg;
    }
}
