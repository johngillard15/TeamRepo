package com.company;
import java.util.ArrayList;


public class DayCare {

    ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal kind) {
        animals.add(kind);
    }

    public void displayAnimal () {
        for (Animal pet : animals) {
            System.out.println(pet.getClass().getSimpleName() + ":" + "\n" + pet);
        }
    }

    public void removeAnimal (String animalName) {
        for (Animal pet : animals) {
            if (pet.name.equals(animalName)) {
                animals.remove(pet);
                return;
            }
        }
    }
}
