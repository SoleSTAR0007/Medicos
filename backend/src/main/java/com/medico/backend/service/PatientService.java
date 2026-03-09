package com.medico.backend.service;

import com.medico.backend.dto.PatientRequest;
import com.medico.backend.exception.ResourceNotFoundException;
import com.medico.backend.model.Patient;
import com.medico.backend.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

   private final PatientRepository repository;

   public PatientService(PatientRepository repository) {
      this.repository = repository;
   }
    // Register new patient
   public Patient registerPatient(PatientRequest request) {
      Patient patient = new Patient(
               request.getName(),
               request.getEmail(),
               request.getPhone(),
               request.getAddress(),
               request.getAge(),
               request.getGender()
      );
      return repository.save(patient);
   }

    // Get all patients
   public List<Patient> getAllPatients() {
      return repository.findAll();
   }

    // Get patient by ID
   public Patient getPatientById(Long id) {
      return repository.findById(id)
               .orElseThrow(() -> new ResourceNotFoundException("Patient not found with id: " + id));
   }

    // Update patient
   public Patient updatePatient(Long id, PatientRequest request) {
      Patient patient = getPatientById(id);
      patient.setName(request.getName());
      patient.setEmail(request.getEmail());
      patient.setPhone(request.getPhone());
      patient.setAddress(request.getAddress());
      patient.setAge(request.getAge());
      patient.setGender(request.getGender());
      return repository.save(patient);
   }

    // Delete patient
   public void deletePatient(Long id) {
      repository.deleteById(id);
   }
}