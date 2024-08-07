package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void ShouldBuy999IfSpendIs1001() {
        //pre[are data
        CashbackHackService service = new CashbackHackService();
        int spend = 1001;

        //action
        int actual = service.remain(spend);
        int expected = 999;

        //check results

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ShouldBuy998IfSpendIs1002() {
        //pre[are data
        CashbackHackService service = new CashbackHackService();
        int spend = 1002;

        //action
        int actual = service.remain(spend);
        int expected = 998;

        //check results
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ShouldBuy1IfSpendIs999() {
        //pre[are data
        CashbackHackService service = new CashbackHackService();
        int spend = 999;

        //action
        int actual = service.remain(spend);
        int expected = 1;

        //check results
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ShouldBuy2IfSpendIs998() {
        //pre[are data
        CashbackHackService service = new CashbackHackService();
        int spend = 998;

        //action
        int actual = service.remain(spend);
        int expected = 2;

        //check results
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void ShouldBuy100IfSpendIs900() {
        //pre[are data
        CashbackHackService service = new CashbackHackService();
        int spend = 900;

        //action
        int actual = service.remain(spend);
        int expected = 100;

        //check results
        Assert.assertEquals(actual, expected);
    }

    @Test

    public void ShouldBuy1000IfSpendIs0() {
        //pre[are data
        CashbackHackService service = new CashbackHackService();
        int spend = 0;

        //action
        int actual = service.remain(spend);
        int expected = 1000;

        //check results
        Assert.assertEquals(actual, expected);
    }

    @Test
    //тест падает, сервис выдает неверный результат
    public void ShouldBuy0IfSpendIs1000() {
        //pre[are data
        CashbackHackService service = new CashbackHackService();
        int spend = 1000;

        //action
        int actual = service.remain(spend);
        int expected = 0;

        //check results
        Assert.assertEquals(actual, expected);
    }

    @Test
    // тест падает, сервис выдает неверный результат
    public void ShouldBuy0IfSpendIs2000() {
        //pre[are data
        CashbackHackService service = new CashbackHackService();
        int spend = 2000;

        //action
        int actual = service.remain(spend);
        int expected = 0;

        //check results
        Assert.assertEquals(actual, expected);
    }

}