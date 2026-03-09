package com.medico.backend.controller;

import com.medico.backend.dto.PatientRequest;
import com.medico.backend.model.Patient;
import com.medico.backend.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

   private final PatientService patientService;

   public PatientController(PatientService patientService) {
      this.patientService = patientService;
   }

    // Register new patient
   @PostMapping
   public ResponseEntity<Patient> registerPatient(@RequestBody PatientRequest request) {
      Patient patient = patientService.registerPatient(request);
      return new ResponseEntity<>(patient, HttpStatus.CREATED);
   }

    // Get all patients
   @GetMapping
   public ResponseEntity<List<Patient>> getAllPatients() {
      return ResponseEntity.ok(patientService.getAllPatients());
   }

    // Get patient by ID
   @GetMapping("/{id}")
   public ResponseEntity<Patient> getPatientById(@PathVariable Long id) {
      return ResponseEntity.ok(patientService.getPatientById(id));
   }

    // Update patient
   @PutMapping("/{id}")
   public ResponseEntity<Patient> updatePatient(@PathVariable Long id,
                                                @RequestBody PatientRequest request) {
      return ResponseEntity.ok(patientService.updatePatient(id, request));
   }

    // Delete patient
   @DeleteMapping("/{id}")
   public ResponseEntity<String> deletePatient(@PathVariable Long id) {
      patientService.deletePatient(id);
      return ResponseEntity.ok("Patient deleted successfully");
   }
}