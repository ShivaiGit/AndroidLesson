package ru.osmanov.mycalculator.model;

public class CalculatorResult implements Calculator {
    @Override
    public double operation(double num1, double num2, Operator operator) {
        switch (operator) {
            case SUM:
                return num1 + num2;

            case MIN:
                return num1 - num2;

            case MULTI:
                return num1 * num2;

            case DEV:
                return num1 / num2;
        }
        return 0.0;
    }
}
