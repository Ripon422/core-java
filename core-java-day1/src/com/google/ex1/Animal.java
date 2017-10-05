
package com.google.ex1;

/**
 *
 * @author ANDROID
 */
//Class Declearation
public class Animal{
    //Class Body area
    //Instance variable declaration
    private String name;
    private int age;

    public Animal() {
    }

  public void bite(){
      System.out.println("Animal Can bite");
  }
  
  public  void eat(){
      System.out.println("Animal Can eat");
  }
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

   

  

    
    
}
