/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.services;

import org.springframework.stereotype.Component;

/**
 *
 * @author cyril
 */
public class TestServices {
    private int rnd;
    
    public TestServices(int rnd) {
        this.rnd = rnd;
    }

    public int getRnd() {
        return rnd;
    }

    public void setRnd(int rnd) {
        this.rnd = rnd;
    }
    
    public String format() {
        return "TEST";
    }
    
    public String format(String id) {
        return format() + " for id: " + id;
    }
}
