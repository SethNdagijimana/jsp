
package com.stud.model;

import javax.persistence.*;

@Entity
public class StudentJspModel {
    @Id
    @Column(name = "id", unique = true, nullable = false)    
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ORACLE_DB_SEQ_ID")
    private Long id;
    private String email;
    private String password;
    private String fullname;
    private String gender;
    private String age;
    private String contact;

    public StudentJspModel() {
    }

    public StudentJspModel(Long id, String email, String password, String fullname, String gender, String age, String contact) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.fullname = fullname;
        this.gender = gender;
        this.age = age;
        this.contact = contact;
    }

    public StudentJspModel(Long id) {
        this.id = id;
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
  
    
    
    
}
