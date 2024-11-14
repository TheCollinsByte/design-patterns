package com.thecollinsbyte.principles.SOLID.openclosed;

public class Division implements Operation {
    @Override
    public double calculate(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return num1 / num2;
    }
}
