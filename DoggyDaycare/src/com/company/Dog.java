package com.company;

public class Dog extends Animal {

    public String breed;
    public double snoutLength;
    public int age;

    public Dog (int legs, String size, String name, double weight, boolean isFixed, String breed, double snoutLength, int age) {
        super (legs, size, name, weight, isFixed);
        this.breed = breed;
        this.snoutLength = snoutLength;
        this.age = age;
    }

    @Override
    public String speak () {

        return "Urf";
    }

    public String toString() {
        return String.format("{legs: %s, size: %s, name: %s, weight: %s, isFixed: %s, breed: %s, snoutLength: %s, age: %s}", legs, size, name, weight, isFixed, breed, snoutLength, age);
    }

}
