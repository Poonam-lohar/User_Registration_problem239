package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner scanner = new Scanner(System.in);

    public void validFirstName() {
        System.out.print("Enter the First Name : ");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();

        if (result)
            System.out.println("First name is valid");
        else
            System.out.println("First name is Invalid");
    }

    public void validLastName() {
        System.out.print("Enter the Last Name : ");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();

        if (result)
            System.out.println("Last name is valid");
        else
            System.out.println("Last name is Invalid");
    }

    public void validEmail() {
        System.out.print("Enter the Email: ");
        String email = scanner.next();
        String regex = "^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();

        if (result)
            System.out.println("Email is valid");
        else
            System.out.println("Email is Invalid");
    }

    public void validMobFormat() {
        System.out.print("Enter Mobile Number : ");
        String mobileNo = scanner.nextLine();
        String regex = "^[0-9]{2}\\s[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNo);
        boolean result = matcher.matches();

        if (result)
            System.out.println("Mobile Number is valid");
        else
            System.out.println("Mobile Number is Invalid");
    }

    public void validPasswordRule1() {
        System.out.print("Enter Password : ");
        String Password = scanner.nextLine();
        String regex = "^[A-Za-z0-9@]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Password);
        boolean result = matcher.matches();

        if (result)
            System.out.println("Password is valid");
        else
            System.out.println("Password is Invalid");
    }

    public void validPasswordRule2() {
        System.out.print("Enter Password : ");
        String Password2 = scanner.nextLine();
        String regex = "^[A-Z]{1}[a-z0-9@]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Password2);
        boolean result = matcher.matches();

        if (result)
            System.out.println("Password is valid");
        else
            System.out.println("Password is Invalid");
    }

    public void validPasswordRule3() {
        System.out.print("Enter Password : ");
        String Password3 = scanner.nextLine();
        String regex = "(?=.*[A-z])(?=.*[0-9])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Password3);
        boolean result = matcher.matches();

        if (result)
            System.out.println("Password is valid");
        else
            System.out.println("Password is Invalid");
    }

    public void validPasswordRule4() {
        System.out.print("Enter Password : ");
        String Password4 = scanner.nextLine();
        String regex = "^(?=.*[A-z])(?=.*[0-9])(?=.*[@#$%^&*()-+=])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Password4);
        boolean result = matcher.matches();

        if (result)
            System.out.println("Password is valid");
        else
            System.out.println("Password is Invalid");
    }

    public void validEmailSamples() {

        System.out.print("Enter Email Sample : ");
        String emailSample = scanner.nextLine();
        String regex = "^(?!.*@.*@)[a-z+_-]+(.[a-z0-9])*@[a-z0-9]+(.[a-z])*.[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailSample);
        boolean result = matcher.matches();

        if (result)
            System.out.println("Email sample is valid");
        else
            System.out.println("Email sample is invalid");
    }

}