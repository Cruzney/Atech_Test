package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @ParameterizedTest(name = "fibonacci({0}) should return {1}")
    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 1",
            "3, 2",
            "4, 3",
            "5, 5",
            "10, 55",
            "20, 6765"
    })
    @DisplayName("Test recursive fibonacci() with various positive numbers")
    void testFibonacci(int input, int expected) {
        assertEquals(expected, Calculator.fibonacci(input));
    }

    @ParameterizedTest(name = "fibonacciOptimize({0}) should return {1}")
    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 1",
            "3, 2",
            "10, 55",
            "20, 6765"
    })
    @DisplayName("Test optimized fibonacciOptimize() with various positive numbers")
    void testFibonacciOptimize(int input, int expected) {
        assertEquals(expected, Calculator.fibonacciOptimize(input));
    }


}