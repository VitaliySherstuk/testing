package com.epam.vsharstuk.calculator;

import com.epam.vsharstuk.calculator.impl.CalculatorImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static java.util.concurrent.TimeUnit.MILLISECONDS;


public class CalculatorImplNegativeTest {

    private CalculatorImpl calculator;

    @BeforeEach
    public void init() {
        calculator = new CalculatorImpl();
    }

    @Test
    public void additionInfinity() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.addition(Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    public void subtractionInfinity() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.subtraction(Double.MAX_VALUE, 2*Double.MAX_VALUE));
    }

    @Test
    public void multipleInfinity() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.multiplication(1E300, 1E20));
    }

    @Test
    public void multipleNegativeInfinity() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.multiplication(-1E300, 1E20));
    }

    @Test
    public void divisionOnZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.division(10.0, 0));
    }

    @Test
    public void powZeroTOZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.power(0.0, 0));
    }

    @Test
    public void rootNegativeNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.root(-4));
    }

    @Test
    @Timeout(value = 10000000, unit = MILLISECONDS)
    public void powTimeOut() {
        calculator.power(200, 40);
    }

    @Test
    public void powInfinity() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.power(200, 200));
    }

    @Test
    public  void fibonacci() {
        Integer[] result = calculator.fibonacci(5);
        System.out.println("RESULT:" + "\namount of elements: " + result.length);
        for(int i = 0; i<result.length; i++ ) {
            String separator = i == 0 ? "" : ",";
            System.out.print(separator + result[i]);
        }
        System.out.println();
    }
}
