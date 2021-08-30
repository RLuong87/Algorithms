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
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName + "\n");

        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    }

    private String setDepartment() {
        System.out.print("1) Marketing\n2) Production\n3) Sales\n0) None\nChoose Department: ");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        if (choice == 1) {return "Marketing";}
        else if (choice == 2) {return "Production";}
        else if (choice == 3) {return "Sales";}
        else {return "";}
    }
}
