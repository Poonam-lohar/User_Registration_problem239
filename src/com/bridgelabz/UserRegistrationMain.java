package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void main(String[] args) {

        System.out.println("Welcome To User Registration Problem.....");
        boolean flag = true;
        while (flag) {
            Scanner sc = new Scanner(System.in);
            UserRegistration userRegistration = new UserRegistration();
            System.out.println("\n1.Valid FirstName \n2.Valid lastName \n3.Valid Email \n4.Valid Mobile Number \n5.Password Rule1 \n6.Password Rule2 \n7.Password Rule3 \n8.Password Rule4 \n9.Exit ");
            System.out.println("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    userRegistration.validFirstName();
                    break;
                case 2:
                    userRegistration.validLastName();
                    break;
                case 3:
                    userRegistration.validEmail();
                    break;
                case 4:
                    userRegistration.validMobFormat();
                    break;
                case 5:
                    userRegistration.validPasswordRule1();
                    break;
                case 6:
                    userRegistration.validPasswordRule2();
                    break;
                case 7:
                    userRegistration.validPasswordRule3();
                    break;
                case 8:
                    userRegistration.validPasswordRule4();
                    break;
                case 9:
                    flag = false;
                    System.out.println("Exited Successfully.......");
                    break;
                    default:
                    System.out.println("Invalid Choice.....");
                    break;
            }
        }
    }
}