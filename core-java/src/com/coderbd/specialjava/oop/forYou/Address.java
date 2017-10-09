package com.coderbd.specialjava.oop.forYou;

/**
 *
 * @author Mohamamd Rajaul Islam
 */
public class Address {
   private int id;
   private String houseNo;
   private String roadNo;
   private String block;
   private AddressType addressType;

    public Address(int id, String houseNo, String roadNo, String block, AddressType addressType) {
        this.id = id;
        this.houseNo = houseNo;
        this.roadNo = roadNo;
        this.block = block;
        this.addressType = addressType;
    }

    public int getId() {
        return id;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public String getRoadNo() {
        return roadNo;
    }

    public String getBlock() {
        return block;
    }

    public AddressType getAddressType() {
        return addressType;
    }
   
   
   
}
