package com.ceg.hello.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private @Id @GeneratedValue Long id;
    private String studentName;
    private String studentEmail;

    /*
     * public Long getId() {
     * return id;
     * }
     * 
     * public void setId(Long id) {
     * this.id = id;
     * }
     * 
     * public String getStudentName() {
     * return studentName;
     * }
     * 
     * public void setStudentName(String studentName) {
     * this.studentName = studentName;
     * }
     * 
     * public String getStudentEmail() {
     * return studentEmail;
     * }
     * 
     * public void setStudentEmail(String studentEmail) {
     * this.studentEmail = studentEmail;
     * }
     */
}
