package ru.osmanov.mycalculator;

public class Calculator {

    private final double value1, value2;
    private final String operator;

    public Calculator(double value1, double value2, String operator) {
        this.value1 = value1;
        this.value2 = value2;
        this.operator = operator;
    }

    public double calc (double num1, double num2, String sym) {

        num1 = this.value1;
        num2 = this.value2;
        sym = this.operator;
        double result = 0;

        switch (sym) {
            case ("+"):
                result = num1 + num2;
                break;

            case ("-"):
                result = num1 - num2;
                break;

            case ("*"):
                result = num1 * num2;
                break;

            case ("/"):
                result = num1 / num2;
                break;
        }
        return result;
    }

}
