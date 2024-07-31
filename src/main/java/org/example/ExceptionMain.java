package org.example;

public class ExceptionMain {
    public static void main(String[] args) {
        try {
            Person person = new Person("John Doe", 25);
            System.out.println("Person created: " + person.getName() + ", " + person.getAge());

            long fact = Calculator.factorial(5);
            System.out.println("Factorial of 5: " + fact);

            long binCoeff = Calculator.binomialCoefficient(5, 2);
            System.out.println("Binomial coefficient of (5, 2): " + binCoeff);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Examples of invalid inputs
        try {
            Person invalidPerson = new Person("", -5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Invalid name: must be non-null, non-empty, and less than 40 characters. Invalid age: must be between 0 and 120.
        }

        try {
            long invalidFact = Calculator.factorial(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Invalid parameter: factorial is defined for non-negative integers only.
        }

        try {
            long invalidBinCoeff = Calculator.binomialCoefficient(5, 6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Invalid parameters: k must not be greater than n.
        }
    }
}
