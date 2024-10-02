package com.tdd.stringcalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void testEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public void testSingleNumberString() {
        assertEquals(3, StringCalculator.add("3"));
    }

    @Test
    public void testAddTwoNumbers() {
        assertEquals(5, StringCalculator.add("2,3"));
    }

    @Test
    public void testAdditionofMultipleNumberWithComma() {
        assertEquals(12, StringCalculator.add("2,1,4,5"));
    }    
}
