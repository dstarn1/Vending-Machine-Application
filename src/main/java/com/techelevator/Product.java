package com.techelevator;

import java.math.BigDecimal;

public class Product {

    // Properties
    private String productName;
    private BigDecimal price;
    private String slotLocation;
    private int productQuantity = 5;


    //Constructor
    public Product(String productName, BigDecimal price, String slotLocation) {
        this.productName = productName;
        this.price = price;
        this.slotLocation = slotLocation;
    }

    // Getters/Setters
    public String getProductName() {
        return productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getSlotLocation() {
        return slotLocation;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
}
