package com.company;/*
  @author   Volodymyr Lakusta
  @project   vsem
  @class  AboutMe
  @version  1.0.0 
  @since 14.03.2021 - 09.14
*/

public class AboutMe {
    public static void main(String[] args) {

        byte age = 21;
        System.out.println("I am " + age + " years old.");

        short yearOfBirth = 1999;
        System.out.println("I was born in " + yearOfBirth);

        int stepsPerDay = 8000;
        System.out.println("I walk " + stepsPerDay + " every day");

        long studentCardNumber = 22356515;
        System.out.println("Student card number: " + studentCardNumber);

        char surnameLetter = 'Y';
        System.out.println("My surname first letter - " + surnameLetter);

        float maxSpeed = 42.1f;
        System.out.println("My max speed: " + maxSpeed);

        double maxJumpHeight = 1.24;
        System.out.println("My max jump height: " + maxJumpHeight);

        boolean driverLicence = true;
        System.out.println("Do you have driver licence: " + driverLicence);
    }
}
