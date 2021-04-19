package com.flloki.patterns.structural.adapter.example1;

public class MPHToKPHAdapter implements MetrickMovable{

    private final Movable movable;

    public MPHToKPHAdapter(Movable movable) {
        this.movable = movable;
    }

    @Override
    public double getSpeedInKPH() {
        return movable.getSpeedInMPH() * 1.6;
    }
}
