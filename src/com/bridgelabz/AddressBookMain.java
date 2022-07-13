/*
 Ability to ensure there is no Duplicate Entry of the same Person in a particular Address Book.
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