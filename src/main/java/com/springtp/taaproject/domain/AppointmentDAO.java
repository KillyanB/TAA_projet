package com.springtp.taaproject.domain;

import com.springtp.taaproject.service.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentDAO extends JpaRepository<Appointment, Long> {
}
