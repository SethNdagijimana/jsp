/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sms.beans;

import java.io.Serializable;

/**
 *
 * @author hnjej
 */
public class StudentBean implements Serializable {

     private Long id;
    private String email;
    private String password;
    private String fullname;
    private String gender;
    private String age;
    private String contact;
    private String errorMessage;
    private String infoMessage;

    public StudentBean() {
    }

    public StudentBean(Long id, String email, String password, String fullname, String gender, String age, String contact, String errorMessage, String infoMessage) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.fullname = fullname;
        this.gender = gender;
        this.age = age;
        this.contact = contact;
        this.errorMessage = errorMessage;
        this.infoMessage = infoMessage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getInfoMessage() {
        return infoMessage;
    }

    public void setInfoMessage(String infoMessage) {
        this.infoMessage = infoMessage;
    }




    public void clear() {
        this.setFullname(null);
        this.setEmail("");
        this.setGender("");
        this.setAge("");
        this.setContact(contact);
    }

}
