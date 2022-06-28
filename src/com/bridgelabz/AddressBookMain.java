/*
Refactor to add multiple Address Book to the System. Each Address Book has a unique Name
 */
package com.bridgelabz;

public class AddressBookMain {
    static CollectionBook addressBooks = new CollectionBook();
    //Main Method
    public static void main(String args[]) {
        System.out.println("Welcome to Address Book Program!"); //Welcome Message
        CollectionBook.addressBooks(); //calling method from CollectionBook Class
        CollectionBook.chooseOption();
        System.out.println("\nAddress books and the current contact Details are: ");
        System.out.println(addressBooks.book);
    }
}
