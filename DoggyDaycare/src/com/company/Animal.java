package com.company;

public class Animal {

    public int legs = 3;
    public String size;
    public boolean isFixed;
    public String name;
    public double weight;

    public Animal (int legs, String size, String name, double weight, boolean isFixed) {
        this.legs = legs;
        this.size = size;
        this.name = name;
        this.weight = weight;
        this.isFixed = isFixed;

    }

    public String speak() {

        return "---";
    }

}
