package com.student;

public class StudentTable {
    public static void main(String[] args) {
        Student student = new Student("1234567", "Catalin Volocaru");
        student.setPhone("07497353550");
        student.setCity("Vaslui");
        student.setState("Romanian");
        student.enroll("Math");
        student.pay(600);
        System.out.println(student);

    }
}
