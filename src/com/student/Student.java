package com.student;

public class Student {
    private static int ID = 0;
    private String name;
    private String SSN;
    private String courses = "";
    private double balance;
    private static double costOfCourse = 800;
    private String phone;
    private String city;
    private String state;
    private String emailId;
    private String userID;


    Student(String SSN, String name) {
        this.SSN = SSN;
        this.name = name;
        createEmailId(name);
        ID++;
        generateUserID();
        setIdAccount();
    }

    private void generateUserID() {
        int random = (int) Math.random() * 10000;
        userID = ID + random + SSN.substring(SSN.length() - 4);
    }

    private void createEmailId(String name) {
        emailId = name.replace(" ", ".") + "@student.com.uk";
    }

    private void setIdAccount() {
        int idi;
        idi = ID;
        System.out.println(idi);
    }


    public void enroll(String course) {
        this.courses = courses + course + " ";
        this.balance = balance + costOfCourse;
    }

    public void pay(double amount) {

        this.balance = balance - amount;
    }

    public void checkBalance() {
        System.out.println("Balance : " + balance);
    }

    public void showCourses() {
        System.out.println("Your courses are : " + courses);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", SSN='" + SSN + '\'' +
                ", courses='" + courses + '\'' +
                ", balance=" + balance +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", emailId='" + emailId + '\'' +
                ", userID='" + userID + '\'' +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {

        return state;
    }

    public void setState(String state) {

        this.state = state;
    }
}

