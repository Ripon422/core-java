package com.coderbd.specialjava.oop.goodExample;
public class Employee {
    private int empID;
    private String name;
    private Gender gender;
    private Department department;

    public Employee(int empID, String name, Gender gender, Department department) {
        this.empID = empID;
        this.name = name;
        this.gender = gender;
        this.department = department;
    }

    public int getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Department getDepartment() {
        return department;
    }
    
    
}
