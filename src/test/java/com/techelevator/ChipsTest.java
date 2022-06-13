package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ChipsTest {

    @Test
    public void test_getDispense_message_chips() {
        Chips grainWaves = new Chips("Grain Waves", new BigDecimal("2.75"), "A3");

        Assert.assertEquals("Crunch Crunch, Yum!", grainWaves.getDispenseMsg());
    }
}
