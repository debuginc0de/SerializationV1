package com.java.serializationV1.SerializationV1.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.Instant;

public class User implements Serializable {
    private String Username;
    private Integer UserID;
    private String Password;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Instant dob;


    public User(String Username, Integer UserID, String Password, Instant dob){
        this.Username=Username;
        this.UserID=UserID;
        this.Password=Password;
        this.dob=dob;
    }



    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
    public Instant getDob(){
        return dob;
    }
    public void setDob(Instant Dob){
        dob=Dob;
    }

    @Override
    public String toString() {
        return "User{" +
                "Username='" + Username + '\'' +
                ", UserID=" + UserID +
                ", Password='" + Password + '\'' +
                ", dob=" + dob +
                '}';
    }
}
