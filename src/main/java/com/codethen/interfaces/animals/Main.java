package com.codethen.interfaces.animals;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        Animal animal = new Animal() { // anonymous class
            @Override
            public String makeSound() {
                return "aaaah";
            }
        };

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(new Dog());
        animals.add(animal);

        for (Animal a : animals) {
            System.out.println( a.makeSound() );
        }
    }
}
