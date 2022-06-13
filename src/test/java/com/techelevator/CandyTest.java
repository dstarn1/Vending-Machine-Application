package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CandyTest {

    @Test
    public void test_getDispense_message_candy(){
        Candy moonpie = new Candy("Moonpie", new BigDecimal("1.80"), "B1");

        Assert.assertEquals("Munch Munch, Yum!", moonpie.getDispenseMsg());

    }
}
