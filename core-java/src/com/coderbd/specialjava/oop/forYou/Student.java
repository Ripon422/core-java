package com.coderbd.specialjava.oop.forYou;

/**
 *
 * @author ANDROID
 */
public class Student {

    private int id;
    private String name;
    private StudentDetails studentDetails;

    public Student(int id, String name, StudentDetails studentDetails) {
        this.id = id;
        this.name = name;
        this.studentDetails = studentDetails;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public StudentDetails getStudentDetails() {
        return studentDetails;
    }

}
