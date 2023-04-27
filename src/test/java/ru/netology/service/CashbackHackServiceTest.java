package ru.netology.service;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void IfAmountCorrect() {
        int amount = 5700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(actual, expected);
    }

    @Test
    public void IfAmountZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void IfAmount1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void IfAmountIncorrect() {
        int amount = -5000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}