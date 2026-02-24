package com.ceg.hello.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ceg.hello.domain.Student;
import com.ceg.hello.domain.StudentNotFoundException;
import com.ceg.hello.repositories.StudentRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public List<Student> all() {
        return studentRepository.findAll();
    }

    @Override
    @Transactional
    public Student createStudent(Student input) {
        return studentRepository.save(input);
    }

    @Override
    public Student findStudent(Long id) {

        return studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));

    }

}
