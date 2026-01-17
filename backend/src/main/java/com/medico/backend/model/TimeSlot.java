package com.medico.backend.model;

import jakarta.persistence.*;

@Entity
public class TimeSlot {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private Long doctorId;
    private String slotTime; // "10:00 - 10:30"
   private boolean booked;
   
}
