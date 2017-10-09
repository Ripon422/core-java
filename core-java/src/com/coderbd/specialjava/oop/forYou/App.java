package com.coderbd.specialjava.oop.forYou;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ANDROID
 */
public class App {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Ripon",
                new StudentDetails(1, "ripon@gmail.com", "01686000000",
                        new Address(1, "220/A", "21", "B", new AddressType(1, "permanent")))));
        
        for(Student s : students){
            System.out.println("ID: "+s.getId()
            +" Name: "+s.getName()
            +" Email: "+s.getStudentDetails().getEmail()
            +" Mobile: "+s.getStudentDetails().getMobile()
            +" House: "+s.getStudentDetails().getAddress().getHouseNo()
            +" Address Type:  "+s.getStudentDetails().getAddress().getAddressType().getName());
        }
   
    
    }
}
