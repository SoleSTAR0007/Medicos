package com.medicare.backend.model;

import java.time.LocalDateTime;

public class Appointment {

   private Long id;
   private Long patientId;
   private Long doctorId;
   private String problem;
   private String date;
   private String time;
   private String status;
   private LocalDateTime createdAt;

   public Appointment() {}

   public Appointment(Long id, Long patientId, Long doctorId,
                     String problem, String date, String time) {
      this.id = id;
      this.patientId = patientId;
      this.doctorId = doctorId;
      this.problem = problem;
      this.date = date;
      this.time = time;
      this.status = "CONFIRMED";
      this.createdAt = LocalDateTime.now();
   }

   public Long getId() { return id; }
   public Long getPatientId() { return patientId; }
   public Long getDoctorId() { return doctorId; }
   public String getProblem() { return problem; }
   public String getDate() { return date; }
   public String getTime() { return time; }
   public String getStatus() { return status; }
   public LocalDateTime getCreatedAt() { return createdAt; }
}
