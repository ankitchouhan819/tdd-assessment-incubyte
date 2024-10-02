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

    @Test
    public void testNewLineDelimiter() {
        assertEquals(13, StringCalculator.add("3\n1,4\n5"));
    }

    @Test
    public void testNegativeNumberWithCommaAndNewLineDelimiter() {
        try {
            StringCalculator.add("-1,-4\n3");
        } catch (IllegalArgumentException exec) {
            assertEquals(exec.getMessage(), "Negatives not allowed: -1, -4");
        }
    }
}
