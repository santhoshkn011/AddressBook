package com.bridgelabz;
//creating class Contacts
public class Contacts {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String contactNumber;
    private String emailAddress;
    //Constructor for contacts
    public void Contacts() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
    }
    //Setters and Getters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getZipCode() {
        return zipCode;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
//overwritten toString
    public String toString() {
        return ("FirstName: " + firstName + "\nLastName: " + lastName + "\nAddress: " + address + "\nCity: " + city + "\nState: " + state +
                "\nZip Code: " + zipCode + "\nContact Number: " + contactNumber + "\nEmail Address: " + emailAddress + "\n");
    }
}


