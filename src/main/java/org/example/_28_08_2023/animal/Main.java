package org.example._28_08_2023.animal;

import org.example._28_08_2023.animal.Animal;
import org.example._28_08_2023.animal.Chiken;

public class Main {

    public static void main(String[] args) {
        Animal animal1 = new Animal("Cat", 2);
        Animal animal2 = new Animal("Dog", 5);
        Animal animal3 = new Animal("Cat", 21);

        System.out.println(animal1);
        animal1.getName();

        Chiken chiken = new Chiken("Marie", 2);
        System.out.println(chiken.fly());
    }

}