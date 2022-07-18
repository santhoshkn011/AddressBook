/*
 Ability to search Person in a City or State across the multiple AddressBook
 */
package com.bridgelabz;

public class AddressBookMain extends Operations{
    public static void main(String[] args) {
        System.out.println("Welcome to the Address book System project: ");
        Operations operations = new Operations();
        System.out.println("--------------------------Address Book-------------------------");
        AddressBook(operations);
    }
}