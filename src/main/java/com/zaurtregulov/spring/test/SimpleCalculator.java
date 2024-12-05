package com.zaurtregulov.spring.test;

public class SimpleCalculator {

    public double sumTwoNumbers(double a, double b) {
        return a + b;
    }

    public double minusOneNumberFromAnother(double a, double b) {
        return a - b;
    }

    public double divideOneNumberByAnother(double a, double b) {
        if (b == 0)
            throw new NumberFormatException();
        else
            return a / b;
    }

    public double multiplyTwoNumbers(double a, double b) {
        return a * b;
    }
}
