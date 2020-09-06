package org.codejudge.sb.services;

import org.codejudge.sb.model.Addition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppService {
    private int number1;
    private int number2;
    private int sum;

    @Autowired
    Addition add;


    public Addition findSum(int num1, int num2){
        this.number1=num1;
        this.number2=num2;
        this.sum = num1 + num2;
        add.setSum(sum);
        return add;
    }
}
