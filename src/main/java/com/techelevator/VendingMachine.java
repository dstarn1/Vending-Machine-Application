package com.techelevator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class VendingMachine {

    private final int SLOTCAPACITY = 5;
    //private Map<String, Product> slotProducts = new HashMap<>();

//    public VendingMachine (Map<String, Product> slotProducts) {
//        this.slotProducts = slotProducts;
//    }

    Chips potatoCrisps = new Chips("Potato Crisps", new BigDecimal("3.05"), "A1");
    Chips stackers = new Chips("Stackers", new BigDecimal("1.45"), "A2");
    Chips grainWaves = new Chips("Grain Waves", new BigDecimal("2.75"), "A3");
    Chips cloudPopcorn = new Chips("Cloud Popcorn", new BigDecimal("3.65"), "A4");

    Candy moonpie = new Candy("Moonpie", new BigDecimal("1.80"), "B1");
    Candy cowtales = new Candy("Cowtales", new BigDecimal("1.50"), "B2");
    Candy wonkaBar= new Candy("Wonka Bar", new BigDecimal("1.50"), "B3");
    Candy crunchie = new Candy("Crunchie", new BigDecimal("1.75"), "B4");

    Beverage cola = new Beverage("Cola", new BigDecimal("1.25"), "C1");
    Beverage drsalt = new Beverage("Dr. Salt", new BigDecimal("1.50"), "C2");
    Beverage mountainmelter = new Beverage("Mountain Melter", new BigDecimal("1.50"), "C3");
    Beverage heavy = new Beverage("Heavy", new BigDecimal("1.50"), "C4");

    Gum uchews = new Gum("U-Chews", new BigDecimal("0.85"), "D1");
    Gum littleLeagueChew = new Gum("Little League Chew", new BigDecimal("0.95"), "D2");
    Gum chiclets = new Gum("Chiclets", new BigDecimal("0.75"), "D3");
    Gum triplemint= new Gum("Triplemint", new BigDecimal("0.75"), "D4");

    Map<String, Product> slotProducts = new HashMap<>();

    slotProducts.put();
    slotProducts.

}
