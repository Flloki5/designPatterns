package com.flloki.patterns.behavioral.strategy;

public class Addition implements MathOperationStrategy{

    @Override
    public int execute(int x, int y) {
        return x + y;
    }
}
