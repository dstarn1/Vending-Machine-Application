package com.techelevator;

import java.math.BigDecimal;

public class Candy extends Product {
    private String dispenseMsg = "Munch Munch, Yum!";

    public Candy (String productName, BigDecimal price, String slotLocation) {
        super(productName, price, slotLocation);

    }

    public String getDispenseMsg(){
        return dispenseMsg;
    }
}
