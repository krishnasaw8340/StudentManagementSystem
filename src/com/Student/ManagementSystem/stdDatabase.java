package com.Student.ManagementSystem;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class stdDatabase {
    public static void main(String[] args)
    {
//        student std = new student();
//        std.enroll();
//        std.payTution();
//        System.out.println(std.toString());
        System.out.println("Enter Number of Students to Enroll: ");
        Scanner in = new Scanner(System.in);

        int numOfStudent = in.nextInt();
        student[] students = new student[numOfStudent];

        // create a number of new student
        for (int i=0; i<numOfStudent; i++) {
            students[i] = new student();

            students[i].enroll();
            students[i].payTution();
        }

        for (int i=0; i<numOfStudent; i++)
        {
            System.out.println(students[i].toString());
            System.out.println("\n");
        }



    }
}
