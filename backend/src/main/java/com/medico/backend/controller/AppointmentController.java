package com.medicare.backend.controller;

import com.medicare.backend.dto.AppointmentRequest;
import com.medicare.backend.model.Appointment;
import com.medicare.backend.service.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

   private final AppointmentService appointmentService;

   public AppointmentController(AppointmentService appointmentService) {
      this.appointmentService = appointmentService;
   }

    // Book appointment
   @PostMapping
   public Map<String, Object> bookAppointment(@RequestBody AppointmentRequest request) {

      Appointment appointment = appointmentService.bookAppointment(
               request.getPatientId(),
               request.getDoctorId(),
               request.getProblem(),
               request.getDate(),
               request.getTime()
      );

      return Map.of(
               "message", "Appointment confirmed",
               "appointmentId", appointment.getId(),
               "status", appointment.getStatus()
      );
   }

    // View appointments of a patient
   @GetMapping("/patient/{patientId}")
   public List<Appointment> getPatientAppointments(@PathVariable Long patientId) {
      return appointmentService.getAppointmentsByPatient(patientId);
   }
}
