package com.thecollinsbyte.principles.SOLID.openclosed;

public class SubtractOperation implements Operation {

    @Override
    public double calculate(double num1, double num2) {
        return num1 - num2;
    }
}
