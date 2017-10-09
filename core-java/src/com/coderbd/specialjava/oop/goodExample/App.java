package com.coderbd.specialjava.oop.goodExample;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        // public Employee(int empID, String name, Gender gender, Department department)
        empList.add(new Employee(100, "Ripon", Gender.MALE, new Department(1, "Software")));
        empList.add(new Employee(101, "Taslim", Gender.MALE, new Department(1, "Software")));
        empList.add(new Employee(102, "Illeas", Gender.MALE, new Department(2, "Admin")));

        for(Employee e : empList){
            System.out.println(e.getEmpID()+" "+e.getName()+" "+e.getGender()+" "+e.getDepartment().getDepartmentName());
        
        }
        
        
    }

}
