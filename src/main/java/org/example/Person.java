package org.example;
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        // Validate name
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Invalid name: must be non-null, non-empty, and less than 40 characters.");
        }

        // Validate age
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age: must be between 0 and 120.");
        }

        this.name = name;
        this.age = age;
    }

    // Getters (optional)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
