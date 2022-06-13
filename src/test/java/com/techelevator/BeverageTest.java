package com.techelevator;


import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class BeverageTest {

    @Test
    public void test_getDispense_message_beverage(){
        Beverage beverage = new Beverage("Cola", new BigDecimal(1.25),"C1");

        Assert.assertEquals("Slurp Slurp, Yum!", beverage.getDispenseMsg());

    }




}
