package com.Student.ManagementSystem;

import java.util.Locale;
import java.util.Scanner;

public class student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentId;
    private String courses;
    private int tutionFees;
    private static int costOfCourse = 100;
    private static int id = 1000;

    public student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter Last Name: ");
        this.lastName = in.nextLine();

        System.out.print("1 - Fresher \n2 - Sophmore \n3 - Junior \n4 - Senior \nEnter Class Level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

//        System.out.println(firstName + " " + lastName + " "+studentId);


    }
    private void setStudentID(){
        // Grade level and ID
        id++;
        this.studentId = gradeYear + id ;
    }

    public void enroll() {
        int count = 0;
        // Get inside a loop, user hits 0
        System.out.println("\n");


        System.out.println(" Courses are: C++, ComputerNetworks, Java,etc...");
        System.out.println("EACH COURSE COSTS $100 ");
        do {

            System.out.print("Enter Course wants to enroll : (Q to exit) ");

            Scanner in = new Scanner(System.in);
            String course;
            course = in.nextLine();
            count++;
            if (!course.equals("Q")) {
                courses += " " + course;
                tutionFees += costOfCourse;
            } else {
                System.out.println("Successfully Enrolled ");
                break;
            }
        }while ( 1!=0);

//        System.out.print("Enrolled In : "+ courses.toUpperCase());
//        System.out.println("\n");
        System.out.println("Total Course fees to pay  : "+ tutionFees + " for " + (count-1)+" courses");

    }


    public void viewBalance(){
        System.out.println("Your Available Balance is : $"+tutionFees );
    }
    public void payTution()
    {
        System.out.println("How much Money does "+ firstName + " have :  (ex: 1000,2000, 3000 ) " );
        Scanner in  = new Scanner(System.in);
        int pay = in.nextInt();
        pay -= tutionFees;
        System.out.println("Payment Successfull of : $"+tutionFees);
        tutionFees = pay;
        System.out.println("\n");
//        viewBalance();
    }

    public String toString() {
        System.out.println("******"+ firstName+"'s" + " INFO*******");
        return "NAME : " + firstName +" "+ lastName +
                "\nGRADE LEVEL : " + gradeYear +
                "\nSTUDENT-ID : "+ studentId +
                "\nCOURSES : " + courses +
                "\nBALANCE LEFT :  "+ tutionFees;
    }
}
