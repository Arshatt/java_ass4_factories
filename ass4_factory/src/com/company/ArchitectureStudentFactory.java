package com.company;

public class ArchitectureStudentFactory implements StudentFactory{

    @Override
    public Student createStudent() {
        return new ArchitectureStudent();
    }
}
