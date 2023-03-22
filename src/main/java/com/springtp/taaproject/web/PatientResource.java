package com.springtp.taaproject.web;

import com.springtp.taaproject.domain.PatientDAO;
import com.springtp.taaproject.service.Patient;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientResource {

    private final PatientDAO dao;

    PatientResource(PatientDAO dao) {
        this.dao = dao;
    }

    @GetMapping("/patient/{id}")
    Patient getPatientById(@PathVariable Long id) {
        return dao.findById(id).orElse(null);
    }

    @PostMapping("/create")
    Patient createPatient(@RequestBody Patient newPatient) {
        return dao.save(newPatient);
    }

    @PutMapping("/update/{id}")
    Patient updatePatient(@RequestBody Patient newPatient, @PathVariable Long id) {
        return dao.findById(id).map(patient -> {
            patient.setLogin(newPatient.getLogin());
            patient.setPwd(newPatient.getPwd());
            return dao.save(patient);
        }).orElseGet(() -> dao.save(newPatient));
    }

    @DeleteMapping("/delete/{id}")
    void deletePatientById(@PathVariable Long id) {
        dao.deleteById(id);
    }

}
