package com.epam.vsharstuk.testing.impl;

import com.epam.vsharstuk.testing.Calculator;

public class CalculatorImpl implements Calculator {

    public Double addition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public Double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public Double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public Double division(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public Double root(double number) {
        return Math.sqrt(number);
    }

    public Double power(double firstNumber, int powerValue) {
        return Math.pow(firstNumber, powerValue);
    }
}
