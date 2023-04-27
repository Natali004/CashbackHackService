package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void IfAmountCorrect() {
        int amount = 5700;
        int actual = service.remain(amount);
        int expected = 300;
        assertEquals(expected, actual);
    }

    @Test
    public void IfAmountZero() {
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void IfAmount1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void IfAmountIncorrect() {
        int amount = -5000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}