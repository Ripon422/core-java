package com.coderbd.specialjava.oop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANDROID
 */
public class Person {

    private String name;
    private int age;
    private double weight;

    /**
     * Constructor is same of class name Constructor must have terminal and body
     * Constructor may have parameter
     */
    public Person() {
        //It is called default Constructor
    }

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Rahim", 50, 70.0);
        Person p2 = new Person("Karim", 60, 65.0);

        List list = new ArrayList();
        list.add("A");
        list.add(2);
        list.add(5.0);
        list.add(true);

        List<Integer> intList = new ArrayList<Integer>();
        //intList.add("aaa"); wrong , we can not add String here

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(new Person("Karim", 60, 65.0));
        
        System.out.println("Name: " + "" + " Age: " + "" + " Weight: ");
        for (Person p : personList) {
            System.out.println(p.getName() + "  " + p.getAge() + " " + p.getWeight());
        }

    }

}
