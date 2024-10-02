package com.tdd.stringcalculator;

public class StringCalculator {
   
    public static int add(String number) {
        if (number.isEmpty()) return 0;
        return Integer.parseInt(number);
    }

    public static void main(String[] args) {
        
    }
}
