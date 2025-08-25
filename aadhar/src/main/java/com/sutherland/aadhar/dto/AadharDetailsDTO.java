package com.sutherland.aadhar.dto;

public class AadharDetailsDTO {
    private String aadharNumber;
    private String fullName;
    private String address;

    
    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    @Override
    public String toString() {
        return "AadharDetailsDTO [aadharNumber=" + aadharNumber + ", fullName=" + fullName + ", address=" + address + "]";
    }
}
