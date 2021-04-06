package com.example.whatsapp.Models;

public class Users {
    String profilePic,userName,Password,Email,lastMessage,userId;

    public Users(String profilePic, String userName, String password, String email, String lastMessage, String userId) {
        this.profilePic = profilePic;
        this.userName = userName;
        Password = password;
        Email = email;
        this.lastMessage = lastMessage;
        this.userId = userId;
    }

    public Users(){}

    //Sign Up Constructor
    public Users(String userName, String password, String email) {
        this.userName = userName;
        Password = password;
        Email = email;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
