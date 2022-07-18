/*
 Ability to sort the entries in the
address book alphabetically by
Person’s name
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