package com.techelevator;

import java.math.BigDecimal;

public class Gum extends Product {

    private String dispenseMsg = "Chewy Chewy, Yum!";


    public Gum(String productName, BigDecimal price, String slotLocation) {
        super(productName, price, slotLocation);

    }

    public String getDispenseMsg () {
        return dispenseMsg;
    }
}