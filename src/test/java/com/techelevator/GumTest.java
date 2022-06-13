package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class GumTest {

    @Test
    public void test_getDispense_message_gum(){
        Gum littleLeagueChew = new Gum("Little League Chew", new BigDecimal("0.95"), "D2");

        Assert.assertEquals("Chewy Chewy, Yum!", littleLeagueChew.getDispenseMsg());

    }

}
