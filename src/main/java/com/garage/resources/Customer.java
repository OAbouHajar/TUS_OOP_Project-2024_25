package com.garage.resources;

import java.util.UUID;

public class Customer {

    UUID customerID;
    String name;
    String phoneNumber;

    public Customer(String name, String phoneNumber) {
        this.customerID = UUID.randomUUID();
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public UUID getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setCustomerID(UUID customerID) {
        this.customerID = customerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
