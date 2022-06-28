package com.bridgelabz;

import java.util.Scanner;
import static com.bridgelabz.CollectionBook.*; //Importing CollectionBook class
public class AddressBookEdit {
    //Method to edit the contact for Book1
    public static void editBook1Details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name you want to edit ");
        String fName = sc.next();
        // for each loop
        for (Contacts contact : contactDetails1) {
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
                        break;
                    case 2:
                        System.out.println("Enter the Last name you want to update");
                        String updatedLastName = sc.next();
                        contact.setLastName(updatedLastName);
                        break;
                    case 3:
                        System.out.println("Enter the Address you want to update");
                        String updatedAddress = sc.next();
                        contact.setAddress(updatedAddress);
                        break;
                    case 4:
                        System.out.println("Enter the City you want to update");
                        String updatedCity = sc.next();
                        contact.setCity(updatedCity);
                        break;
                    case 5:
                        System.out.println("Enter the State you want to update");
                        String updatedState = sc.next();
                        contact.setState(updatedState);
                        break;
                    case 6:
                        System.out.println("Enter the Zip Code you want to update");
                        String updatedZipCode = sc.next();
                        contact.setZipCode(updatedZipCode);
                        break;
                    case 7:
                        System.out.println("Enter the Contact Number you want to update");
                        String updatedContact = sc.next();
                        contact.setContactNumber(updatedContact);
                        break;
                    case 8:
                        System.out.println("Enter the Email Address you want to update");
                        String updatedEmail = sc.next();
                        contact.setEmailAddress(updatedEmail);
                        break;
                    default:
                        System.out.println("Invalid Option.");
                }
            }
        }
    }
    //Method to edit the contact for Book2
    public static void editBook2Details() {
        System.out.println("Enter the first name you want to edit ");
        String fName = sc.next();
        // for each loop
        for (Contacts contact : contactDetails2) {
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
                        break;
                    case 2:
                        System.out.println("Enter the Last name you want to update");
                        String updatedLastName = sc.next();
                        contact.setLastName(updatedLastName);
                        break;
                    case 3:
                        System.out.println("Enter the Address you want to update");
                        String updatedAddress = sc.next();
                        contact.setAddress(updatedAddress);
                        break;
                    case 4:
                        System.out.println("Enter the City you want to update");
                        String updatedCity = sc.next();
                        contact.setCity(updatedCity);
                        break;
                    case 5:
                        System.out.println("Enter the State you want to update");
                        String updatedState = sc.next();
                        contact.setState(updatedState);
                        break;
                    case 6:
                        System.out.println("Enter the Zip Code you want to update");
                        String updatedZipCode = sc.next();
                        contact.setZipCode(updatedZipCode);
                        break;
                    case 7:
                        System.out.println("Enter the Contact Number you want to update");
                        String updatedContact = sc.next();
                        contact.setContactNumber(updatedContact);
                        break;
                    case 8:
                        System.out.println("Enter the Email Address you want to update");
                        String updatedEmail = sc.next();
                        contact.setEmailAddress(updatedEmail);
                        break;
                    default:
                        System.out.println("Invalid Option.");
                }
            }
        }
    }
}
