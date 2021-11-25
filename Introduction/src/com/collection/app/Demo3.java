/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collection.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Olaoluwa
 */
public class Demo3 {
    public static void main(String[] args) {
        List<Integer> age = new ArrayList<>();
        age.add(1);
        age.add(2);
        age.add(4);
        age.add(10);
        age.add(20);
        age.add(6);
        Collections.sort(age);
        System.out.println(Collections.max(age));
        System.out.println(age);
    }
}
