/*
Ability to delete a person using person's name.
 */
package com.bridgelabz;

import java.util.ArrayList; //importing array list
import java.util.Iterator; //importing Iterator
import java.util.Scanner; //importing Scanner
//AddressBookMain class
public class AddressBookMain {
    static ArrayList<Contacts> contactDetails = new ArrayList<>(); //Create an ArrayList object "contactDetails"
    //Creating a method to add person details
    public static void addDetails() {
        Scanner sc = new Scanner(System.in);
        Contacts info = new Contacts(); //Creating an object "info" for Contacts class
        //Entering details from User input
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
    }
    //Method to edit the details
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
    //Method to display the Array List
    public static void displayContacts() {
        for (Contacts contactsDetailsInfo : contactDetails) {
            System.out.println(contactsDetailsInfo);
        }
    }
    public void deleteContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name of the person to be deleted");
        String firstName = sc.next();
        Iterator<Contacts> iterator = contactDetails.listIterator();
        while (iterator.hasNext()) {

            Contacts info = iterator.next();

            if (firstName.equals(info.getFirstName())) {
                contactDetails.remove(info);
                System.out.printf("%s Contact removed", firstName + "\n");
            } else
                System.out.println("Contact not found\n");
        }
    }
    //Main Method Starts
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book Program!)"); //Welcome Message
        AddressBookMain addressDetails = new AddressBookMain();
        int chooseNumber;
        //do while loop
        do {
            System.out.println("Enter the number to perform an action: ");
            System.out.println("1. Add Details \n2. Edit Details \n3. Delete Details \n4. Display Details \n5. exit ");
            chooseNumber = sc.nextInt();

            switch (chooseNumber) {
                case 1:
                    System.out.println("Add Details: ");
                    addressDetails.addDetails();
                    break;
                case 2:
                    System.out.println("Edit details: ");
                    addressDetails.editDetails();
                    break;
                case 3:
                    System.out.println("Delete Details: ");
                    addressDetails.deleteContact();
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
}