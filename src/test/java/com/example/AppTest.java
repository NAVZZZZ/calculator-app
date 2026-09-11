package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();

        assertEquals(15, calc.add(10, 5));
    }

    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();

        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();

        assertEquals(50, calc.multiply(10, 5));
    }

    @Test
    public void testDivision() {
        Calculator calc = new Calculator();

        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    public void testDivisionByZero() {
        Calculator calc = new Calculator();

        assertThrows(
            IllegalArgumentException.class,
            () -> calc.divide(10, 0)
        );
    }
}
