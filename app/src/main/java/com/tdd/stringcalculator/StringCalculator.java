package com.tdd.stringcalculator;

import java.util.Arrays;

public class StringCalculator {
   
    public static int add(String number) {
        if (number.isEmpty()) return 0;
        
        String delimiter = ",";
        if (number.contains(delimiter)) {
            return Arrays.stream(number.split(delimiter+"|\n"))
                .mapToInt(Integer::parseInt)
                .sum();
        } 
        return toInt(number);
    }

    public static int toInt(String number) {
        return Integer.parseInt(number);
    }

    public static void main(String[] args) {
        
    }
}
