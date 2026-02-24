package com.ceg.hello.domain;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(Long id) {
        super("Could not find student with id:" + id);
    }

}
