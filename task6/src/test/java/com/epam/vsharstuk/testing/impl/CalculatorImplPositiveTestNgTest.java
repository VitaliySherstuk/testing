package com.epam.vsharstuk.testing.impl;


import com.epam.vsharstuk.calculatorng.impl.CalculatorNgImpl;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CalculatorImplPositiveTestNgTest {

    private CalculatorNgImpl calculator;

    @BeforeClass(groups = {"smoke"})
    public void init() {
        calculator = new CalculatorNgImpl();
    }

    @DataProvider
    public Object[][] additionData() {
        return new Object[][]{
                {5.0,5.0},
                {0.0, 10},
                {-1.0, 11.0},
                {11.0, -1.0}};
    }

    @Test(dataProvider = "additionData", groups = {"smoke"})
    public void addition(double firstNumber, double secondNumber) {
        System.out.println("Thread_ID positive test: " + Thread.currentThread().getId());
        double result = calculator.addition(firstNumber, secondNumber);
        assertTrue(result == 10);
    }

    @DataProvider
    public Object[][] subtractionData() {
        return new Object[][]{
                {5.0,5.0,0},
                {0.0, 10,-10},
                {-1, 11,-12},
                {11, -1,12}
        };
    }

    @Test(dataProvider = "subtractionData", groups = {"smoke"})
    public void subtraction(double firstNumber, double secondNumber, double expectedResult) {
        System.out.println("Thread_ID positive test: " + Thread.currentThread().getId());
        double result = calculator.subtraction(firstNumber, secondNumber);
        assertTrue(result == expectedResult);
    }

    @DataProvider
    public Object[][] multiData() {
        return new Object[][] {
            {5.0,5.0,25},
            {0.0, 10,0},
            {-1, 11,-11},
            {-0.5,-0.5,0.25}
        };
    }

    @Test(dataProvider = "multiData", groups = {"smoke"})
    public void multiplication(double firstNumber, double secondNumber, double expectedResult) {
        System.out.println("Thread_ID positive test: " + Thread.currentThread().getId());
        double result = calculator.multiplication(firstNumber, secondNumber);
        assertTrue(result == expectedResult);
    }

    @DataProvider
    public Object[][] divisionData() {
        return new Object[][] {
                {5.0,5.0,1.0},
                {0.0, 10,0.0},
                {-11, -1,11.0},
                {0.5,0.5,1.0}
        };
    }

    @Test(dataProvider = "divisionData", groups = {"smoke"})
    public void division(double firstNumber, double secondNumber, double expectedResult) {
        System.out.println("Thread_ID positive test: " + Thread.currentThread().getId());
        double result = calculator.division(firstNumber, secondNumber);
        assertTrue(result == expectedResult);
    }

}
