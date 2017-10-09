package com.coderbd.specialjava.oop.forYou;

/**
 *
 * @author ANDROID
 */
public class StudentDetails {

    private int id;
    private String email;
    private String mobile;
    private Address address;

    public StudentDetails(int id, String email, String mobile, Address address) {
        this.id = id;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public Address getAddress() {
        return address;
    }
    
    
    

}
