package com.company;

public class Main {

    public static void main(String[] args) {
	StudentFactory factory = new ProgrammerStudentFactory();
    Student student = factory.createStudent();

    student.study();
    }
}
