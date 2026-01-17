package com.medico.backend.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class DoctorAvailability {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private Long doctorId;
   private LocalDate availableDate;

}
