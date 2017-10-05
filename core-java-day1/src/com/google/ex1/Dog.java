package com.google.ex1;

public class Dog extends Animal {

    private String color;

    public Dog(String color, String name, int age) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void bite() {
        System.out.println("Dog Can bite");
    }

    @Override
    public void eat() {
        System.out.println("Dog Can eat");
    }

}
