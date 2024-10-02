package com.tdd.stringcalculator;

public class StringCalculator {
   
    public static int add(String number) {
        if (number.isEmpty()) return 0;
        
        if (number.contains(",")) {
            String[] numbers = number.split(",");
            return toInt(numbers[0]) + toInt(numbers[1]);
        } 
        return toInt(number);
    }

    public static int toInt(String number) {
        return Integer.parseInt(number);
    }
    public static void main(String[] args) {
        
    }
}
