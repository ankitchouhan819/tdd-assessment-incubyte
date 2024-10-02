package com.tdd.stringcalculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCalculator {
   
    public static int add(String number) {
        if (number.isEmpty()) return 0;
        
        String delimiter = ",";
        if (number.contains(delimiter)) {
            List<Integer> numList = Arrays.stream(number.split(delimiter+"|\n"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
            
            return sum(numList);
        } 
        return Integer.parseInt(number);
    }

    private static int sum(List<Integer> numbers) {
        StringBuilder negativeNumbers = new StringBuilder();

        int total = numbers.stream()
                .peek(num -> {
                    if (num < 0) {
                        if (negativeNumbers.length() > 0) {
                            negativeNumbers.append(", ");
                        }
                        negativeNumbers.append(num);
                    }
                })
                .filter(num -> num < 1000)
                .mapToInt(Integer::intValue) 
                .sum();

        if (negativeNumbers.length() > 0) {
            throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbers);
        }

        return total;
    }

    public static void main(String[] args) {
        
    }
}
