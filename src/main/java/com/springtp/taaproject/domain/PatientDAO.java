package com.springtp.taaproject.domain;

import com.springtp.taaproject.service.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDAO extends JpaRepository<Patient, Long> {
}
