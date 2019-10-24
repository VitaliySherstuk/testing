package com.epam.vsharstuk.testing.impl;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class CalculatorImplNegotiveTest {

    private Double prioritizedParameter = 0.0;
    private final static Double CONSTANT = 10.0;
    private final static Double DELTA_CONSTANT = 2.0;

    @Test(priority = 3)
    public void additionIncorrect() {
        System.out.println("Thread_ID negative test: " + Thread.currentThread().getId());
        assertFalse(false);
    }

    @Test(priority = 1)
    public void subtractionIncorrect() {
        System.out.println("Thread_ID negative test: " + Thread.currentThread().getId());
        assertFalse(false);
    }

    @Test(priority = 4)
    public void multiplicationIncorrect() {
        System.out.println("Thread_ID negative test: " + Thread.currentThread().getId());
        assertFalse(false);
    }

    @Test(priority = 2)
    public void divisionIncorrect() {
        System.out.println("Thread_ID negative test: " + Thread.currentThread().getId());
        assertFalse(false);
    }

    @Test(priority = 5, dependsOnMethods = {"setPrioritizedParameter"}) //dependsOn has higher priority than 'priopity'
    public void divisionOnPrioritizedParameter() {
        double result = CONSTANT / prioritizedParameter;
        assertTrue(result == CONSTANT / DELTA_CONSTANT);
    }

    @Test(priority = 6)
    public void setPrioritizedParameter() {
        prioritizedParameter = prioritizedParameter + DELTA_CONSTANT;
        assertEquals(prioritizedParameter, DELTA_CONSTANT);
    }
}
