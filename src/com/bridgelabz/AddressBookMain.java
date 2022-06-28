/*
Refactor to add multiple Address Book to the System. Each Address Book has a unique Name
 */
package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.println("Welcome to Address Book Program!");
        AddressBookMain addressBookMain = new AddressBookMain();
        CollectionBook.bookNames();
        CollectionBook.addDetails();
        //CollectionBook.personDetails();
        Scanner sc = new Scanner(System.in);
        CollectionBook addressDetails = new CollectionBook();
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
                    addressDetails.displayContacts();
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
