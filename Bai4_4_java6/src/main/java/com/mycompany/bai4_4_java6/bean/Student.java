/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai4_4_java6.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 *
 * @author minhb
 */
public class Student {

    private String email;
    private String fullname;
    private Double marks;
    private Boolean gender;
    private String country;

    public Student(String email, String fullName, Double marks, Boolean gender, String country) {
        this.email = email;
        this.fullname = fullName;
        this.marks = marks;
        this.gender = gender;
        this.country = country;
    }

    public Student() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    

    @JsonIgnore
    public Object[] getArray() {
        return new Object[]{
            getEmail(),
            getFullname(),
            getMarks(),
            getGender(),
            getCountry()
        };
    }
}
