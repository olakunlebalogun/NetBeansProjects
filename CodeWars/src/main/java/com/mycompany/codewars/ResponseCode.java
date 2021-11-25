/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codewars;

/**
 *
 * @author Olakunle
 */
public enum ResponseCode {
    Created(201), OK(200), NOT_FOUND(404), SERVER_ERROR(500);

    private final int i;

    private ResponseCode(int i){
        this.i = i;
    }

    public int returnCode(){
     return i;
    }
    
    
    

    
}
