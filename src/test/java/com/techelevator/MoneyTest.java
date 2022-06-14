package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class MoneyTest {

    @Test

    public void test_return_Change_In_Coins_1() {


        Money returnChangeInCoins = new Money();

        Assert.assertEquals("Your change in quarters: " + 22 + " dimes: " + 0 + " nickels: " + 1, returnChangeInCoins.returnChangeInCoins(BigDecimal.valueOf(5.55)));
    }
    @Test

    public void test_return_Change_In_Coins_2() {
        Money returnChangeInCoins = new Money();
        Assert.assertEquals("Your change in quarters: " + 8 + " dimes: " + 2 + " nickels: " + 0, returnChangeInCoins.returnChangeInCoins(BigDecimal.valueOf(2.20)));
    }
    @Test

    public void test_return_Change_In_Coins_3() {
        Money returnChangeInCoins = new Money();
        Assert.assertEquals("Your change in quarters: " + 31 + " dimes: " + 1 + " nickels: " + 1, returnChangeInCoins.returnChangeInCoins(new BigDecimal(7.90)));



    }

//
//
//            //return "Your change in quarters: " + quarter + " dimes " + dimes + " nickels " + nickels;
//        }
//    }

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