package com.company;

public class LawStudentFactory implements StudentFactory {

    @Override
    public Student createStudent() {
        return new LawStudent();
    }
}
