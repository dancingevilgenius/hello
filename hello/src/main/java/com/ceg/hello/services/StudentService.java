package com.ceg.hello.services;

import java.util.ArrayList;
import java.util.List;

import com.ceg.hello.domain.Student;

public interface StudentService {

    List<Student> all();

    Student createStudent(Student input);

    Student findStudent(Long id);

}
