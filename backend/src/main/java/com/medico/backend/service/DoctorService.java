package com.medico.backend.service;

import com.medico.backend.model.Doctor;
import com.medico.backend.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

   private final DoctorRepository repository;

   public DoctorService(DoctorRepository repository) {
      this.repository = repository;
   }

    // Get all doctors
   public List<Doctor> getAllDoctors() {
      return repository.findAll();
   }

    // Get doctor by ID
   public Doctor getDoctorById(Long id) {
      return repository.findById(id)
               .orElseThrow(() -> new RuntimeException("Doctor not found with id: " + id));
   }

    // Add new doctor
   public Doctor addDoctor(Doctor doctor) {
      return repository.save(doctor);
   }

    // Delete doctor
   public void deleteDoctor(Long id) {
      repository.deleteById(id);
   }

    // Find by specialization
   public List<Doctor> getDoctorsBySpecialization(String specialization) {
      return repository.findBySpecialization(specialization);
   }
}