package com.bridgelabz;

import java.util.ArrayList; //Importing ArrayList class
import java.util.HashMap;
import java.util.Scanner;

public class CollectionBook {
    //Declaring class variables
    static Scanner sc = new Scanner(System.in);
    static int noOfAddressBooks = 2; //fixed number of Address Books = 2
    static String[] bookName = new String[noOfAddressBooks]; //declaring array
    static int noOfPerson;
    static ArrayList<Contacts> contactDetails1 = new ArrayList<>(); //Create an ArrayList for Address book1
    static ArrayList<Contacts> contactDetails2 = new ArrayList<>(); //Create an ArrayList for Address Book2
    static HashMap<String, ArrayList> book = new HashMap<>();//Creating HashMap
    private static Contacts[] contactDetails;

    //Entering AddressBook names
    public static void addressBooks() {
//        System.out.print("Enter the Number of address books you need: ");
//        noOfAddressBooks = sc.nextInt();
        System.out.printf("The Total number of Address Books we have is %d",noOfAddressBooks);
        System.out.println("\nEnter the Address Book Names: ");
        for (int i = 0; i < noOfAddressBooks; i++) {
            bookName[i] = sc.next();
        }
        System.out.println("The Address Books are");
        for (int i = 0; i < noOfAddressBooks; i++) {
            System.out.println(bookName[i]);
        }
    }
    //Method to store the details in HashMap
    public static void addCollectionDetails() {
        for (int i = 0; i < noOfAddressBooks; i++) {
            System.out.printf("\nEnter the Number of persons to be added in %s: ", bookName[i]).println();
            noOfPerson = sc.nextInt();
            for (int j = 0; j < noOfPerson; j++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("\nEnter Person Details: ");
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
                if (i == 0) {
                    contactDetails1.add(info); //Adding elements(Number of person) to the array list using add() method.
                    book.put(bookName[i], contactDetails1); //Storing the details in HashMap book for book1
                } else if (i == 1) {
                    contactDetails2.add(info);
                    book.put(bookName[i], contactDetails2); //Storing the details in HashMap book for book2
                }
            }
        }
    }
    public static void chooseOption () {
        Scanner sc = new Scanner(System.in);
        int chooseNumber;
        //do while loop for choosing options
        do {
            System.out.println("----------------------------------------");
            System.out.println("Enter the number to perform an action: ");
            System.out.println("1. Add Details \n2. Edit Details \n3. Delete Details \n4. Display Details \n5. exit ");
            chooseNumber = sc.nextInt();

            switch (chooseNumber) {
                case 1:
                    System.out.println("Add Details: ");
                    addDetails();
                    break;
                case 2:
                    System.out.println("Edit details: ");
                    editDetails();
                    break;
                case 3:
                    System.out.println("Delete Details: ");
                    deleteDetails();
                    break;
                case 4:
                    System.out.println("Display details: ");
                    displayContacts();
                    break;
                case 5:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("invalid Option, Please select (1 to 5): ");
                    break;
            }
        } while (chooseNumber != 5);
    }
    //Adding the person details method
    public static void addDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nAdd person details: ");
        addCollectionDetails(); //Calling Method inside Method
    }
    //Method to Display the Contacts
    public static void displayContacts() {
        System.out.printf("------- Address Book: %s -------", bookName[0]).println();
        for (Contacts contactsDetailsInfo : contactDetails1) {
            System.out.println(contactsDetailsInfo);
            System.out.println("----------------------------------------");
        }
        System.out.printf("------- Address Book: %s -------", bookName[1]).println();
        for (Contacts contactsDetailsInfo : contactDetails2) {
            System.out.println(contactsDetailsInfo);
            System.out.println("----------------------------------------");
        }
    }
    //Method to Edit the Details
    public static void editDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the option to Edit details: ");
        System.out.printf("1. %s", bookName[0]).println();
        System.out.printf("2. %s", bookName[1]).println();
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                AddressBookEdit.editBook1Details(); //Calling Method from AddressBookEdit Class
                break;
            case 2:
                AddressBookEdit.editBook2Details();
                break;
            default:
                System.out.println("Invalid Number, Please Select 1 or 2.");
        }
    }
    //Method to Delete the details
    public static void deleteDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the option to Delete details: ");
        System.out.printf("1. %s", bookName[0]).println();
        System.out.printf("2. %s", bookName[1]).println();
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                AddressBookDelete.deleteBook1Details(); //Calling Method from AddressBookDelete Class
                break;
            case 2:
                AddressBookDelete.deleteBook2Details();
                break;
            default:
                System.out.println("Invalid Number, Please Select 1 or 2.");
        }
    }
}
