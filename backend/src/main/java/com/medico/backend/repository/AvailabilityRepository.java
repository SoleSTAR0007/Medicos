package com.medico.backend.repository;

import com.medico.backend.model.DoctorAvailability;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvailabilityRepository extends JpaRepository<DoctorAvailability, Long> {
}
