package com.company;

public class Cat extends Animal {

    String pattern;
    boolean wasStray;

    public Cat (int legs, String size, String name, double weight, boolean isFixed, String pattern, boolean wasStray) {
        super(legs, size, name, weight, isFixed);
        this.pattern = pattern;
        this.wasStray = wasStray;
    }

    @Override
    public String speak() {
        return "Wow";
    }

    public String toString() {
        return String.format("{legs: %s, size: %s, name: %s, weight: %s, isFixed: %s, pattern: %s, wasStray: %s}", legs, size, name, weight, isFixed, pattern, wasStray);
    }

}
