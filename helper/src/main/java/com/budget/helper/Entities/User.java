package com.budget.helper.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "user")
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long user_uid;
    private String user_name;
    private String user_email;
    // TODO: make final and delete setter when no longer using postman
    private String user_password; 
    private final Timestamp user_creation_date;
    private Timestamp user_update_date;


    public User(){
        this.user_creation_date = new Timestamp(System.currentTimeMillis());
        this.user_update_date = new Timestamp(System.currentTimeMillis());
    }
    public User(String name, String email,String password){
        this.user_password = password;
        this.user_name = name;
        this.user_email = email;
        this.user_creation_date = new Timestamp(System.currentTimeMillis());
        this.user_update_date = new Timestamp(System.currentTimeMillis());
    }

    public boolean checkPassword(String passwordToCheck){
        return this.user_password.equals(passwordToCheck);
    }

    public void updateTime(){
        this.user_update_date = new Timestamp(System.currentTimeMillis());
    }

    public void changePassword(String oldPassword, String newPassword){
        if(checkPassword(oldPassword)){
            this.user_password = newPassword;
        }
        updateTime();
    }

    @Override
    public String toString() {
        return String.format(
            "Customer[user_uid=%d, user_name='%s', user_email='%s']",
            user_uid, user_name, user_email);
  }
    
    public Long getUser_uid() {
        return user_uid;
    }
    
    public String getUser_name() {
        return user_name;
    }
    //bad security but it is useful for now
    // public String getUser_password() {
    //     return user_password;
    // }

    public void setUser_name(String name) {
        this.user_name = name;
        updateTime();
    }
    
    public String getUser_email() {
        return user_email;
    }
    
    public Timestamp getUser_creation_date() {
        return user_creation_date;
    }

    public Timestamp getUser_update_date() {
        return user_update_date;
    }


    
}