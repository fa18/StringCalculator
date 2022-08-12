package com.exalt.company;


import org.apache.commons.lang3.StringUtils;

import static java.lang.Integer.sum;

public class StringCalculatorKata {

    public int add(String numbers) {
        int sum = 0;
        if(StringUtils.isEmpty(numbers)){
            return sum;
        }

        String[] operations = numbers.split("[^0-9]");

        for(int i = 0 ;i<operations.length;i++){
            sum = sum(sum,Integer.parseInt(operations[i]));
        }
        return sum;

        //throw new UnsupportedOperationException("Please, complete this method with your implementation");
    }
}
