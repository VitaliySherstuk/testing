package com.epam.vsharstuk.calculator;

import com.epam.vsharstuk.calculator.impl.CalculatorImpl;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalculatorImplPositiveTest {

    private CalculatorImpl calculator;

    @BeforeEach
    public void init() {
        calculator = new CalculatorImpl();
    }

    @ParameterizedTest
    @CsvSource({
            "5.0,5.0",
            "0.0, 10",
            "-1, 11",
            "11, -1"
    })
    public void addition(double firstNumber, double secondNumber) {
        double result = calculator.addition(firstNumber, secondNumber);
        assertTrue(result == 10);
    }

    @ParameterizedTest
    @CsvSource({
            "5.0,5.0,0",
            "0.0, 10,-10",
            "-1, 11,-12",
            "11, -1,12"
    })
    public void subtraction(double firstNumber, double secondNumber, double expectedResult) {
        double result = calculator.subtraction(firstNumber, secondNumber);
        assertTrue(result == expectedResult);
     }

    @ParameterizedTest
    @CsvSource({
            "5.0,5.0,25",
            "0.0, 10,0",
            "-1, 11,-11",
            "-0.5,-0.5,0.25"
    })
    public void multiplication(double firstNumber, double secondNumber, double expectedResult) {
        double result = calculator.multiplication(firstNumber, secondNumber);
        assertTrue(result == expectedResult);
     }

    @ParameterizedTest
    @CsvSource({
            "5.0,5.0,1.0",
            "0.0, 10,0.0",
            "-11, -1,11.0",
            "0.5,0.5,1.0"
    })
    public void division(double firstNumber, double secondNumber, double expectedResult) {
        double result = calculator.division(firstNumber, secondNumber);
        assertTrue(result == expectedResult);
     }

    @ParameterizedTest
    @CsvSource({
            "4.0,2.0",
            "0.0, 0.0",
            "169, 13"
    })
    public void root(double firstNumber, double expectedResult) {
        double result = calculator.root(firstNumber);
        assertTrue(result == expectedResult);
     }

    @ParameterizedTest
    @CsvSource({
            "2.0,2,4",
            "0.0,2,0",
            "-2,2,4",
            "-2,3,-8"
    })
    public void power(double firstNumber, int secondNumber, double expectedResult) {
        double result = calculator.power(firstNumber, secondNumber);
        assertTrue(result == expectedResult);
     }

    @ParameterizedTest
    @CsvSource({
            "2",
            "7",
            "11"
    })
     public void isPrime(int number) {
        assertTrue(calculator.isPrime(number));
     }

    @ParameterizedTest
    @CsvSource({
            "0",
            "1",
            "4"
    })
     public void isNotPrime(int number) {
        assertFalse(calculator.isPrime(number));
     }

    @Test
    public  void fibonacci() {
        Integer[] result = calculator.fibonacci(5);
        assertThat(result, anyOf(
                hasItemInArray(0),
                hasItemInArray(1),
                hasItemInArray(2),
                hasItemInArray(3)
        ));

        assertThat(Arrays.asList(result), contains(0, 1, 1, 2, 3));
    }

    @Test
    public void fibonacciLimitZero() {
        Integer[] result = calculator.fibonacci(0);
        assertThat(Arrays.asList(result), contains(0));
    }

    @Test
    public void fibonacciLimitOne() {
        Integer[] result = calculator.fibonacci(1);
        assertThat(Arrays.asList(result), contains(0, 1));
    }
}
