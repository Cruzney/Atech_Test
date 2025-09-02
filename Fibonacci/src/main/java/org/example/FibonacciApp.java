package org.example;

public class FibonacciApp {
    public static void main ( String[] args ) {
        // Show 10 Fibonacci numbers, in call simple fibonacci function
        long start = System.nanoTime();
        for (int count = 0; count < 10; count++) {
            System.out.print ( Calculator.fibonacci (count) + " " );
        }
        long end = System.nanoTime();
        System.out.println();
        System.out.println("Simple Fibonacci time: " + (end - start) + " ns");

        System.out.println ( );

        // Show 10 Fibonacci numbers, in call optimized fibonacci function
        long startTime = System.currentTimeMillis ( );
        for (int count = 0; count < 10; count++) {
            System.out.print ( Calculator.fibonacciOptimize (count) + " " );
        }
        long endTime = System.currentTimeMillis ( );
        System.out.println();
        System.out.println("Optimized Fibonacci time: " + (endTime - startTime) + " ns");
    }
}