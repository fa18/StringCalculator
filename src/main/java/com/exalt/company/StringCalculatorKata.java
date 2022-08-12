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

        if(operations.length<2){
            throw new UnsupportedOperationException("lack one parameter");
        }

        for(int i = 0 ;i<operations.length;i++){
            if(!operations[i].matches("[0-9]+")){
                throw new UnsupportedOperationException("negatives not allowed : "+numbers);
            }
            sum = sum(sum,Integer.parseInt(operations[i]));
        }
        return sum;


    }
}
