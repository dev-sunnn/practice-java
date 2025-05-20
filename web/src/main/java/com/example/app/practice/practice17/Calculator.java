package com.example.app.practice.Practice17;

public class Calculator {
    private double result;

    public void add(double num1, double num2) {
        result = num1 + num2;
    }

    public void subtract(double num1, double num2) {
        result = num1 - num2;
    }

    public double getResult() {
        return this.result;
    }
}
