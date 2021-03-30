package com.company.module2.design;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
  @author   Volodymyr Lakusta
  @project   vsem
  @class  Person
  @version  1.0.0 
  @since 22.03.2021 - 11.40
**/

public class Person {
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate dateOfBirth;
    private String gender;
    private double height;
    private double weight;
    private boolean hasDriverLicence;
    private String nationality;
    private String maritalStatus;
    private boolean hasChild;
    private boolean hasJob;
    private String speakingLanguages;

    public Person(String firstName, String lastName, String patronymic,
                  LocalDate dateOfBirth, String gender, double height,
                  double weight, boolean hasDriverLicence, String nationality,
                  String maritalStatus, boolean hasChild, boolean hasJob, String speakingLanguages) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.hasDriverLicence = hasDriverLicence;
        this.nationality = nationality;
        this.maritalStatus = maritalStatus;
        this.hasChild = hasChild;
        this.hasJob = hasJob;
        this.speakingLanguages = speakingLanguages;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHasDriverLicence() {
        return hasDriverLicence;
    }

    public void setHasDriverLicence(boolean hasDriverLicence) {
        this.hasDriverLicence = hasDriverLicence;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public boolean isHasChild() {
        return hasChild;
    }

    public void setHasChild(boolean hasChild) {
        this.hasChild = hasChild;
    }

    public boolean isHasJob() {
        return hasJob;
    }

    public void setHasJob(boolean hasJob) {
        this.hasJob = hasJob;
    }

    public String getSpeakingLanguages() {
        return speakingLanguages;
    }

    public void setSpeakingLanguages(String speakingLanguages) {
        this.speakingLanguages = speakingLanguages;
    }

    public int age(){
        return (int) ChronoUnit.DAYS.between(dateOfBirth, LocalDate.now());
    }
}
