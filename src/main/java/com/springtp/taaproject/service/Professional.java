package com.springtp.taaproject.service;

import org.springframework.stereotype.Component;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Component
public class Professional extends User implements Serializable {
    @ElementCollection
    private ArrayList<String> AppointmentName = new ArrayList<String>();

    public Professional() {

    }

    public Professional(String login, String pwd) {
        super(login, pwd);
    }

    public Professional(String login, String pwd, ArrayList<String> appointmentName) {
        super(login, pwd);
        this.AppointmentName = appointmentName;
    }

    public ArrayList<String> getAppointmentName() {
        return new ArrayList<String>(this.AppointmentName);
    }

    public void setAppointmentName(ArrayList<String> AppointmentName) {
        this.AppointmentName = AppointmentName;
    }

    public void createAppointment(int date, int duration) {
        Appointment ap = new Appointment(this, date, duration);

    }
}
