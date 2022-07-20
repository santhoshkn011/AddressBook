/*
 Ability to sort the entries in
the address book by City,
State, or Zip - Write functions to sort
 */
package com.bridgelabz;

public class AddressBookMain extends Operations{
    public static void main(String[] args) {
        System.out.println("Welcome to the Address book System project");
        Operations operations = new Operations();
        System.out.println("-----------------------------*****-------------------------");
        AddressBook(operations);
    }
}