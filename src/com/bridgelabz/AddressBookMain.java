/*
Ability to create a Contacts in Address Book with first and last names, address, city, state, zip, phone number and email address.
 */
package com.bridgelabz;

public class AddressBookMain {
    public static void main(String args[]){
        //Greetings
        System.out.println("Welcome to Address Book Program!");
        //Creating object
        Contacts contacts = new Contacts();
        contacts.setFirstName("Santhosh");
        System.out.println("First Name: "+contacts.getFirstName());
        contacts.setLastName("Kumar");
        System.out.println("Last Name: "+contacts.getLastName());
        contacts.setAddress("Patel Nagar");
        System.out.println("Address: "+contacts.getAddress());
        contacts.setCity("Hyderabad");
        System.out.println("City: "+contacts.getCity());
        contacts.setState("Telangana");
        System.out.println("State: "+contacts.getState());
        contacts.setZipCode("500011");
        System.out.println("Pin Code: "+contacts.getZipCode());
        contacts.setContactNumber("1234567890");
        System.out.println("Contact Number: "+contacts.getContactNumber());
        contacts.setEmailAddress("santhosh@gmail.com");
        System.out.println("Email Address: "+contacts.getEmailAddress());
    }
}
