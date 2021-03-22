package com.company.module2.inheritance;

import com.company.module2.design.Person;

import java.time.LocalDate;

/**
  @author   Volodymyr Lakusta
  @project   vsem
  @class  Student
  @version  1.0.0 
  @since 22.03.2021 - 12.11
**/

public class Student extends Person {
    private int yearOfStudy;
    private String groupName;
    private String chairName;
    private String majorName;
    private String universityName;
    private long studentCardNumber;
    private boolean isLivingInDorm;
    private boolean isStipendiat;
    private String modeOfStudy; // like full-Time Or part-Time
    private double schoolCertificateScore;
    private String curatorName;
    private boolean isBeneficiary;

    public Student(String firstName, String lastName, String patronymic,
                   LocalDate dateOfBirth, String gender, double height,
                   double weight, boolean hasDriverLicence, String nationality,
                   String maritalStatus, boolean hasChild, boolean hasJob,
                   String speakingLanguages, int yearOfStudy, String groupName,
                   String chairName, String majorName, String universityName,
                   long studentCardNumber, boolean isLivingInDorm, boolean isStipendiat,
                   String modeOfStudy, double schoolCertificateScore, String curatorName, boolean isBeneficiary) {
        super(firstName, lastName, patronymic, dateOfBirth, gender, height, weight,
                hasDriverLicence, nationality, maritalStatus, hasChild, hasJob, speakingLanguages);
        this.yearOfStudy = yearOfStudy;
        this.groupName = groupName;
        this.chairName = chairName;
        this.majorName = majorName;
        this.universityName = universityName;
        this.studentCardNumber = studentCardNumber;
        this.isLivingInDorm = isLivingInDorm;
        this.isStipendiat = isStipendiat;
        this.modeOfStudy = modeOfStudy;
        this.schoolCertificateScore = schoolCertificateScore;
        this.curatorName = curatorName;
        this.isBeneficiary = isBeneficiary;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getChairName() {
        return chairName;
    }

    public void setChairName(String chairName) {
        this.chairName = chairName;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public long getStudentCardNumber() {
        return studentCardNumber;
    }

    public void setStudentCardNumber(long studentCardNumber) {
        this.studentCardNumber = studentCardNumber;
    }

    public boolean isLivingInDorm() {
        return isLivingInDorm;
    }

    public void setLivingInDorm(boolean livingInDorm) {
        isLivingInDorm = livingInDorm;
    }

    public boolean isStipendiat() {
        return isStipendiat;
    }

    public void setStipendiat(boolean stipendiat) {
        isStipendiat = stipendiat;
    }

    public String getModeOfStudy() {
        return modeOfStudy;
    }

    public void setModeOfStudy(String modeOfStudy) {
        this.modeOfStudy = modeOfStudy;
    }

    public double getSchoolCertificateScore() {
        return schoolCertificateScore;
    }

    public void setSchoolCertificateScore(double schoolCertificateScore) {
        this.schoolCertificateScore = schoolCertificateScore;
    }

    public String getCuratorName() {
        return curatorName;
    }

    public void setCuratorName(String curatorName) {
        this.curatorName = curatorName;
    }

    public boolean isBeneficiary() {
        return isBeneficiary;
    }

    public void setBeneficiary(boolean beneficiary) {
        isBeneficiary = beneficiary;
    }
}
