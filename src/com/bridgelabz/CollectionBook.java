package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CollectionBook {
    static final int noOfAddressBooks = 2;
    static String bookName[] = new String[noOfAddressBooks];
    static ArrayList<Contacts> contactDetails = new ArrayList<>(); //Create an ArrayList
    static HashMap<String, String> book = new HashMap<>();//Creating HashMap
    public static void addDetails() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < noOfAddressBooks; i++) {
            Scanner sc = new Scanner(System.in);
            Contacts info = new Contacts();
            System.out.print("Enter the First Name : ");
            info.setFirstName(sc.nextLine());
            System.out.print("Enter the Last Name: ");
            info.setLastName(sc.nextLine());
            System.out.print("Enter the Address: ");
            info.setAddress(sc.nextLine());
            System.out.print("Enter the city: ");
            info.setCity(sc.nextLine());
            System.out.print("Enter the State: ");
            info.setState(sc.nextLine());
            System.out.print("Enter the zip Code: ");
            info.setZipCode(sc.nextLine());
            System.out.print("Enter the Contact Number: ");
            info.setContactNumber(sc.nextLine());
            System.out.print("Enter the Email Address: ");
            info.setEmailAddress(sc.nextLine());
            contactDetails.add(info);  //Adding elements to the array list using add() method.
            String array[] = new String[contactDetails.size()];// ArrayList to String Array conversion
            for (int j = 0; j < contactDetails.size(); j++) {
                array[j] = String.valueOf(contactDetails.get(j));
                book.put(bookName[j],array[j]); //storing the book and person details.
            }
            for (String k : array) {
                System.out.println(k); // Printing array elements
            }
            System.out.println(book);
        }
    }
    public static void bookNames(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Total number of address books: "+noOfAddressBooks);
        System.out.println("Enter the Address Book Names: ");
        for (int i = 0; i <noOfAddressBooks; i++) {
            bookName[i] = sc.next();
        }
    }
    public static void personDetails() {
        //Will sue this method in future if required
    }
    public void editDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name you want to edit ");
        String fName = sc.next();
        // for each loop
        for (Contacts contact : contactDetails) {
            String name = contact.getFirstName();// "name" variable and store the first name that you want to edit.
            // if the first name matches with the entered name, using equals method
            if (name.equals(fName)) {
                System.out.println("Enter the number to edit respective info: ");
                System.out.println("1. First Name \n2. Last Name \n3. Address \n4. City \n5. State \n6. Zip Code \n7. Contact Number \n8. Email Address");
                System.out.println("Enter value to update: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the first name you want to update");
                        String updatedFirstName = sc.next();
                        contact.setFirstName(updatedFirstName);
                        displayContacts();
                        break;
                    case 2:
                        System.out.println("Enter the Last name you want to update");
                        String updatedLastName = sc.next();
                        contact.setLastName(updatedLastName);
                        displayContacts();
                        break;
                    case 3:
                        System.out.println("Enter the Address you want to update");
                        String updatedAddress = sc.next();
                        contact.setAddress(updatedAddress);
                        displayContacts();
                        break;
                    case 4:
                        System.out.println("Enter the City you want to update");
                        String updatedCity = sc.next();
                        contact.setCity(updatedCity);
                        displayContacts();
                        break;
                    case 5:
                        System.out.println("Enter the State you want to update");
                        String updatedState = sc.next();
                        contact.setState(updatedState);
                        displayContacts();
                        break;
                    case 6:
                        System.out.println("Enter the Zip Code you want to update");
                        String updatedZipCode = sc.next();
                        contact.setZipCode(updatedZipCode);
                        displayContacts();
                        break;
                    case 7:
                        System.out.println("Enter the Contact Number you want to update");
                        String updatedContact = sc.next();
                        contact.setContactNumber(updatedContact);
                        displayContacts();
                        break;
                    case 8:
                        System.out.println("Enter the Email Address you want to update");
                        String updatedEmail = sc.next();
                        contact.setEmailAddress(updatedEmail);
                        displayContacts();
                        break;
                    default:
                        System.out.println("Invalid number!");
                }
            } else {
                System.out.println("Invalid details: Please Enter the valid first name.");
            }
        }
    }
    public void deleteContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter First Name for which you want to delete contact: ");
        String firstname = sc.next(); //user input
        Iterator<Contacts> removeContact = contactDetails.iterator();
        /*  Checking the next element where
         *   condition holds true till there is single element
         *   in the List using hasNext() method
         */
        while (removeContact.hasNext()){
            /*  Move cursor to next element */
            Contacts nextElement = removeContact.next(); //object for Contacts class
            if (nextElement.getFirstName().equals(firstname) ) {
                removeContact.remove();
                System.out.println("Contact is removed!");
                break;
            }
            else {
                System.out.println("Contact not found.");
            }
        }
    }
    public void displayContacts() {
        for (Contacts contactsDetailsInfo : contactDetails) {
            System.out.println("----------------------------------------");
            System.out.println(contactsDetailsInfo);
        }
    }
}
