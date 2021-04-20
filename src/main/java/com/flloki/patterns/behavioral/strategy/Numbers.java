package com.flloki.patterns.behavioral.strategy;

public class Numbers {

    private int x;
    private int y;

    public Numbers(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int calculate(MathOperationStrategy mathOperationStrategy){
        return mathOperationStrategy.execute(x, y);
    }
}
