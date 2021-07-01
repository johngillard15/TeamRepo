package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello user");

        DayCare careerDogs = new DayCare();

        careerDogs.addAnimal(
                new Dog(
                4,
                "Medium",
                "Buck",
                96.5,
                true,
                "Husky",
                5.5,
                3
                )
        );
        careerDogs.addAnimal(
                new Cat(
                4,
                "Small",
                "Jimmy",
                12.3,
                true,
                "leopard",
                true
                )
        );

        careerDogs.displayAnimal();
        careerDogs.removeAnimal("Jimmy");
        careerDogs.displayAnimal();
    }
}