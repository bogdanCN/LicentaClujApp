package com.neamtu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Neamtu on 1/19/17.
 */
@Entity
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long idUser;


    private String userEmail;
    private String userPassword;
    private String userFirstname;
    private String userLastname;

    public UserModel(long idUser, String userEmail, String userPassword, String userFirstname, String userLastname) {
        this.idUser = idUser;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userFirstname = userFirstname;
        this.userLastname = userLastname;
    }

    public UserModel(){

    }

    public long getIdUser() {
        return idUser;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserFirstname() {
        return userFirstname;
    }

    public String getUserLastname() {
        return userLastname;
    }
}
