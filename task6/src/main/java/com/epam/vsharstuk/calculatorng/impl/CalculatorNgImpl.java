package com.epam.vsharstuk.calculatorng.impl;

import com.epam.vsharstuk.calculatorng.CalculatorNg;

public class CalculatorNgImpl implements CalculatorNg {

    public double addition(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        if(result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
            throw new IllegalArgumentException("Threshold was exceeded");
        }
        return result;
    }

    public double subtraction(double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        if(result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
            throw new IllegalArgumentException("Threshold was exceeded");
        }
        return result;
    }

    public double multiplication(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        if(result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
            throw new IllegalArgumentException("Threshold was exceeded");
        }
        return result;
    }

    public double division(double firstNumber, double secondNumber) {
        if(secondNumber == 0) {
            throw new IllegalArgumentException("Division on 0 - forbidden");
        }
        double result = firstNumber / secondNumber;
        if(result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
            throw new IllegalArgumentException("Threshold was exceeded");
        }
        return result;
    }

    public double root(double firstNumber) {
        if(firstNumber < 0) {
            throw new IllegalArgumentException("Number cannot be negative.");
        }
        double result = Math.sqrt(firstNumber);
        if(result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
            throw new IllegalArgumentException("Threshold was exceeded");
        }
        return result;
    }

}