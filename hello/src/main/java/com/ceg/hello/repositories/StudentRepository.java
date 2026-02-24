package com.ceg.hello.repositories;

import com.ceg.hello.domain.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
