package com.bridgelabz;

import java.util.Iterator; //Importing Iterator class
import java.util.Scanner;
import static com.bridgelabz.CollectionBook.*; //Importing CollectionBook class
public class AddressBookDelete {
    //Method to delete the contact for Book1
    public static void deleteBook1Details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter First Name for which you want to delete contact: ");
        String firstname = sc.next(); //user input
        Iterator<Contacts> removeContact = contactDetails1.iterator(); //create an Iterator object
        while (removeContact.hasNext()){     //It returns true if the list has a next element or more elements.
            Contacts nextElement = removeContact.next(); //Creating an Object for Contacts Class
            if (nextElement.getFirstName().equals(firstname) ) {
                removeContact.remove(); //Removes the next element in the iteration.
                System.out.println("This contact is removed!");
                break;
            }
            else {
                System.out.print("");
            }
        }
    }
    //Method to delete the contact for Book2
    public static void deleteBook2Details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter First Name for which you want to delete contact: ");
        String firstname = sc.next(); //user input
        Iterator<Contacts> removeContact = contactDetails2.iterator();
        while (removeContact.hasNext()){
            Contacts nextElement = removeContact.next();
            if (nextElement.getFirstName().equals(firstname) ) {
                removeContact.remove();
                System.out.println("This contact is removed!");
                break;
            }
            else {
                System.out.print("");
            }
        }
    }
}
