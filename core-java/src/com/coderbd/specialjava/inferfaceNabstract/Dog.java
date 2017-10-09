package com.coderbd.specialjava.inferfaceNabstract;
public class Dog implements Animal,CCC {

    @Override
    public void bite() {
        System.out.println("Dog Can bite");
    }

    @Override
    public void eat() {
        System.out.println("Dog Can eat");
    }

    @Override
    public void sleep() {
        System.out.println("Dog Can sleep");
    }

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
