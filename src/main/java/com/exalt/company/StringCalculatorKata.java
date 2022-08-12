package com.exalt.company;


import org.apache.commons.lang3.StringUtils;

import static java.lang.Integer.sum;

public class StringCalculatorKata {

    public int add(String numbers) {
        if(StringUtils.isEmpty(numbers)){
            return 0;
        }

        String[] operations = numbers.split(";");
        return sum(Integer.parseInt(operations[0]),Integer.parseInt(operations[1]));

        //throw new UnsupportedOperationException("Please, complete this method with your implementation");
    }
}
