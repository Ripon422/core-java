package com.google.ex1;

/**
 *
 * @author ANDROID
 */
public class Day1 {

    private static int x = 10;
    private static int y = 5;

    public static void main(String[] args) {
        int z = x + y;
        System.out.println("z: " + z);
        Animal animal2 = new Animal("Jerry", 25);

        System.out.println("name: " + animal2.getName());
        System.out.println("name: " + animal2.getAge());

        Dog dog = new Dog("Black", "Jerry", 15);
        System.out.println("Color: " + dog.getColor()
                + " Name: " + dog.getName()
                + " Age: " + dog.getAge());
        animal2.bite();
        animal2.eat();
        
        dog.bite();
        dog.eat();
        
        Animal an=new Dog("Green", "Abc", 12);
        an.bite();
        an.eat();

    }
}
