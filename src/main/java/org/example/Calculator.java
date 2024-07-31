package org.example;
public class Calculator {

    public static long factorial(int n) {
        // Validate parameter
        if (n < 0) {
            throw new IllegalArgumentException("Invalid parameter: factorial is defined for non-negative integers only.");
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long binomialCoefficient(int n, int k) {
        // Validate parameters
        if (n < 0 || k < 0) {
            throw new IllegalArgumentException("Invalid parameters: n and k must be non-negative.");
        }
        if (k > n) {
            throw new IllegalArgumentException("Invalid parameters: k must not be greater than n.");
        }

        // Calculate binomial coefficient using the corrected formula
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
}


