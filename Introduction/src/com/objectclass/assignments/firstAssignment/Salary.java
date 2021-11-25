/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objectclass.assignments.firstAssignment;

/**
 *
 * @author Olaoluwa
 */
public class Salary {
    public double salaryAmount;
    
    public Salary(double s){
        this.salaryAmount = s;
    }
    
    public double percentSalary(){
        return this.salaryAmount*21/20;
    }
}
