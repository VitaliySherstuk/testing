package com.epam.vsharstuk.testing.impl;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CalculatorImplPositiveTest {

    @DataProvider
    public Object[][] additionData() {
        return new Object[][]{};
    }

    @Test(dataProvider = "additionData", groups = {"smoke"})
    public void addition() {
        System.out.println("Thread_ID positive test: " + Thread.currentThread().getId());
        assertTrue(true);
    }

    @DataProvider
    public Object[][] subtractionData() {
        return new Object[][]{};
    }

    @Test(dataProvider = "subtractionData", groups = {"smoke"})
    public void subtraction() {
        System.out.println("Thread_ID positive test: " + Thread.currentThread().getId());
        assertTrue(true);
    }

    @Test(groups = {"smoke"})
    public void multiplication() {
        System.out.println("Thread_ID positive test: " + Thread.currentThread().getId());
        assertTrue(true);
    }

    @Test(groups = {"smoke"})
    public void division() {
        System.out.println("Thread_ID positive test: " + Thread.currentThread().getId());
        assertTrue(true);
    }

}
