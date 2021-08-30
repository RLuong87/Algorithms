package com.company;

import java.util.Scanner;

/*
* Learning different concepts
* Working on Email App
*
*
*
* 
*/

public class Email {
    private String firstName;
    private String lastName;
    private String rented;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Customer Name: " + this.firstName + " " + this.lastName);

        this.rented = setRented();
        System.out.println("Rented: " + this.rented);
    }

    private String setRented() {
        System.out.println("Rent a Car");
        System.out.print("1) Honda Accord\n2) Toyota Camry\n0) None\nSelection: ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        if (choice == 1) {return "Honda Accord";}
        else if (choice == 2) {return "Toyota Camry";}
        else {return "";}
    }
}
