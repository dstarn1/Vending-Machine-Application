package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class MoneyTest {

    @Test

    public void test_return_Change_In_Coins(BigDecimal changeDue) {

        Assert.assertEquals("Your change in quarters: " + 31 + " dimes " + 1 + " nickels ", returnChangeInCoins(new BigDecimal(7.90)));

    }

    public static String returnChangeInCoins() {
        Money money = new Money();
        int quarter = 0;
        int nickels = 0;
        int dimes = 0;
        BigDecimal changeDue = new BigDecimal(7.90);

        while (changeDue.compareTo(BigDecimal.valueOf(0.00)) != -1) {

            if (changeDue.compareTo(BigDecimal.valueOf(0.25)) >= 0) {
                changeDue = changeDue.subtract(BigDecimal.valueOf(0.25));
                quarter++;
            } else if (changeDue.compareTo(BigDecimal.valueOf(0.10)) >= 0) {
                changeDue = changeDue.subtract(BigDecimal.valueOf(0.10));
                dimes++;
            } else { //(changeDue.compareTo(new BigDecimal(0.05)) >= 0)
                changeDue = changeDue.subtract(BigDecimal.valueOf(0.05));
                nickels++;
            }
        }
        String response = "Your change in quarters: " + quarter + " dimes " + dimes + " nickels " + nickels;
    return response;
    }

}


//public BigDecimal returnChangeInCoins(){
//
//        Money money = new Money();
//        int quarter =0;
//        int nickels=0;
//        int dimes=0;
//        BigDecimal changeDue= new BigDecimal(7.90);
//
//        while (changeDue.compareTo(BigDecimal.valueOf(0.00))!=-1) {
//
//
//        if (changeDue.compareTo(BigDecimal.valueOf(0.25)) >= 0) {
//        changeDue = changeDue.subtract(BigDecimal.valueOf(0.25));
//        quarter++;
//        } else if (changeDue.compareTo(BigDecimal.valueOf(0.10)) >= 0) {
//        changeDue = changeDue.subtract(BigDecimal.valueOf(0.10));
//        dimes++;
//        } else { //(changeDue.compareTo(new BigDecimal(0.05)) >= 0)
//        changeDue = changeDue.subtract(BigDecimal.valueOf(0.05));
//        nickels++;
//        }
//
//        String response = "Your change in quarters: " + quarter + " dimes " + dimes + " nickels " + nickels;