package com.epam.vsharstuk.calculator.impl;

import com.epam.vsharstuk.calculator.Calculator;

public class CalculatorImpl implements Calculator {

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

    public double power(double firstNumber, int secondNumber) {
        if(firstNumber == 0 && secondNumber == 0) {
            throw new IllegalArgumentException("We cannot pow 0 to 0.");
        }
        double result = Math.pow(firstNumber, secondNumber);
        if(result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
            throw new IllegalArgumentException("Threshold was exceeded");
        }
        return result;
    }

    public boolean isPrime(int number) {
        if (number < 2) { return false;}
        if (number == 2) {return true;}
        if (number % 2 == 0) {return false;}
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public Integer[] fibonacci(int limit) {
        String separator = ",";
        Integer[] fibonacci = new Integer[limit];
        if (limit == 0) {
            return new Integer[]{0};
        } else if (limit == 1) {
            return new Integer[]{0,1};
        } else {
            int first = 0;
            int second = 1;
            fibonacci[0] = first;
            fibonacci[1] = second;
            for(int i=2; i<limit; i++) {
                int next = first + second;
                fibonacci[i] = next;
                first = second;
                second = next;
            }
            return fibonacci;
        }
    }

}