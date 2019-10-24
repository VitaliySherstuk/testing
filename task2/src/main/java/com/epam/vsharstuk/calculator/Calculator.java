package com.epam.vsharstuk.calculator;

public interface Calculator {

    double addition(double firstNumber, double secondNumber);
    double subtraction(double firstNumber, double secondNumber);
    double multiplication(double firstNumber, double secondNumber);
    double division(double firstNumber, double secondNumber);
    double root(double firstNumber);
    double power(double firstNumber, int secondNumber);
}
