/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Olaoluwa
 */
public class Student {
    private String firstname;
    private String lastname;
    private String studentID;
    private String phone;
    private String matricNo;
    private Double fee;

    public Student(String firstname, String lastname, String studentID, String phone, String matricNo, Double fee) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentID = studentID;
        this.phone = phone;
        this.matricNo = matricNo;
        this.fee = fee;
    }

    

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMatricNo() {
        return matricNo;
    }

    public void setMatricNo(String matricNo) {
        this.matricNo = matricNo;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }
    
    
    
    
    
    
}
