package com.abhimantrass.latihanmvc.model;

/**
 * Created by izul on 6/10/16.
 */
public class User {

    private String userName;
    private String userPassword;
    private String userType;

    public User(String userName, String userPassword, String userType) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
