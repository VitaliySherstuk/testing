package com.epam.vsharstuk.testing;

public interface Calculator {

    Double addition(double firstNumber, double secondNumber);
    Double subtraction(double firstNumber, double secondNumber);
    Double multiplication(double firstNumber, double secondNumber);
    Double division(double firstNumber, double secondNumber);
    Double root(double number);
    Double power(double firstNumber, int powerValue);
}
