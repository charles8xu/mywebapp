package com.xuchao.pojo.person;

/**
 * Created by xuchao on 14-8-30.
 */
public class Address {

    private String zipCode;
    private String street;

    public Address(String zipCode, String street) {
        this.zipCode = zipCode;
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
