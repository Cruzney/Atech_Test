package org.example;

public class Calculator {
        // Simple Fibonacci function
        public static int fibonacci(int number) {
            if (number <= 1 ) {
                return number;
            }
            return fibonacci ( number - 1 ) + fibonacci ( number - 2 );
        }

        // Optimized Fibonacci function
        public static int fibonacciOptimize( int number) {
            int array[] = new int[number + 2];
            int count;

            array[0] = 0;
            array[1] = 1;

            for (count = 2; count <= number; count++) {
                array[count] = array[count - 1] + array[count - 2];
            }
            return array[number];
        }

    }
