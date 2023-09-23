package org.example._28_08_2023.animal;

public class Chiken implements Fly {

    private String name;

    private int age;

    public Chiken(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String fly() {
        return "I'm ready to fly";
    }

    @Override
    public void fly1() {

    }
}
