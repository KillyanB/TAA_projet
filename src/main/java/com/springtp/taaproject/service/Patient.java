package com.springtp.taaproject.service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class Patient extends User implements Serializable {

    public Patient() {

    }

    public Patient(String login, String pwd) {
        super(login, pwd);
    }

    @Id
    public Long getId() {
        return super.getId();
    }

    public void setId(Long id) {
        super.setId(id);
    }

    public String getLogin() {
        return super.getLogin();
    }

    public void setLogin(String login) {
        super.setLogin(login);
    }

    public String getPwd() {
        return super.getPwd();
    }

    public void setPwd(String pwd) {
        super.setPwd(pwd);
    }
}
