package com.flloki.patterns.behavioral.strategy;

public class Subtraction implements MathOperationStrategy {

    @Override
    public int execute(int x, int y) {
        return x - y;
    }
}
