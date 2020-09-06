package org.codejudge.sb.model;

import org.springframework.stereotype.Component;

@Component
public class Addition {
    private int sum;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
