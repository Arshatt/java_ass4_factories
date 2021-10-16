package com.company;

public class ProgrammerStudentFactory implements StudentFactory {

    @Override
    public Student createStudent() {
        return new ProgrammerStudent();
    }
}
