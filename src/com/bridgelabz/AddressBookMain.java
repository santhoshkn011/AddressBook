/*
Ability to add a new Contact to Address Book

Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit.
+We can add or remove elements anytime. So, it is much more flexible than the traditional array. It is found in the java.util package.
 */
package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    ArrayList <Contacts> contactsDetails = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addPersonDetails(){
        Contacts info = new Contacts();
        System.out.print("Enter your First Name: ");
        info.setFirstName(sc.nextLine());

        System.out.print("Enter Last Name: ");
        info.setLastName(sc.nextLine());

        System.out.print("Enter Your Address: ");
        info.setAddress(sc.nextLine());

        System.out.print("Enter your city: ");
        info.setCity(sc.nextLine());

        System.out.print("Enter your State: ");
        info.setState(sc.nextLine());

        System.out.print("Enter your zip Code: ");
        info.setZipCode(sc.nextLine());

        System.out.print("Enter your Contact Number: ");
        info.setContactNumber(sc.nextLine());

        System.out.print("Enter your Email Address: ");
        info.setEmailAddress(sc.nextLine());

        contactsDetails.add(info);
    }
    public void displayContacts(){
        System.out.println(contactsDetails);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Address book System project......:-)");
        AddressBookMain person1 = new AddressBookMain();
        person1.addPersonDetails();
        person1.displayContacts();
    }
}