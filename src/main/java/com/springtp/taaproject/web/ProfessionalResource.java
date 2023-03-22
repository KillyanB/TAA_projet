package com.springtp.taaproject.web;

import com.springtp.taaproject.domain.ProfessionalDAO;
import com.springtp.taaproject.service.Appointment;
import com.springtp.taaproject.service.Professional;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfessionalResource {

    private final ProfessionalDAO dao;

    ProfessionalResource(ProfessionalDAO dao) {
        this.dao = dao;
    }

    @GetMapping("/professional/{id}")
    Professional getProfessionalById(@PathVariable Long id) {
        return dao.findById(id).orElse(null);
    }

    @PostMapping("/create")
    Professional createProfessional(@RequestBody Professional newProfessional) {
        return dao.save(newProfessional);
    }

    @DeleteMapping("/delete/{id}")
    void deleteProfessionalById(@PathVariable Long id) {
        dao.deleteById(id);
    }
}
