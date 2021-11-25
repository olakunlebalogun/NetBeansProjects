/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Olaoluwa
 */
public class Studentdto {
    private String name;
    private String  studentID;
    private String phone;
    private String matric;
    private Double fees;

    public Studentdto(String name, String studentID, String phone, String matric, Double fees) {
        this.name = name;
        this.studentID = studentID;
        this.phone = phone;
        this.matric = matric;
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getMatric() {
        return matric;
    }

    public void setMatric(String matric) {
        this.matric = matric;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }
    
    
    
}
